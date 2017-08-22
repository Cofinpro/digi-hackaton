import { Component, OnInit } from '@angular/core';
import {InputService} from "../shared/InputService";
import {Input} from "../shared/input";
import {LocalStorageService, KEY_HASH} from "../shared/LocalStorageService";
import {HttpClient, HttpHeaders} from "@angular/common/http";

@Component({
  selector: 'app-recommendation',
  templateUrl: './recommendation.component.html',
  styleUrls: ['./recommendation.component.css']
})
export class RecommendationComponent implements OnInit {
  private input : Input;

  constructor(private inputService : InputService, private localStorageService : LocalStorageService, private http : HttpClient) {}

  ngOnInit() {
    this.input = this.inputService.input;

    let localStorage = this.localStorageService.get();
    this.input.hash = localStorage.getItem(KEY_HASH);
  }

  register() {
    console.log("Registering... --> 172.29.21.197:8161/api/message/digimon?type=queue");
    console.log("Schicke folgenden JSON-Body: " + this.input.toJSON());
    let authString = "Basic " + btoa("admin:admin");
    console.log("Base64-Encoded Auth: " + authString);
    let headers = new HttpHeaders().set("Accept", "application/json").set("Content-Type", "application/json");
    this.http.post("http://localhost:8080/api/depot", this.input.toJSON(), {headers: headers}).subscribe((data) => {
      console.log(data);
    });
    /*this.http.post("http://admin:admin@172.29.21.197:8161/api/message?destination=queue://digi.angular", this.input.toJSON()).subscribe((data) => {
      console.log(data);
    })*/
  }
}
