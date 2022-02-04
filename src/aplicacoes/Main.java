package aplicacoes;

import entidades.Triangulo;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scanner = new Scanner(System.in);

        Triangulo x = new Triangulo();
        Triangulo y = new Triangulo();

        System.out.println("Entre com as dimensões do triângulo X: ");
        x.ladoA = scanner.nextDouble();
        x.ladoB = scanner.nextDouble();
        x.ladoC = scanner.nextDouble();

        System.out.println("Entre com as dimensões do triângulo Y: ");
        y.ladoA = scanner.nextDouble();
        y.ladoB = scanner.nextDouble();
        y.ladoC = scanner.nextDouble();

        double areaX = x.area();
        double areaY = y.area();

        System.out.printf("A área do triângulo X é: %.2f ", areaX);
        System.out.printf("\nA área do triângulo Y é: %.2f ", areaY);

        if (areaX > areaY){
            System.out.println("\nA área do Triângulo X é maior.");
        } else if (areaY > areaX){
            System.out.println("\nA área do Triângulo Y é maior.");
        } else{
            System.out.println("\nOs triângulos X e Y possuem dimensões iguais.");
        }
    }
}
