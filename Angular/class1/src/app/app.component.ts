import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FirstComponentComponent } from './first-component/first-component.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FirstComponentComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'class1';
}
