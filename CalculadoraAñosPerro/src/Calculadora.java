//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Calculadora {
    private Integer edad;
    private Integer edadPerro;

    public Calculadora(Integer edad) {
        this.edad = edad;
    }

    public int CalcularAniosPerro() {
        this.edadPerro = this.edad * 7;
        return this.edadPerro;
    }
}
