package dominio;

public class Biblioteca {

    private Lector[] lectores; //Arreglo de letores registrados en la biblioteca
    private Libro[] almacenLibros; //Arreglo de libros donde se almacenan los libros registrados por la biblioteca
    private int cantLectores; //Cantidad de lectores registrados en la biblioteca
    private int cantLibros; //Cantidad de libros registrados en la biblioteca

    public Biblioteca(){
        this.lectores = new Lector[2];
        this.almacenLibros = new Libro[5];
        this.cantLectores = 2;
        this.cantLibros = 5;
    }

    public Biblioteca(Lector[] lectores, Libro[] almacenLibros){
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

    //El metodo añade un lector
    public void añadirLector(){

    }

    //Registra un nuevo libro para ser prestado
    public void añadirLibro(){

    }

    //Presta un libro a un lector
    public void prestarLibro(int codigoLector, int codigoLibro){
        int i = 0;

        while (true){
            if (codigoLector == lectores[i].getCodigoLector()){

            }
            i++;
        }
    }

    //Multa al lector por no devolver el libro en fecha limite
    public void multarLector(Lector lector, int diasAtraso){
        int multaFinal = diasAtraso * 2;
        lector.setMulta(true);
        lector.setDiasMulta(multaFinal);
    }


}