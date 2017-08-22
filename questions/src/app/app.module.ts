import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";
import {AppComponent} from "./app.component";
import {RiskComponent} from "./risk/risk.component";
import {Routes, RouterModule} from "@angular/router";
import {PagenotfoundComponent} from "./pagenotfound/pagenotfound.component";
import {AmountComponent} from "./amount/amount.component";

const appRoutes: Routes = [
  { path: '', redirectTo: 'amount', pathMatch: 'full'},
  { path: 'amount', component: AmountComponent },
  { path: 'risk', component: RiskComponent },
  { path: '**', component: PagenotfoundComponent }
];

@NgModule({
  imports: [
    BrowserModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [],
  bootstrap: [AppComponent],
  declarations: [AppComponent, AmountComponent, RiskComponent, PagenotfoundComponent]
})
export class AppModule { }
