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
    let headers = new HttpHeaders().set("Accept", "application/json").set("Content-Type", "application/json");
    this.http.post(
      "http://localhost:8080/api/depot",
      this.input.toJSON(),
      {headers: headers, observe: 'response'}
    ).subscribe(response => {
      window.location.href = response.headers['Location'];
    });
  }
}
