import { Component } from '@angular/core';
import {HashService} from "./shared/HashService";
import {LocalStorageService, KEY_HASH} from "./shared/LocalStorageService";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';

  private hashService : HashService;
  private localStorageService : LocalStorageService;


  constructor(hashService: HashService, localStorageService: LocalStorageService) {
    this.hashService = hashService;
    this.localStorageService = localStorageService;
  }

  ngOnInit() {
    let localStorage = this.localStorageService.get();

    // Hash not yet saved in LocalStorage
    if (localStorage.getItem(KEY_HASH) == null) {
      localStorage.setItem(KEY_HASH, this.hashService.generate().toString());
    }
  }
}
