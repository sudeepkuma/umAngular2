
import { Component,Input } from "@angular/core";
import { IEmployee } from '../../../../models/employee';
import { DatePickerOptions, DateModel } from 'ng2-datepicker';
import {FormGroup,FormControl,Validators,ReactiveFormsModule} from '@angular/forms'
import {InzetService} from '../../../../services/inzet.service'
import { ActivatedRoute, ParamMap } from '@angular/router';

@Component({
    selector:'inzet',
    templateUrl:'inzet.component.html',
    styleUrls: ['inzet.component.css']
})
export class InzetComponent{
    inzetData:FormGroup
    dateSelected:FormControl
    date: any; 
    options: DatePickerOptions;
    setdate:string
    id:string
 
 ngOnInit(){
        this.dateSelected = new FormControl()
        this.inzetData=new FormGroup({
        dateSelected:this.dateSelected             
        })
        this.date={
            formatted:''
        };       
    }
  constructor(private inzetService:InzetService) {   
    this.options = new DatePickerOptions();   
  }  
     @Input() public employe: IEmployee;

        postDate(inzetValues,id){
         this.setdate=   JSON.stringify((inzetValues.dateSelected.formatted))
         this.id=JSON.stringify(id);
         this.inzetService.setInzetaData(this.setdate,this.id);      
        }
  

}