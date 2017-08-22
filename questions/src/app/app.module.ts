import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { AmountComponent } from './amount/amount.component';
import { RiskComponent } from './src/app/risk/risk.component';

@NgModule({
  declarations: [
    AppComponent,
    AmountComponent,
    RiskComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
