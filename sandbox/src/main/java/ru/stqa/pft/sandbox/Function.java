package ru.stqa.pft.sandbox;

public class Function {
  public double a;
  public double b;
  public double c;
  public Function (double a, double b, double c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }
  public double area ()  {
    return (this.a - this.b)/2 * this.c;
  }
}
