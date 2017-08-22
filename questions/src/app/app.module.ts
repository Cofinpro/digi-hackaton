import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";
import { FormsModule } from "@angular/forms";
import {AppComponent} from "./app.component";
import {RiskComponent} from "./risk/risk.component";
import {Routes, RouterModule, RouterOutlet} from "@angular/router";
import {PagenotfoundComponent} from "./pagenotfound/pagenotfound.component";
import {AmountComponent} from "./amount/amount.component";
import {InputService} from "./domain/InputService";

const appRoutes: Routes = [
  { path: '', redirectTo: 'amount', pathMatch: 'full'},
  { path: 'amount', component: AmountComponent },
  { path: 'risk', component: RiskComponent },
  { path: '**', component: PagenotfoundComponent }
];

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    RouterModule.forRoot(
      appRoutes,
      { enableTracing: true } // <-- debugging purposes only
    )
  ],
  providers: [InputService],
  bootstrap: [AppComponent],
  declarations: [AppComponent, AmountComponent, RiskComponent, PagenotfoundComponent]
})
export class AppModule { }
