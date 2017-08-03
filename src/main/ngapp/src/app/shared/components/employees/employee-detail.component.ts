import { Component,OnInit } from '@angular/core';
import {EmployeeService} from '../../services/employee.service';
import { ActivatedRoute, ParamMap } from '@angular/router';
import 'rxjs/add/operator/switchMap';
import { IEmployee } from '../../models/employee';

@Component({
  selector: 'employee-detail',
  templateUrl: 'employee-detail.component.html'

})

export class EmployeeDetailComponent implements OnInit{
  employee:IEmployee;
  private sub: any;
  errorMessage: string;
    constructor(
    private employeeService:EmployeeService ,
    private route: ActivatedRoute,
  
  ) {}
   ngOnInit(): void {
        this.sub = this.route.params.subscribe(
            params => {
                let id = +params['Id'];
                this.getEmployee(id);
            });
    }
 
    getEmployee(id: number) {
        this.employeeService.getEmployee(id).subscribe(
            employee => this.employee = employee,
            error => this.errorMessage = <any>error);
    }
}