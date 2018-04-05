package informacion_1;

/**
 *
 * @author Fredy Sánchez
 */
public class Persona {

    String nombres, apellidos, ocupacion, fNacimiento, estadoCivil, carrera;
    int edad;
    long dui, nit, carnet;

    public Persona(String nombres, String apellidos, String ocupacion, String fNacimiento, String estadoCivil, String carrera, int edad, long dui, long nit, long carnet) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.ocupacion = ocupacion;
        this.fNacimiento = fNacimiento;
        this.estadoCivil = estadoCivil;
        this.carrera = carrera;
        this.edad = edad;
        this.dui = dui;
        this.nit = nit;
        this.carnet = carnet;
    }

}
