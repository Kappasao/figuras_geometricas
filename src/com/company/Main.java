package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here


        Triangulo stucom = new Triangulo(3.5, 2.4, 5.2, "azul");
        Triangulo asus = new Triangulo(4, 2.3, 6.2, "rojo");
        Triangulo kappa = new Triangulo(5, 3.4, 7.5, "verde");


        double areaStucom = stucom.calcularArea();
        double areaAsus = asus.calcularArea();
        double areaKappa = kappa.calcularArea();

        System.out.println("Las areas de cada uno de los triangulos son: ");
        System.out.println(areaStucom);
        System.out.println(areaAsus);
        System.out.println(areaKappa);

        double perimetroStucom = stucom.calcularPerimetro();
        double perimetroAsus = asus.calcularPerimetro();
        double perimetroKappa = kappa.calcularPerimetro();
        System.out.println("Los perimetros de cada uno de los triangulos son: ");
        System.out.println(perimetroStucom);
        System.out.println(perimetroAsus);
        System.out.println(perimetroKappa);

        if (perimetroStucom>perimetroAsus && perimetroStucom>perimetroKappa){
            System.out.println("El perimetro de el triangulo Stucom es el mayor");
        }
        else if (perimetroAsus>perimetroStucom && perimetroAsus>perimetroKappa){
            System.out.println("El perimetro de el triangulo Asus es el mayor");
        }
        else if (perimetroKappa>perimetroStucom && perimetroKappa>perimetroAsus){
            System.out.println("El perimetro de el triangulo Kappa es el mayor");
        }

        if (areaStucom>areaAsus && areaStucom>areaKappa){
            System.out.println("El area del triangulo Stucom es el mas grande");
        }
        else if (areaAsus>areaStucom && areaAsus>areaKappa){
            System.out.println("El area del triangulo Asus es el mas grande");
        }
        else if (areaKappa>areaStucom && areaKappa>areaAsus){
            System.out.println("El area del triangulo Kappa es el mas grande");
        }


    }
}