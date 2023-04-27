public class Tiempo {
    private double hora;
    private double dias;
    private double minutos;

    public Tiempo(double hora) {
        this.hora = hora;
    }

    public void setHora(double hora) {
        this.hora = hora;
    }

    public void calcularDias() {
        this.dias = this.hora / 24;
    }

    public void calcularMinutos() {
        this.minutos = (this.hora % 24) * 60;
    }

    // GET

    public double getHora() {
        return this.hora;
    }

    public double getDias() {
        return this.dias;
    }

    public double getMinutos() {
        return this.minutos;
    }

    // TO STRING

    public String toString() {
        String mensaje = String.format(
                "CONVERTIDOR DE TIEMPO: \nHoras ingresadas: %.3f \n"
                +"\nDías: %.0f"
                +"\nMinutos: %.0f"
                , this.getHora(), this.getDias(), this.getMinutos()
        );
        return mensaje;
    }
}
