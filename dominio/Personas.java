package dominio;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Personas {
    private List<Persona> listaPersonas = new ArrayList<>();
    //Ejercicio 15.2
    public void annadirPersona(Persona persona) {
        listaPersonas.add(persona);
    }
    //Ejercicio 15.3
    //apartado a
    public Persona elMasJoven() {
        return listaPersonas.stream()
                .min(Comparator.comparing(Persona::getFechaDeNacimiento))
                .orElse(null);
    }
    //apartado b
    public long calcularSumaEdades() {
        return listaPersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .sum();
    }
    //apartado c
    public long calcularEdadMinima() {
        return listaPersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .min()
                .orElse(0L);
    }
    //apartado d
    public double calcularMediaDeEdad() {
        return listaPersonas.stream()
                .mapToLong(Persona::calcularEdad)
                .average()
                .orElse(0.0);
    }
    
}
