import { Component } from '@angular/core';
import { EmployeeListComponent } from './home-page/employee-list.component';

@Component( {
    selector: 'pm-app',
    
    templateUrl: './app.component.html'
    
    
})

export class AppComponent {
    pageTitle: string = 'UM DASHBOARD';
    
}