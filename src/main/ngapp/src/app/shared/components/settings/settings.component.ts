import { Component, ContentChildren, QueryList} from '@angular/core';
import { AlgemeneComponent } from './settings_tab/algemene.component';
import { SignaleringenComponent } from './settings_tab/signaleringen.component';
import { temporaryUnitmanagerComponent } from './settings_tab/temporaryunitmanager.component';

@Component( {
    selector: 'settings',
    templateUrl: './settings.component.html'
})

export class SettingComponent {
    settings: string = 'Instellingen';
    
    
}