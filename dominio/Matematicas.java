package dominio;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Matematicas{

    public static void listaCuadrados(int[] lista){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> cuadrados = numeros.stream()
                                          .map(x -> x * x)
                                          .collect(Collectors.toList());
        System.out.println(cuadrados);
        
    }

    public static void sumaLista(int[] lista){
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        int suma = numeros.stream()
                  .reduce(0, (a, b) -> a + b);
        System.out.println(suma);

    }
}