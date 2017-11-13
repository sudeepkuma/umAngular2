import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule,ReactiveFormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';
import {TabsModule} from "ng2-tabs";
import {routing} from './app.routing';
import { NgbModule } from '@ng-bootstrap/ng-bootstrap';
import { DatePickerModule } from 'ng2-datepicker';

import { AppComponent,EmployeeListComponent,SettingComponent,AdminComponent,NavBar,
        AlgemeenSettingComponent,AlgemeneComponent,SignaleringenComponent,temporaryUnitmanagerComponent,
        EmployeeDetailComponent,InzetComponent,PlanningComponent,EmployabilityComponent
        } from './index';

import { EmployeeService, } from './shared/services/employee.service';
import { InzetService } from './shared/services/inzet.service';
import { DatePipe } from '@angular/common';


@NgModule({
  declarations: [AppComponent,EmployeeListComponent,EmployeeListComponent, SettingComponent,
                 AdminComponent,NavBar,AlgemeneComponent,EmployeeDetailComponent,AlgemeenSettingComponent,
                 InzetComponent,SignaleringenComponent,temporaryUnitmanagerComponent,PlanningComponent,
                 EmployabilityComponent
                ],
  imports: [BrowserModule,FormsModule,HttpModule,routing,TabsModule,ReactiveFormsModule,NgbModule.forRoot(),DatePickerModule],
  providers: [EmployeeService,DatePipe,InzetService],
  
  bootstrap: [AppComponent]
})
export class AppModule { }
