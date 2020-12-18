import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { RegisterComponent } from './register/register.component';
import { FormsModule } from '@angular/forms';
import { LoginComponent } from './login/login.component';
import { Routes,RouterModule } from '@angular/router';
import { PolicyDetailsComponent } from './policy-details/policy-details.component';
import { HttpClientModule } from '@angular/common/http';


let routes : Routes = [
  { path : "",component : LoginComponent},
  { path : "login", component : LoginComponent},
  { path : "register", component : RegisterComponent},
  { path : "details", component : PolicyDetailsComponent}
  ]

@NgModule({
  declarations: [
    AppComponent,
    RegisterComponent,
    LoginComponent,
    PolicyDetailsComponent
  ],
  imports: [
    BrowserModule,FormsModule,HttpClientModule,RouterModule.forRoot(routes),
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
