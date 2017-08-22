import { Component, OnInit } from '@angular/core';
import {InputService} from "../domain/InputService";
import {Input} from "../domain/input";

@Component({
  selector: 'app-amount',
  templateUrl: './amount.component.html',
  styleUrls: ['./amount.component.css']
})
export class AmountComponent implements OnInit {
  private input : Input;
  private inputService : InputService;

  constructor(inputService : InputService) {
    this.inputService = inputService;
  }

  ngOnInit() {
    this.input = this.inputService.input;
  }

  save() {
    this.inputService.input = this.input;
  }
}
