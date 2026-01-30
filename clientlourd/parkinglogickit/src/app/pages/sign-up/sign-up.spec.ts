import { ComponentFixture, TestBed } from '@angular/core/testing';

import { signUp } from './sign-up';

describe('SignUp', () => {
  let component: signUp;
  let fixture: ComponentFixture<signUp>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [signUp],
    }).compileComponents();

    fixture = TestBed.createComponent(signUp);
    component = fixture.componentInstance;
    await fixture.whenStable();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
