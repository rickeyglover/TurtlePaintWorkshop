package com.pluralsight.forms;

import java.awt.*;

public class Triangle extends Shape{
    public Triangle (Turtle turtle, int location, int border, Color color){
        super(turtle, location, border, color);
    }
    public void makeTriangle (int sideLength){
        turtle.setColor(color);
        for(int j = 0; j < 3; j++){
            turtle.forward(sideLength);
            turtle.turnRight(120);
        }
    }
}
