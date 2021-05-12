package dominio;

import utilidad.Consola;

public class Biblioteca {

    private Lector[] lectores; // Arreglo de letores registrados en la biblioteca
    private Libro[] almacenLibros; // Arreglo de libros donde se almacenan los libros registrados por la biblioteca
    private int cantLectores; // Cantidad de lectores registrados en la biblioteca
    private int cantLibros; // Cantidad de libros registrados en la biblioteca

    public Biblioteca() {
        this.lectores = new Lector[2];
        this.almacenLibros = new Libro[5];
        this.cantLectores = 2;
        this.cantLibros = 5;
    }

    public Biblioteca(Lector[] lectores, Libro[] almacenLibros) {
        this.lectores = lectores;
        this.almacenLibros = almacenLibros;
        this.cantLectores = lectores.length;
        this.cantLibros = almacenLibros.length;
    }

    public Lector[] getLectores() {
        return lectores;
    }

    public void setLectores(Lector[] lectores) {
        this.lectores = lectores;
    }

    public Libro[] getAlmacenLibros() {
        return almacenLibros;
    }

    public void setAlmacenLibros(Libro[] almacenLibros) {
        this.almacenLibros = almacenLibros;
    }

    public int getCantLectores() {
        return cantLectores;
    }

    public void setCantLectores(int cantLectores) {
        this.cantLectores = cantLectores;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }

    // Presta un libro a un lector
    public boolean prestarLibro(int codigoLector, int codigoLibro) {
        boolean axB = false;
        if (buscarLector(codigoLector)) {
            if (buscarLibro(codigoLibro)) {
                if (verificarEstado(codigoLibro)) {
                    axB = true;
                } else {
                    Consola.emitirMensajeLN("El libro no puede ser prestado");
                }
            } else {
                Consola.emitirMensajeLN("No se encontro el libro en el almacen");
            }
        } else {
            Consola.emitirMensajeLN("No se encontro al lector en el registro");
        }
        return axB;
    }

    //Metodo que entrega el libro solicitado por el Lector
    public Libro entregar(int codigoLibro){
        Libro axL = null;
        for (int i = 0; i < almacenLibros.length; i++) {
            if (codigoLibro == almacenLibros[i].getIdentificador()) {
                axL = almacenLibros[i];
            }
        }
        return axL;
    }

    //Metodo para verificar la devolcion del libro
    public void devolucion(int codigoLibro, int codigoLector){
        for(int i = 0 ; i < lectores.length ; i++){
            if(codigoLector == lectores[i].getCodigoLector()){
                lectores[i].entregarLibro(codigoLibro);
            }
        }

        for(int j = 0 ; j < almacenLibros.length ; j++){
            if(codigoLibro == almacenLibros[j].getIdentificador()){
                almacenLibros[j].setEstado(1);
            }
        }
    }

    // Multa al lector por no devolver el libro en fecha limite
    public void multarLector(Lector lector, int diasAtraso) {
        int multaFinal = diasAtraso * 2;
        lector.setMulta(true);
        lector.setDiasMulta(multaFinal);
    }

    // Metodo para buscar un lector en el registro
    private boolean buscarLector(int codigoLector) {
        boolean ax = false;
        for (int i = 0; i < lectores.length; i++) {
            if (codigoLector == lectores[i].getCodigoLector()) {
                ax = true;
            }
        }
        return ax;
    }

    // Metodo para buscar un libro en el registro de la biblioteca
    private boolean buscarLibro(int codigoLibro) {
        boolean ax = false;
        for (int i = 0; i < almacenLibros.length; i++) {
            if (codigoLibro == almacenLibros[i].getIdentificador()) {
                ax = true;
            }
        }
        return ax;
    }

    //Metodo para verificar el estado del libro
    private boolean verificarEstado(int codigoLibro){
        boolean ax = false;
        for (int i = 0; i < almacenLibros.length; i++) {
            if (codigoLibro == almacenLibros[i].getIdentificador()) {
                if (almacenLibros[i].getEstado() != 2 && almacenLibros[i].getEstado() != 3 && almacenLibros[i].getEstado() != 4) {
                    ax = true;
                }
            }
        }
        return ax;
    }

}