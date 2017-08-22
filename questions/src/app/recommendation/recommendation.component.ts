import { Component, OnInit } from '@angular/core';
import {InputService} from "../shared/InputService";
import {Input} from "../shared/input";
import {LocalStorageService, KEY_HASH} from "../shared/LocalStorageService";

@Component({
  selector: 'app-recommendation',
  templateUrl: './recommendation.component.html',
  styleUrls: ['./recommendation.component.css']
})
export class RecommendationComponent implements OnInit {
  private input : Input;
  private inputService : InputService;
  private localStorageService : LocalStorageService;

  constructor(inputService : InputService, localStorageService : LocalStorageService) {
    this.inputService = inputService;
    this.localStorageService = localStorageService;
  }

  ngOnInit() {
    this.input = this.inputService.input;

    let localStorage = this.localStorageService.get();
    this.input.hash = localStorage.getItem(KEY_HASH);
  }
}
