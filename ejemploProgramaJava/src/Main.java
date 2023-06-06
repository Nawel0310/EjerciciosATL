
import java.util.Scanner;
public class Main {
    static Scanner entrada= new Scanner(System.in);
    public static void main(String[] args) {
        ObtenerAniosPerro();
    }
    public static void ObtenerAniosPerro(){
        Scanner entrada= new Scanner(System.in);
        Integer edadHumano;
        Integer edadPerro;
        System.out.println("Ingrese la edad en años humanos.");
        edadHumano= entrada.nextInt();
        Calculadora calculadora= new Calculadora(edadHumano);
        edadPerro= calculadora.CalcularAniosPerro();
        System.out.println("Edad en años perro: "+edadPerro);
    }
}