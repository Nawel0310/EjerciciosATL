public class Calculadora {
    //Atributos
    private Integer edad;

    private Integer edadPerro;

    //Métodos
    public Calculadora(Integer edad) {
        this.edad = edad;
    }

    public int CalcularAniosPerro (){
        this.edadPerro=edad*7;
        return this.edadPerro;

    }
}
