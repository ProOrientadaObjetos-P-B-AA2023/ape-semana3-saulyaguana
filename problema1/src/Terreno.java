public class Terreno {
    private double costo_terreno;
    private double ancho;
    private double largo;
    private double area;
    private double valorMetroCuadrado;

    public Terreno() {}

    public Terreno (double ancho, double largo, double valorMetroCuadrado) {
        this.ancho = ancho;
        this.largo = largo;
        this.valorMetroCuadrado = valorMetroCuadrado;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setValorMetroCuadrado(double valor) {
        this.valorMetroCuadrado = valor;
    }

    public void calcularAreaTerreno() {
        this.area = this.ancho * this.largo;
    }

    public void calcularCostoTerreno() {
        this.costo_terreno = this.area * this.valorMetroCuadrado;
    }

    // GET

    public double getCosto_terreno() {
        return this.costo_terreno;
    }

    public double getAncho() {
        return this.ancho;
    }

    public double getLargo() {
        return this.largo;
    }

    public double getArea() {
        return this.area;
    }

    public double getValorMetroCuadrado() {
        return this.valorMetroCuadrado;
    }

    // TO STRING
    // retorna todos los valores de la clase

    public String toString() {
        String msj = String.format("DATOS DEL TERRENO: \nAncho del terreno:  %.2f \n"
        + "\nLargo del terrneo: %.2f"
        + "\nValor del metro cuadrado del terreno: %.2f", this.getAncho(), this.getLargo(), this.getValorMetroCuadrado());
        return msj;
    }
}
