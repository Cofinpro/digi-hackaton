import { Component, OnInit } from '@angular/core';
import {InputService} from "../domain/InputService";
import {Input} from "../domain/input";

@Component({
  selector: 'app-recommendation',
  templateUrl: './recommendation.component.html',
  styleUrls: ['./recommendation.component.css']
})
export class RecommendationComponent implements OnInit {
  private input : Input;
  private inputService : InputService;

  constructor(inputService : InputService) {
    this.inputService = inputService;
  }

  ngOnInit() {
    this.input = this.inputService.input;
  }
}
