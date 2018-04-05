package informacion_1;

/**
 *
 * @author Fredy Sánchez 
 */
public class Informacion_1 {

    public static void main(String[] args) {
        Persona fredy = new Persona("Fredy Alexander","Sánchez Pérez","Estudiante","25 Mayo 1999","Soltero","Ingenieria Informatica",18,5879307,06142505,82817);
        
        System.out.println("Nombres: " + fredy.nombres);
        System.out.println("Apellidos: " + fredy.apellidos);
        System.out.println("Ocupación: " + fredy.ocupacion);
        System.out.println("Fecha de Nacimiento: " + fredy.fNacimiento);
        System.out.println("Estado Civil: " + fredy.estadoCivil);
        System.out.println("Carrera: " + fredy.carrera);
        System.out.println("Edad: " + fredy.edad);
        System.out.println("DUI: " + fredy.dui);
        System.out.println("NIT: " + fredy.nit);
        System.out.println("Carnet: " + fredy.carnet);
    }
    
}
