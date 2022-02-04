package entidades;

public class Triangulo {
    public double ladoA;
    public double ladoB;
    public double ladoC;

    public double area() {
        double perimetro = (ladoA + ladoB + ladoC) / 2.0;
        return Math.sqrt(perimetro * (perimetro - ladoA) * (perimetro - ladoB) * perimetro - ladoC);
    }
}
