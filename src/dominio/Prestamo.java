package dominio;

import java.time.LocalDate;

public class Prestamo {

    private int codPrestamo;
    private static int contadorPrestamos;
    private int codigoLector;
    private int codigoLibro;
    private int cantLibros;
    private LocalDate fechaPrestamo;

    public Prestamo(int codigoLector, int codigoLibro, int cantLibros) {
        this.codPrestamo = ++Prestamo.contadorPrestamos;
        this.codigoLector = codigoLector;
        this.codigoLibro = codigoLibro;
        this.cantLibros = cantLibros;
        this.fechaPrestamo = LocalDate.now();
    }

    public int getCodPrestamo() {
        return codPrestamo;
    }

    public int getCodigoLector() {
        return codigoLector;
    }

    public void setCodigoLector(int codigoLector) {
        this.codigoLector = codigoLector;
    }

    public int getCodigoLibro() {
        return codigoLibro;
    }

    public void setCodigoLibro(int codigoLibro) {
        this.codigoLibro = codigoLibro;
    }

    public int getCantLibros() {
        return cantLibros;
    }

    public void setCantLibros(int cantLibros) {
        this.cantLibros = cantLibros;
    }

    public LocalDate getFechaPrestamo() {
        return fechaPrestamo;
    }

    public void setFechaPrestamo(LocalDate fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    @Override
    public String toString(){
        return "Codigo de prestamo:" + codPrestamo + "\n" +
                "Codigo del Lector:" + codigoLector + "\n" +
                "Codigo del libro prestado:" + codigoLibro + "\n" +
                "Cantidad de libros prestados:" + cantLibros + "\n" +
                "Fecha del Prestamo:" + fechaPrestamo.toString();
    }

}