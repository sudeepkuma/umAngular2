import {Injectable } from '@angular/core';
import { Http,Headers, Response,RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';

@Injectable()
export class InzetService{
    private inzetPost = 'http://localhost:8080/ngapp/rest/employeeService/postttHere';
    startDateTime :string;
    employee_id:string;


 constructor( private http: Http ) { }

     setInzetaData(inzetVandate:string,id:string) {
         this.startDateTime=inzetVandate; 
         this.employee_id=id;
            let  headers = new Headers({
    'Content-Type': 'application/json'
  });
  let options = new RequestOptions({ headers: headers });
  
 let  inzetData= [{inzetdate:this.startDateTime,id:this.employee_id}]
         this.http.post(this.inzetPost,inzetData, options)
            .subscribe()       
         alert("inside service"+this.startDateTime + this.employee_id) 
    }    

}