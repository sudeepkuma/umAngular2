
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
     date: DateModel; 
     options: DatePickerOptions;
     data:string
 
 ngOnInit(){
        this.dateSelected = new FormControl()
        this.inzetData=new FormGroup({
        dateSelected:this.dateSelected        
        })
    }

  constructor(private inzetService:InzetService) {
      
    this.options = new DatePickerOptions();
    this.options.format="DD.MM.YYYY";
    
  }
    
     @Input() public employe: IEmployee;

        handle(inzetValues){
         this.data =JSON.stringify(inzetValues.dateSelected)
            this.inzetService.callMe(this.data);
         //alert('Your date is '+  this.data)
           
        }
  

}