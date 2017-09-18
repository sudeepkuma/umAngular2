import {Injectable } from '@angular/core';
import { Http,Headers, Response,RequestOptions } from '@angular/http';
import { Observable } from 'rxjs/Observable';
import {Inzet} from '../models/Inzet'
@Injectable()
export class InzetService{
    private inzetPost = 'http://localhost:8080/ngapp/rest/employeeService/postttHere';
    private inzetGet = 'http://localhost:8080/ngapp/rest/employeeService/inzet/';
    startDateTime :string;
    employee_id:string;
    inzetTot:string;
    inzet:Inzet[];
 constructor( private http: Http ) { }

    setInzetaData(inzetVandate:string,inzetTot:string,id:string){
         this.startDateTime=inzetVandate; 
         this.employee_id=id;
         this.inzetTot=inzetTot
            let  headers = new Headers({
                'Content-Type': 'application/json'
            });
    let options = new RequestOptions({ headers: headers });
  
    let  inzetData= [{inzetdate:this.startDateTime,inzetTot:this.inzetTot,id:this.employee_id}]
         this.http.post(this.inzetPost,inzetData, options)
                  .subscribe()       
         alert("inside service"+this.startDateTime + this.employee_id) 
    } 
        
    getInzetData(id:number):Observable<Inzet> {   
        
        return  this.http.get(this.inzetGet+id)
                         .map((response : Response) => 
                         {
                            this.inzet = response.json();
                            return this.inzet;
                         }).catch(this.handleError);
    }


   private handleError( error: any ) {
        return Observable.throw( error.json().error || 'Server error' );
    }
            
}