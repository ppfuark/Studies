import { CommonModule } from '@angular/common';
import { Component } from '@angular/core';

@Component({
  selector: 'app-diretivas',
  imports: [CommonModule],
  templateUrl: './diretivas.component.html',
  styleUrl: './diretivas.component.css'
})
export class DiretivasComponent {
  show:boolean = true;

  setShow(){ 
    if (this.show === true){
      this.show = false;
    }else{
      this.show = true
    }
  }
}
