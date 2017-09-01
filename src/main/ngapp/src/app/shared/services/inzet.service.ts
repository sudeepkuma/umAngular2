import {Injectable } from '@angular/core';


@Injectable()
export class InzetService{

    data :string;

     callMe(dataIs:string) {
         this.data=dataIs;         
         alert("inside service"+this.data)
     
      
    }    

}