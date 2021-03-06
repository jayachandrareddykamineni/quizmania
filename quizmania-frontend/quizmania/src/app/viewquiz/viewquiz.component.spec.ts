import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewQuizComponent } from './viewquiz.component';

describe('viewquizComponent', () => {
  let component: ViewQuizComponent;
  let fixture: ComponentFixture<ViewQuizComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ViewQuizComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ViewQuizComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
