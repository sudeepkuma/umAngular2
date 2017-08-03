import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { IEmployee } from '../shared/models/employee';
import { EmployeeService } from '../shared/services/employee.service';

import 'rxjs/add/operator/toPromise';

@Component( {
    selector: 'emp-list',
    templateUrl: './employee-list.component.html'
})

export class EmployeeListComponent implements OnInit {
    pageTitle: string = 'List Of Employees ';
    employee : IEmployee[];
    errorMessage : string;
    
    constructor( private _employeeService: EmployeeService ) { }

    ngOnInit(): void {
        
        this._employeeService.getEmployees()
                  .subscribe(
                   employee => this.employee = employee,
                    error =>  this.errorMessage = <any>error);
                    
 }


}
