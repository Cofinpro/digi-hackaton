export class Input {
  private _amount : number;
  private _risk : string;


  get amount(): number {
    return this._amount;
  }

  set amount(value: number) {
    this._amount = value;
  }

  get risk(): string {
    return this._risk;
  }

  set risk(value: string) {
    this._risk = value;
  }

  toString() {
    return "Input{amount=" + this._amount + ", risk = " + this.risk + "}";
  }
}
