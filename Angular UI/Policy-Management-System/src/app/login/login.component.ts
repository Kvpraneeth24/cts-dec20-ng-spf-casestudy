import { Component, OnInit } from '@angular/core';
import { PolicyService} from '../policy.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent  {

  username : string = undefined;
  password : string = undefined;

  constructor(private _service : PolicyService,private _router : Router) { }

  handleLogin(loginValues : any){
  
    let loggedIn = this._service.login(loginValues.username,loginValues.password);
    if(loggedIn){
      this._router.navigate(["details"]);
    }
    else
      this._router.navigate(["login"]);
  }
}
    //this._service
    //.authenticate(loginValues.username,loginValues.password)
    //.subscribe(response =>{
    //console.log(response);
    //if(response.username != undefined){
     // this._router.navigate(["success",loginValues.username]);
  //});
  //}  

