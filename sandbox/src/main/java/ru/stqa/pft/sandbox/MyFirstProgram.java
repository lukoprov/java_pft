package ru.stqa.pft.sandbox;

public class MyFirstProgram {

  public static void main(String[] args) {
    hello("world");
    hello("biba");
    hello("boba");

    double len = 5;
    System.out.println("Площадь квадрата со стороной " + len + " = " + area(len));

    double a = 10;
    double b = 6;
    double c = 20;
    System.out.println("Функция ( " + a + " - " + b + " ) / 2 * " + c + " = " + area(a, b, c));


    double len3 = 8;
    double len4 = 6;
    System.out.println("Площадь прямоугольника со сторонами " + len3 + " и " + len4 + " = " + area(len3,len4));

  }

  public static void hello(String somebody)  {
    System.out.println("Hello, " + somebody + "!");
  }
  public static double area (double lenght)  {
    return (lenght * lenght);
  }
  public static double area (double a, double b, double c)  {
    return (a - b)/2 * c;
  }
  public static double area (double l, double m)  {
    return (l * m);
    }


  }



