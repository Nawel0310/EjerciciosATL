//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.util.Scanner;

public class Main {
    static Scanner entrada;
    public static void main(String[] args) {
        ObtenerAniosPerro();
    }

    public static void ObtenerAniosPerro() {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la edad en años humanos.");
        Integer edadHumano = entrada.nextInt();
        Calculadora calculadora = new Calculadora(edadHumano);
        Integer edadPerro = calculadora.CalcularAniosPerro();
        System.out.println("Edad en años perro: " + edadPerro);
    }

    static {
        entrada = new Scanner(System.in);
    }
}
