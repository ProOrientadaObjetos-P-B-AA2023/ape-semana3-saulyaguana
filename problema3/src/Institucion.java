public class Institucion {
    private String nombre;
    private String tipoDeInstitucion;
    private int numeroDeAlumnos;
    private int numeroDeDocentes;
    private int numeroDeSedes;
    private double gastosProyectadoPorEstudiante;
    private double presupuesto;

    public Institucion() {}

    public Institucion(
            int alumnos,
            double gastosEstudiante,
            String nombre,
            String tipoDeInstitucion,
            int numeroDeDocentes,
            int numeroDeSedes
    ) {
        this.numeroDeAlumnos = alumnos;
        this.gastosProyectadoPorEstudiante = gastosEstudiante;
        this.nombre = nombre;
        this.tipoDeInstitucion = tipoDeInstitucion;
        this.numeroDeDocentes = numeroDeDocentes;
        this.numeroDeSedes = numeroDeSedes;
    }

    // SET

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoDeInstitucion(String tipo) {
        this.tipoDeInstitucion = tipo;
    }

    public void setNumeroDeDocentes(int numeroDeDocentes) {
        this.numeroDeDocentes = numeroDeDocentes;
    }

    public void setNumeroDeSedes(int numSedes) {
        this.numeroDeSedes = numSedes;
    }

    public void calcularPresupuesto() {
        this.presupuesto = this.numeroDeAlumnos * this.gastosProyectadoPorEstudiante;
    }

    // GET

    public String getNombre() {
        return this.nombre;
    }

    public String getTipoDeInstitucion() {
        return this.tipoDeInstitucion;
    }

    public int getNumeroDeAlumnos() {
        return this.numeroDeAlumnos;
    }

    public int getNumeroDeDocentes() {
        return this.numeroDeDocentes;
    }

    public int getNumeroDeSedes() {
        return this.numeroDeSedes;
    }

    public double getGastosProyectadoPorEstudiante() {
        return this.gastosProyectadoPorEstudiante;
    }

    public double getPresupuesto() {
        return this.presupuesto;
    }

    // TO STRING

    public String toString() {
        String mensaje = String.format(
                "INSTITUCIONES EDUCATIVAS: \nNombre: \n"
                +"\nTipo: "
                +"\nAlumnos: "
                +"\nDocentes: "
                +"\nSedes: "
                +"\nGastos: "
                +"\nPresupuesto: "
                , this.getNombre(), this.getTipoDeInstitucion(), this.getNumeroDeAlumnos()
                , this.getNumeroDeDocentes(), this.getNumeroDeSedes(), this.getGastosProyectadoPorEstudiante(), this.getPresupuesto()

        );
        return mensaje;
    }

}
