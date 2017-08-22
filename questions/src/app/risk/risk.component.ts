import { Component, OnInit } from '@angular/core';
import {Input} from "../domain/input";
import {InputService} from "../domain/InputService";

@Component({
  selector: 'app-risk',
  templateUrl: './risk.component.html',
  styleUrls: ['./risk.component.css']
})
export class RiskComponent implements OnInit {
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
