import {Component, OnInit} from '@angular/core';
import {InputService} from "../shared/InputService";
import {Input} from "../shared/input";
import {LocalStorageService, KEY_HASH} from "../shared/LocalStorageService";
import {HttpClient, HttpHeaders} from "@angular/common/http";
import {WindowReferenceService} from "../shared/WindowReferenceService";

@Component({
  selector: 'app-recommendation',
  templateUrl: './recommendation.component.html',
  styleUrls: ['./recommendation.component.css']
})
export class RecommendationComponent implements OnInit {
  private input: Input;

  constructor(private inputService: InputService, private localStorageService: LocalStorageService, private http: HttpClient, private windowReferenceService: WindowReferenceService) {
  }

  ngOnInit() {
    this.input = this.inputService.input;

    let localStorage = this.localStorageService.get();
    this.input.hash = localStorage.getItem(KEY_HASH);
  }

  register() {
    console.log("Schicke POST-Request zu http://registration:8080/api/depot");
    let headers = new HttpHeaders().set("Accept", "application/json").set("Content-Type", "application/json");
    this.http.post(
      "http://registration:8080/api/depot",
      this.input.toJSON(),
      {headers: headers, observe: 'response'}
    ).subscribe(response => {
      let targetLocation = response.headers.get('Location');
      console.log("Received redirect target: " + targetLocation);
      console.log(response);
      console.log(response.headers);
      window.location.href = targetLocation;
    });
  }
}
