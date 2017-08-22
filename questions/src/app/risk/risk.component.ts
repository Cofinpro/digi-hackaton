import { Component, OnInit } from '@angular/core';
import {Input} from "../shared/input";
import {InputService} from "../shared/InputService";

@Component({
  selector: 'app-risk',
  templateUrl: './risk.component.html',
  styleUrls: ['./risk.component.css']
})
export class RiskComponent implements OnInit {
  private input : Input;

  constructor(private inputService : InputService) {}

  ngOnInit() {
    this.input = this.inputService.input;
  }

  save() {
    this.inputService.input = this.input;
  }

  setRisk(risk : number) {
    this.input.risk = risk;
  }
}
