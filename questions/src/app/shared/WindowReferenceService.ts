import {Injectable} from "@angular/core";
@Injectable()
export class WindowReferenceService {
  get() {
    return window;
  }
}
