import {Input} from "./input";
export class InputService {
  private _input : Input = new Input();

  get input(): Input {
    return this._input;
  }

  set input(value: Input) {
    this._input = value;
  }


}
