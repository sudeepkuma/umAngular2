import { ModuleWithProviders } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { EmployeeListComponent } from './home-page/employee-list.component';
import { Component } from '@angular/core';
import { AppComponent } from './app.component';
import { SettingComponent } from './shared/components/settings/settings.component';
import { AdminComponent } from './shared/components/admin/admin.component';
import { AlgemeneComponent } from './shared/components/settings/algemene.component';
import { EmployeeDetailComponent } from './shared/components/employees/employee-detail.component';


const appRoutes: Routes = [

    {
        path: 'details/:Id',
        component: EmployeeDetailComponent
    },
    {
        path: '',
        redirectTo: '/home',
        pathMatch: 'full'
    },
    {
        path: 'settings',
        component: SettingComponent
    },
    {
        path: 'home',
        component: EmployeeListComponent
    },
    {
        path: 'admin',
        component: AdminComponent
    },
    {
        path: 'algemene',
        component: AlgemeneComponent
    }

];

export const routing: ModuleWithProviders = RouterModule.forRoot( appRoutes );