import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by Miguel-David Orrico Teruel on 20/02/2018.
 */
public class Persona {
    private final String nombre;
    private final LocalDate fechaNacimiento;


    public Persona(String nombre, LocalDate fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public Persona(String nombre,String fecha){
        this.nombre=nombre;
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d/M/yyyy");
        this.fechaNacimiento=LocalDate.parse(fecha,dateTimeFormatter);
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String cadenaFecha(){
        DateTimeFormatter dateTimeFormatter=DateTimeFormatter.ofPattern("d/M/yyyy");

        return this.getFechaNacimiento().format(dateTimeFormatter);
    }

    public int getEdad(){
        LocalDate ahora=LocalDate.now();
        Period p = Period.between(ahora, this.fechaNacimiento);
        long p2 = ChronoUnit.YEARS.between(ahora,this.fechaNacimiento);
        return (int)p2;
    }
}
