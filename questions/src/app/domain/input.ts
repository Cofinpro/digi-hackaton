export class Input {
  private _amount : number;
  private _risk : number;


  get amount(): number {
    return this._amount;
  }

  set amount(value: number) {
    this._amount = value;
  }

  get risk(): number {
    return this._risk;
  }

  set risk(value: number) {
    this._risk = value;
  }

  toString() {
    return "Input{amount=" + this._amount + ", risk = " + this.risk + "}";
  }
}
