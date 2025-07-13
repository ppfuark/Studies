import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { FirstComponentComponent } from './first-component/first-component.component';
import { EventBindingComponent } from './event-binding/event-binding.component';

@Component({
  selector: 'app-root',
  imports: [RouterOutlet, FirstComponentComponent, EventBindingComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'class1';
}
