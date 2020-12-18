import { Component, OnInit } from '@angular/core';
import { PolicyService } from '../policy.service';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent  {

  username : string = undefined;
  lastname : string = undefined;
  dob      : Date   = undefined;
  address  : string = undefined;
  contact  : number = undefined;
  mail    : string = undefined;
  pass     : string = undefined;
 
  message : any;

  constructor(private _service : PolicyService) { }

  save(formValues : any){
    let resp =  this._service.doRegistration(formValues);
    resp.subscribe((data) =>this.message = data);
  }


  

}
