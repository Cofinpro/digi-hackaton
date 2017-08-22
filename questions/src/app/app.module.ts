import {BrowserModule} from "@angular/platform-browser";
import {NgModule} from "@angular/core";
import { FormsModule } from "@angular/forms";
import {AppComponent} from "./app.component";
import {RiskComponent} from "./risk/risk.component";
import {Routes, RouterModule} from "@angular/router";
import {PagenotfoundComponent} from "./pagenotfound/pagenotfound.component";
import {AmountComponent} from "./amount/amount.component";
import {InputService} from "./shared/InputService";
import { RecommendationComponent } from './recommendation/recommendation.component';
import {LocalStorageService} from "./shared/LocalStorageService";
import {HashService} from "./shared/HashService";
import {MathReferenceService} from "./shared/MathReferenceService";

const appRoutes: Routes = [
  { path: '', redirectTo: 'amount', pathMatch: 'full'},
  { path: 'amount', component: AmountComponent },
  { path: 'risk', component: RiskComponent },
  { path: 'recommendation', component: RecommendationComponent },
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
  providers: [InputService, MathReferenceService, LocalStorageService, HashService],
  bootstrap: [AppComponent],
  declarations: [AppComponent, AmountComponent, RiskComponent, PagenotfoundComponent, RecommendationComponent]
})
export class AppModule { }
