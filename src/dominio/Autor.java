package dominio;

import utilidad.Fecha;

/**
 *
 * */
public class Autor {

    private String nombreAutor; //Nombre del Autor
    private String apellidoAutor; //Apellido del Autor
    private String nacionalidad; //Nacionaldad del Autor
    private Fecha fechaNacimiento; //Fecha de nacimiento del Autor

    public Autor(String nombre, String apellido, String nacionalidad, Fecha fecha) {
        this.nombreAutor = nombre;
        this.apellidoAutor = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNacimiento = fecha;
    }

    public String getNombreAutor() {
        return nombreAutor;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getApellidoAutor(){
        return apellidoAutor;
    }

    public Fecha getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setNombreAutor(String nombreAutor) {
        this.nombreAutor = nombreAutor;
    }

    public void setApellidoAutor(String apellidoAutor){
        this.apellidoAutor = apellidoAutor;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setFechaNacimiento(Fecha fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    @Override
    public String toString() {
        return "Nombre del Autor:" + nombreAutor + " " + apellidoAutor + "\n" +
                "Nacionalidad:" + nacionalidad + "\n" +
                "Fecha de Nacimiento:" + fechaNacimiento.toString();
    }

}