
import { Component,Input,LOCALE_ID} from "@angular/core";
import { IEmployee } from '../../../../models/employee';
import {Inzet} from '../../../../models/Inzet'
import { DatePickerOptions, DateModel } from 'ng2-datepicker';
import {FormGroup,FormControl,Validators,ReactiveFormsModule} from '@angular/forms'
import {InzetService} from '../../../../services/inzet.service'
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({
    selector:'inzet',
    providers:[{provide:LOCALE_ID,
                useValue:"nl-NL"}],
    templateUrl:'inzet.component.html',
    styleUrls: ['inzet.component.css']
})
export class InzetComponent{
    inzetData:FormGroup
    dateSelected:FormControl
    dateInzetTot:FormControl
    date: any; 
    dateTot:any;
    inzetTot:string
    options: DatePickerOptions;
    setdate:string;
    id:string;
    inzetId:number
    inzet:IEmployee;
    inn:Inzet;
   
    errorMessage: string;
    employeeId:number;
   @Input() public employe: IEmployee;

constructor(private inzetService:InzetService ,private route :ActivatedRoute) {   
    this.options = new DatePickerOptions();   
    this.inzet = this.employe;
    
  } 
 ngOnInit(){
        this.dateSelected = new FormControl()
        this.dateInzetTot = new FormControl()
        this.inzetData=new FormGroup({
        dateSelected:this.dateSelected , 
        dateInzetTot:this.dateInzetTot
        })
        this.date={
            formatted:''
        };   
        this.dateTot={
            formatted:''
        };  
        
        this.route.params.subscribe(
            params => {
                 this.inzetId = +params['Id'];
                 
            });
        this.inzetService.getInzetData(this.inzetId).subscribe(  
            inn => this.inn = inn,
            error =>  this.errorMessage = <any>error)
            alert('data in service is'+ this.inn.Client_Name);  
    }
    postDate(inzetValues,id){
         this.setdate=JSON.stringify((inzetValues.dateSelected.formatted))
         this.inzetTot=JSON.stringify((inzetValues.dateInzetTot.formatted))
         this.id=JSON.stringify(id);
         alert("data is "+ this.setdate + this.inzetTot + this.id)
         this.inzetService.setInzetaData(this.setdate,this.inzetTot,this.id);      
        }


}