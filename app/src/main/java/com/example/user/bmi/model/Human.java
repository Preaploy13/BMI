package com.example.user.bmi.model;


public class Human {
       private Human Height = new Human();
       private Human Weight = new Human();
       private double sum = 0;
public String getBmi() {
      Height = (Height/100);
      sum = Weight/(Height*Height);

}

}
