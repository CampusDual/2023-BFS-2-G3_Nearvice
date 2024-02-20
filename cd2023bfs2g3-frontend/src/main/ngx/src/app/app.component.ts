import { Component } from '@angular/core';
import { Util } from 'ontimize-web-ngx';
import { Router } from '@angular/router';

@Component({
  selector: 'o-app',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  constructor(
    private router: Router
  ) {
    if(window['__ontimize'] !== undefined && window['__ontimize']['redirect'] !== undefined) {
      let redirectTo = window['__ontimize']['redirect'];
      window['__ontimize']['redirect'] = undefined;
      this.router.navigate([redirectTo]);
    }
  }

}
