package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("biba");
    hello("boba");

    Square s = new Square(5);
    System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

    Function v = new Function(10, 6, 20);
    System.out.println("Функция ( " + v.a + " - " + v.b + " ) / 2 * " + v.c + " = " + v.area());

    Rectangle w = new Rectangle(4, 6);
    System.out.println("Площадь прямоугольника со сторонами " + w.a + " и " + w.b + " = " + w.area());

  }

  public static void hello(String somebody)  {
    System.out.println("Hello, " + somebody + "!");
  }


}



