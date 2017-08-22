export class Input {
  private _amount : number;
  private _risk : number;
  private _hash : string;

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

  get hash(): string {
    return this._hash;
  }

  set hash(value: string) {
    this._hash = value;
  }

  toString() {
    return "Input{amount=" + this._amount + ", risk=" + this._risk + ", hash=" + this._hash + "}";
  }

  toJSON() {
    return JSON.stringify({amount: this._amount, risk: this._risk, hash: this._hash});
  }
}
