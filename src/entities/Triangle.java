package entities;

public class Triangle {

    // Variáveis para o Cálculo
    public double a;
    public double b;
    public double c;

    //Classe Area
    public double area() {
        double p = (a + b + c) / 2.0; // Cálculo de "P"
        double result = Math.sqrt(p * (p - a) * (p - b) * (p - c)); //Caculando a Area do Triangulo

        return result;// Retorno da váriavel
    }
}
