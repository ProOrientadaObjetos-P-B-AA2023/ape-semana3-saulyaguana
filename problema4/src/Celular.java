public class Celular {
    private String sistemaOperativo;
    private double dimensionesPantalla;
    private double costoInicial;
    private double costoFinal;
    private double ivaPorcentaje;
    private double ivaCostoInicial;
    private int dirMac;
    private String infoMEL;

    Celular(){}

    Celular(
            String sistemaOperativo,
            double dimensionesPantalla,
            double costoInicial,
            double ivaPorcentaje,
            double ivaCostoInicial,
            int dirMac,
            String infoMEL
    ){
        this.sistemaOperativo = sistemaOperativo;
        this.dimensionesPantalla = dimensionesPantalla;
        this.costoInicial = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.ivaCostoInicial = ivaCostoInicial;
        this.dirMac = dirMac;
        this.infoMEL = infoMEL;
    }

    public void calcularCostoFinal() {
        this.costoFinal = this.costoInicial + this.ivaCostoInicial;
    }

    // GET

    public String getSistemaOperativo() {
        return this.sistemaOperativo;
    }

    public double getDimensionesPantalla() {
        return this.dimensionesPantalla;
    }

    public double getCostoInicial() {
        return this.costoInicial;
    }

    public double getCostoFinal() {
        return this.costoFinal;
    }

    public double getIvaPorcentaje() {
        return this.ivaPorcentaje;
    }

    public double getIvaCostoInicial() {
        return this.ivaCostoInicial;
    }

    public int getDirMac() {
        return this.dirMac;
    }

    public String getInfoMEL() {
        return this.infoMEL;
    }

    // TO STRING

    public String toString() {
        String mensaje = String.format(
                "CELULARES: \nSistema Operativo: "
                +"\nDimensiones Pantalla: "
                +"\nCosto Inicial: "
                +"\nIva en Porcentaje: "
                +"\nIva del Costo Inicial: "
                +"\nDirección MAC: "
                +"\nInformación IMEL: "
                +"\nCosto Final --> "
                , this.getSistemaOperativo(), this.getDimensionesPantalla(), this.getCostoInicial()
                , this.getIvaPorcentaje(), this.getIvaCostoInicial(), this.getDirMac(), this.getInfoMEL()
                , this.getCostoFinal()
        );
        return mensaje;
    }
}
