package dominio;
import java.time.LocalDate;
import java.time.Period;

// Ejercicio 15.1

public class Persona {

    private String nombre;
    private LocalDate fechaDeNacimiento;

    public Persona(String nombre, LocalDate fechaDeNacimiento) {
        this.nombre = nombre;
        this.fechaDeNacimiento = fechaDeNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }

    public long calcularEdad() {
        return Period.between(fechaDeNacimiento, LocalDate.now()).getYears();
    }
    
}
