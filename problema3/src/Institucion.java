public class Institucion {
    private String nombre;
    private String tipoDeInstitucion;
    private int numeroDeAlumnos;
    private int numeroDeDocentes;
    private int numeroDeSedes;
    private double gastosProyectadoPorEstudiante;
    private double presupuesto;

    public Institucion() {}

    public Institucion(int alumnos, double gastosEstudiante) {
        this.numeroDeAlumnos = alumnos;
        this.gastosProyectadoPorEstudiante = gastosEstudiante;
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

    public String go() {
        String mensaje = String.format("INSTITUCIONES EDUCATIVAS: \nNombre de la institución: \n"
        + "\nTipo de institución: "
        + "\nNúmero de alumnos: "
        + "\nNúmero de docentes: "
        + "\nNúmero de sedes: "
        + "\nGastos proyectados por estudiante: "
        + "Presupuesto: "
        , this.getNombre(), this.getTipoDeInstitucion(), this.getNumeroDeAlumnos(), this.getNumeroDeDocentes()
        , this.getNumeroDeSedes(), this.getGastosProyectadoPorEstudiante(), this.getPresupuesto());
        return mensaje;
    }

}
