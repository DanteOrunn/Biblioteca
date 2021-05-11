package dominio;

import utilidad.Fecha;

/**
 *
 * */
public class Autor {

    private String nombreAutor; //Nombre del Autor
    private String nacionalidad; //Nacionaldad del Autor
    private Fecha fechaNacimiento; //Fecha de nacimiento del Autor

    public Autor(String nombre, String nacionalidad, Fecha fecha) {
        this.nombreAutor = nombre;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fecha;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre del Autor:" + this.nombreAutor + "\n" +
                "Nacionalidad:" + this.nacionalidad + "\n" +
                "Fecha de Nacimiento:" + this.fechaNacimiento.toString();
    }

}