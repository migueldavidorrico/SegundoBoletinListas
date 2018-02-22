package es.orrico.miguel.nacimientos;

import java.time.LocalDate;
import java.time.Month;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Persona {
    private final String nombre;
    private final LocalDate fechaNacimiento;


    public Persona(String nombre, String fechaNacimiento) {
        this.nombre = nombre;
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d/M/yyyy");
        this.fechaNacimiento=LocalDate.parse(fechaNacimiento,dateTimeFormatter);
    }

    public Month getMes(){
        return this.fechaNacimiento.getMonth();
    }
    public int getDia(){
        return this.fechaNacimiento.getDayOfMonth();
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                '}';
    }
    public boolean mismoCumple(Persona p){
        if(p==null){
            return false;
        }
        return p.getMes().equals(this.getMes()) && p.getDia() == this.getDia();
    }

}
