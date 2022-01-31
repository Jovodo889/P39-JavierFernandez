public class Coche {

    private String matricula;
    private String marca;
    private String modelo;
    private String color;
    private Boolean techoSolar;
    private int km;
    private int numPuertas;
    private int numPlazas;

    public Coche (String matricula, String marca, String modelo, String color, Boolean techoSolar, int km,
                  int numPuertas, int numPlazas) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.techoSolar = techoSolar;
        this.km = km;
        this.numPuertas = numPuertas;
        this.numPlazas = numPlazas;
    }
}
