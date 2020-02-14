package ru.kav.triangle;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Triangle triangle = new Triangle(sc.nextInt(),sc.nextInt(),sc.nextInt());
            triangle.isScalene();
            triangle.isIsosceles();
            triangle.isEquilateral();
            triangle.isRightTriangle();
        } catch (IncorrectTriangle e) {
            System.out.println("Треугольник есть треугольник! Это не треугольник!");
        } catch (InputMismatchException e){
            System.out.println("Неверные данные");
        }
    }
}
