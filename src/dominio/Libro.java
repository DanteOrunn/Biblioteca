package dominio;

import utilidad.Fecha;

/**
 *
 * */
public class Libro {

    private int identificador; //ID unico para cada libro
    private static int contadorLibro; //Contador que asigna el ID a los libros al ser instanciados
    private String nombre; //Nombre del libro
    private Autor autor; //Autor al que pertenece el libro
    private int tipo; //Tipo al que pertenece el libro (Nobrla, Teatro, Poesia, Ensayo)
    private String nombreEditorial; //Nombre de la editorial
    private Fecha añoLanzamiento; //Fecha del lanzamiento oficial del libro
    private int estado; //Estado al que pertenece el libro (En Biblioteca, Prestado, Con retraso o En reparacion)

    Libro(String nombre, Autor autor, int tipo, String editorial, Fecha fechaNacimiento, int estado){
        this.identificador = ++Libro.contadorLibro;
        this.nombre = nombre;
        this.autor = autor;
        this.tipo = tipo;
        this.nombreEditorial = editorial;
        this.añoLanzamiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdentificador() {
        return identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public Autor getAutor() {
        return autor;
    }

    public int getTipo() {
        return tipo;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public Fecha getFechaNacimiento() {
        return añoLanzamiento;
    }

    public int getEstado() {
        return estado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.añoLanzamiento = fechaNacimiento;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "ID del Libro:" + this.identificador + "\n" +
                "Nombre del Libro:" + this.nombre + "\n" +
                "Autro:" + this.autor.getNombreAutor() + "\n" +
                "Tipo:" + this.tipo + "\n" +
                "Editorial:" + this.nombreEditorial + "\n" +
                "Año de Lanzamiento" + this.añoLanzamiento.toString() + "\n" +
                "Estado:" + this.estado + "\n";
    }

}