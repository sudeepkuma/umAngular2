import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule } from '@angular/router';
import { HttpModule } from '@angular/http';
import {TabsModule} from "ng2-tabs";

import {routing} from './app.routing';

import { AppComponent } from './app.component';
import { EmployeeListComponent } from './home-page/employee-list.component';
import { SettingComponent } from './shared/components/settings/settings.component';
import { AdminComponent } from './shared/components/admin/admin.component';
import { NavBar } from './home-page/nav-bar.component';
import { AlgemeneComponent } from './shared/components/settings/settings_tab/algemene.component';
import { SignaleringenComponent } from './shared/components/settings/settings_tab/signaleringen.component';
import { temporaryUnitmanagerComponent } from './shared/components/settings/settings_tab/temporaryUnitmanager.component';

import { EmployeeService } from './shared/services/employee.service';
import { EmployeeDetailComponent } from './shared/components/employees/employee-detail.component';

@NgModule({
  declarations: [AppComponent,EmployeeListComponent,EmployeeListComponent,
                 SettingComponent, AdminComponent,NavBar,EmployeeDetailComponent,
                 AlgemeneComponent,SignaleringenComponent,temporaryUnitmanagerComponent],
  imports: [BrowserModule,FormsModule,HttpModule,routing,TabsModule],
  providers: [EmployeeService],
  bootstrap: [AppComponent]
})
export class AppModule { }
