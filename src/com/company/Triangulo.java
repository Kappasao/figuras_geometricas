package com.company;

/**
 * Created by 46995932D on 20/12/2016.
 */
public class Triangulo {

    private double lado;
    private double altura;
    private double base;
    private String color;

    public Triangulo(double lado, double altura, double base, String color) {
        this.lado = lado;
        this.altura = altura;
        this.base = base;
        this.color = color;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double calcularArea(){
        double a2 = Math.pow(lado,2);
        double b2 = Math.pow(base,2);
        double b2div4 = b2 / 4;
        double a2minusb2div4 = a2 - b2div4;
        double raiz = Math.sqrt(a2minusb2div4);
        double numerador = base * raiz;
        double area = numerador / 2;
        return area;
    }

    public double calcularPerimetro(){
        double amul2 = 2 * lado;
        double perimetro = amul2 + base;
        return perimetro;
    }



    @Override
    public String toString() {
        return "Triangulo{" +
                "lado=" + lado +
                ", altura=" + altura +
                ", base=" + base +
                ", color='" + color + '\'' +
                '}';
    }
}
