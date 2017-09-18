import {Injectable } from '@angular/core';
import { Http, Response } from '@angular/http';
import { IEmployee } from '../models/employee';
import { Observable } from 'rxjs/Observable';
import 'rxjs/add/operator/toPromise';
import {Observer} from 'rxjs/Observer';
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';


@Injectable()
export class EmployeeService {
    employees: IEmployee[];
    detailOfEmployee: IEmployee;
    private employeesUrl = 'http://localhost:8080/ngapp/rest/employeeService/listOfEmployees';

    constructor( private http: Http ) { }
    
    getEmployees(): Observable<IEmployee[]> {
        return this.http.get( this.employeesUrl )
            .map(( response: Response ) => {
                this.employees = response.json();
                return this.employees;
            })
            .catch( this.handleError );
    }
    


   getEmployee(Id: number): Observable<IEmployee> {
        if (this.employees) {

            //filter using cached data
            return this.findEmployeeObservable(Id);
        } 
    }
 
    private findEmployeeObservable(id: number): Observable<IEmployee> {
        return this.createObservable(this.filterEmployees(id));
    }
 
    private filterEmployees(id: number): IEmployee {
        const custs = this.employees.filter((cust) => cust.Id === id );
        alert("cu"+custs[0]);
        return (custs.length) ? custs[0] : null;
    }
 
    private createObservable(data: any): Observable<any> {
        return Observable.create((observer: Observer<any>) => {
            observer.next(data);
            observer.complete();
        });
    }

    private handleError( error: any ) {
        return Observable.throw( error.json().error || 'Server error' );
    }
    
    }