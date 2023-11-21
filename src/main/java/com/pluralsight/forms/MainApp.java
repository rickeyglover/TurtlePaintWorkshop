package com.pluralsight.forms;

import java.awt.*;
import java.util.Scanner;
public class MainApp {
    public static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        int location = 0;
        int border = 0;
        Color color = null;
        World world = new World(2500, 2500);
        Turtle turtle = new Turtle(0, 0, world);
        turtle.setDelay(.000001);

        do {
            System.out.print("Welcome to your Shape Menu\n1. Add Shape\n2. Save Image\n0. Exit");
            System.out.println();
            String userChoice = myScanner.nextLine();
            switch (userChoice) {
                case "1":
                    System.out.print("1. Square\n2. Triangle\n3. Circle");
                    System.out.println();
                case "2":
                    break;
                case "0":
                    System.out.println("See you next time!");
                    System.exit(0);
            }
            String userInput = myScanner.nextLine();
            Color userColor = whatColor();
            switch (userInput) {
                case "1":
                    Square square = new Square(turtle, location, border, userColor);
                    System.out.println("What is the width");
                    int userWidth = myScanner.nextInt();
                    myScanner.nextLine();
                    whatPosition(turtle);
                    square.makeSquare(userWidth);
                    break;
                case "2":
                    Triangle triangle = new Triangle(turtle, location, border, userColor);
                    triangle.setColor(userColor);
                    System.out.println("What is the width");
                    int userSide = myScanner.nextInt();
                    whatPosition(turtle);
                    triangle.makeTriangle(userSide);
                    break;
                case "3":
                    Circle circle = new Circle(turtle, location, border, userColor);
                    System.out.println("What is the radius?");
                    int userRadius = myScanner.nextInt();
                    whatPosition(turtle);
                    circle.makeCircle(userRadius);
                    break;

                default:
                    System.out.println("Invalid Option, Try Again");

            }
        }
        while (true);
    }
    public static Color whatColor() {
        System.out.println("What color do you want your shape? Red, Green, Blue, or Black ");
        String userColor = myScanner.nextLine();

        switch (userColor.toLowerCase()) {
            case "red":
                return Color.RED;
            case "green":
                return Color.GREEN;
            case "blue":
                return Color.BLUE;
            case "black":
                return Color.BLACK;
            default:
                System.out.println("Invalid color, try again");
        }   return whatColor();
    }
    public static void whatPosition(Turtle turtle){
        System.out.println("Where will the shape be located? (x,y) ");
        String userPoint = myScanner.nextLine();
        String [] userPoints = userPoint.split(",");
        if(userPoints.length == 2){
            double x = Double.parseDouble(userPoints[0].trim());
            double y = Double.parseDouble(userPoints[1].trim());
            turtle.penUp();
            turtle.goTo(x,y);
            turtle.penDown();
        } else {
            System.out.println("Invalid input, two digits split by a comma!");
        }
    }

}
