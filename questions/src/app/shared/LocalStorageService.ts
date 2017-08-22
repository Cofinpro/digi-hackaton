import {Injectable} from "@angular/core";
@Injectable()
export class LocalStorageService {

  get() {
    return window.localStorage;
  }
};

export const KEY_HASH : string = "HASH";
