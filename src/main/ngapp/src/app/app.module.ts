import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';
import {TabsModule} from "ng2-tabs";
import {routing} from './app.routing';

import { AppComponent } from './app.component';
import { EmployeeListComponent } from './home-page/employee-list.component';
import { SettingComponent } from './shared/components/settings/settings.component';
import { AdminComponent } from './shared/components/admin/admin.component';
import { NavBar } from './home-page/nav-bar.component';
import { AlgemeneComponent } from './shared/components/settings/algemene.component';
import {AlgemeenSettingComponent}  from './shared/components/employees/employee_tab/algemeen-setting/Algemeen-setting.component';
import { EmployeeDetailComponent } from './shared/components/employees/employee-detail.component';
import {InzetComponent} from './shared/components/employees/employee_tab/Inzet/inzet.component';

import { EmployeeService } from './shared/services/employee.service';
import { DatePipe } from '@angular/common';

@NgModule({
  declarations: [AppComponent,EmployeeListComponent,EmployeeListComponent, SettingComponent,
                 AdminComponent,NavBar,AlgemeneComponent,EmployeeDetailComponent,AlgemeenSettingComponent,
                 InzetComponent
                ],
  imports: [BrowserModule,FormsModule,HttpModule,routing,TabsModule],
  providers: [EmployeeService,DatePipe],
  bootstrap: [AppComponent]
})
export class AppModule { }
