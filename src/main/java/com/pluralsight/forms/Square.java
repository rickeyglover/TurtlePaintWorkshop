package com.pluralsight.forms;

import java.awt.*;

public class Square extends Shape{
    public Square(Turtle turtle, int border, int location, Color color) {
        super(turtle, border, location, color);
    }
    public void makeSquare (int length){
        turtle.setColor(color);
        for (int j = 0; j < 4; j++){
            turtle.forward(length);
            turtle.turnRight(90);
        }
    }
}
