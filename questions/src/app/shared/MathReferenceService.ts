import {Injectable} from "@angular/core";
@Injectable()
export class MathReferenceService {
  get() {
    return Math;
  }
}
