import {Component,Input} from '@angular/core';
import { IEmployee } from '../../../../models/employee';

@Component({
  selector: 'algemeen',

  templateUrl: 'algemeen-setting.component.html',
  styleUrls: ['./algemeen-setting.component.css']


})
export class AlgemeenSettingComponent{
 @Input() public employe: IEmployee;
}