package com.pluralsight.forms;

import java.awt.*;

public class Circle extends Shape {
    public Circle(Turtle turtle, int border, int location, Color color) {
        super(turtle, border, location, color);
    }
    public void makeCircle(int radius){
        int sides = 360;
        int angle = 360 / sides;
        turtle.setColor(color);
        for(int i = 0; i < sides; i++){
            turtle.forward(radius);
            turtle.turnRight(angle);
        }
    }
}
