import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PolicyService {

  constructor(private _http : HttpClient) { }

  

  login(username: string ,password : string ) : boolean{
    if((username == "kvp" || username == "hjk") && password == "angular"){
      return true;
    }else{
      return false;
    }
  }

  public doRegistration(values : any){
    let uri="http://localhost:8080/policy";
    return this._http.post(uri, values,{responseType : 'text' as 'json'});
  }
}
