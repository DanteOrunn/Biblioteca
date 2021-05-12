package principal;

import dominio.*;
import utilidad.*;

public class Principal {
    
    public static void main(String[] args) {
        
        Lector[] lectores = new Lector[2];
        lectores = cargarLectores();
        Libro[] almacenLibros = new Libro[2];
        almacenLibros = cargarLibros();
        Biblioteca biblioteca = new Biblioteca(lectores, almacenLibros);
        int op, codigoLector, codigoLibro;

        do {
            Consola.emitirMensajeLN("\tMenu\n" +
                                "1.Prestar Libro\n" +
                                "2.Devolver Libro\n" + 
                                "0.Salir\n" +
                                "Operacion:");
            op = Consola.leerInt();

            switch(op){
                case 1:
                    Consola.emitirMensaje("Codigo de Lector");
                    codigoLector = Consola.leerInt();
                    Consola.emitirMensaje("Codigo de Libro:");
                    codigoLibro = Consola.leerInt();
                    if (biblioteca.prestarLibro(codigoLector, codigoLibro)) {
                        for(int i = 0 ; i < lectores.length ; i++){
                            if(codigoLector == lectores[i].getCodigoLector()){
                                for(int j = 0 ; j < almacenLibros.length ; j++){
                                    if(codigoLibro == almacenLibros[j].getIdentificador()){
                                        Libro ax = almacenLibros[j];
                                        lectores[i].recibirLibro(ax);
                                        almacenLibros[j].setEstado(2);
                                    }
                                }
                            }
                        }
                    }
                    break;
                case 2:
                    Consola.emitirMensaje("Codigo de Lector");
                    codigoLector = Consola.leerInt();
                    Consola.emitirMensaje("Codigo de Libro:");
                    codigoLibro = Consola.leerInt();
                    biblioteca.devolucion(codigoLibro, codigoLector);
                    break;
                case 0:
                    Consola.emitirMensajeLN("Adios!!!");
                    break;
                default:
                    Consola.emitirMensajeLN("Opcion incorrecta... vuelva a ingresar");
                    break;
            }
        } while (op != 0);

    }

    //Metodo estatico para cargar un array de lectores a modo de usarse en caso de prueba
    public static Lector[] cargarLectores(){
        Lector[] vecLector = new Lector[2];
        for(int i = 0 ; i < vecLector.length ; i++){
            Lector lec = new Lector();
            vecLector[i] = lec;
        }
        return vecLector;
    }

    //Metodo estatico para cargar un array de libros a modo de usarse en caso de prueba
    public static Libro[] cargarLibros(){
        Fecha fec = new Fecha(26,2,1999);
        Fecha fec2 = new Fecha(4, 9, 1994);
        Autor autor = new Autor("Martin Harmall", "Robus", "Ingresa", fec);
        Autor autor2 = new Autor("Miriam Naud", "Cox", "Americana", fec2);
        Libro lib = new Libro("Noches Pasajeras", autor, 1, "Nuevo Palo", fec, 1);
        Libro lib2 = new Libro("The C Compiler", autor2, 2, "Morris TOPs", fec2, 4);
        Libro[] libros = {lib, lib2};
        return libros;
    }

}
