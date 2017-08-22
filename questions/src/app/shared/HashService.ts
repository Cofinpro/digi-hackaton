import {MathReferenceService} from "./MathReferenceService";
import {Injectable} from "@angular/core";

@Injectable()
export class HashService {
  private mathReferenceService : MathReferenceService;

  constructor(mathReferenceService : MathReferenceService) {
    this.mathReferenceService = mathReferenceService;
  }

  generate() {
    let _math = this.mathReferenceService.get();
    return _math.ceil(_math.random() * 1000000);
  }
}
