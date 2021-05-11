package dominio;

/**
 *
 * */
public class Lector {

    private int codigoLector; //Codigo unico asignado a cada lector para ser identificado
    private static int contadorLectores; //Contador para asignar el codigo a cada lector para su identificacion
    private Libro[] libros; //Libros que el lector tiene en posesion
    private boolean multa; //Multa que se da al lector luego de retrasar la entrega de un libro
    private int diasMulta; //Cantidad de dias multado
    private boolean habilitado; //Muestra si el Lector esta habilitado

    public Lector(){
        this.codigoLector = ++Lector.contadorLectores;
        this.libros = new Libro[3];
        this.multa = false;
        this.diasMulta = 0;
    }

    public Lector(Libro[] libros){
        this.codigoLector = ++Lector.contadorLectores;
        this.libros = libros;
        this.multa = false;
        this.diasMulta = 0;
    }

    public int getCodigoLector(){
        return codigoLector;
    }

    public Libro[] getLibros() {
        return libros;
    }

    public boolean isMulta() {
        return multa;
    }

    public int getDiasMulta() {
        return diasMulta;
    }

    public void setLibros(Libro[] libros) {
        this.libros = libros;
    }

    public void setMulta(boolean multa) {
        this.multa = multa;
    }

    public void setDiasMulta(int diasMulta) {
        this.diasMulta = diasMulta;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }

    @Override
    public String toString() {
        return "Codigo de Lector Unico:" + this.codigoLector + "\n" +
                "\tLibros en posesion\n" +
                "Libro 1:\n" + this.libros[0].toString() +
                "Libro 2:\n" + this.libros[1].toString() +
                "Libro 3:\n" + this.libros[2].toString() +
                "Multa:" + this.multa + "\n" +
                "Dias de Atraso:" + this.diasMulta + "\n" +
                "Lector Habilitado:" + this.habilitado;
    }

}
