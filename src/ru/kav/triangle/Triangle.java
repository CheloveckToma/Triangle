package ru.kav.triangle;

public class Triangle {

    private int a, b, c;

    public Triangle(int a, int b, int c) throws IncorrectTriangle {
        this.a = a;
        this.b = b;
        this.c = c;
        isDataCorrect();
    }


    public boolean isDataCorrect() throws IncorrectTriangle {
        if (!(a + b > c) || !(b + c > a) || !(c + a > b) || ((a <= 0) && (b <= 0) && (c <= 0))) {
            throw new IncorrectTriangle();
        }
        return true;
    }

    public boolean isScalene() { //неравносторонний
        if (!((a == c) && (b == c))) {
            System.out.println("Треугольник неравносторонний");
            return true;
        }
        return false;
    }

    public boolean isIsosceles() {//равнобедренный
        if ((a == b) || (b == c) || (c == a)) {
            System.out.println("Треугольник равнобедренный");
            return true;
        }
        return false;
    }

    public boolean isEquilateral() {//равносторонний
        if ((a == c) && (b == c)) {
            System.out.println("Треугольник равносторонний");
            return true;
        }
        return false;
    }
}
