package application;

import entities.Triangle;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        //Starter Configs
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        //Variaveis herdadas da classe "Triangle"
        Triangle x, y;
        x = new Triangle();
        y = new Triangle();


        //Pedir As Medidas do Triângulo X
        System.out.println("Enter the measures of triangle X: "); //Pegar as Mediadas do triângulo X
        x.a = sc.nextDouble();
        x.b = sc.nextDouble();
        x.c = sc.nextDouble();

        //Pedir As Medidas do Triângulo Y
        System.out.println("Enter the measures of triangle Y: "); //Pegar as Mediadas do triângulo Y
        y.a = sc.nextDouble();
        y.b = sc.nextDouble();
        y.c = sc.nextDouble();

        //Mesmas Variáveis do Triangulo só que Area
        double areaX = x.area();
        double areaY = y.area();

        //Imprimir
        System.out.printf("Traingle X area: %.4f%n", areaX);
        System.out.printf("Traingle Y area: %.4f%n", areaY);

        //definição de qual é o Maior
        if (areaX > areaY) {
            System.out.println("Larger area: X");
        }
        else {
            System.out.println("Larger area: Y");
        }

        sc.close();
    }
}