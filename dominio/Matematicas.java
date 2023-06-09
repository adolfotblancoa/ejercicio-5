package dominio;
import java.util.List;
import java.util.stream.Collectors;

public class Matematicas{

    public static void listaCuadrados(List<Integer> numeros){
        
        List<Integer> cuadrados = numeros.stream()
                                .map(x -> x * x)
                                .collect(Collectors.toList());
        System.out.println(cuadrados);
    }

    public static void sumaLista(List<Integer> numeros){
        int suma = numeros.stream()
                  .reduce(0, (a, b) -> a + b);
        System.out.println(suma);
    }

    public static void sumaPares(List<Integer> numeros){
        int suma = numeros.stream()
                  .filter(x -> x % 2 == 0)
                  .reduce(0, (a, b) -> a + b);
        System.out.println(suma);
    }

    public static void paresLista(List<Integer> numeros){
        List<Integer> pares = numeros.stream()
                    .filter(x -> x % 2 == 0)
                    .collect(Collectors.toList());
        System.out.println(pares);

    }

    public static void mediaAritmetica(List<Integer> numeros){
        double media = numeros.stream()
                    .mapToInt(x -> x)
                    .average()
                    .getAsDouble();
        System.out.println(media);
    }

    public static void desviacionTipica(List<Integer> numeros){
        double media = numeros.stream()
                    .mapToInt(x -> x)
                    .average()
                    .getAsDouble();
        double desviacion = numeros.stream()
                    .mapToDouble(x -> Math.pow(x - media, 2))
                    .average()
                    .getAsDouble();
        System.out.println(Math.sqrt(desviacion));
    }

    public static void menorLista(List<Integer> numeros){
        int menor = numeros.stream()
                    .mapToInt(x -> x)
                    .min()
                    .getAsInt();
        System.out.println(menor);
    }

    public static void aMinusculas(List<String> palabras){
        List<String> minusculas = palabras.stream()
                    .map(x -> x.toLowerCase())
                    .collect(Collectors.toList());
        System.out.println(minusculas);
    }

    public static void concatenarCadenas(List<String> palabras){
        String concatenacion = palabras.stream()
            .reduce("", (a, b) -> a + b);
        System.out.println(concatenacion);
    }

    public static void transformarAMinusculas(List<String> palabras){
        List<String> minusculas = palabras.stream()
                    .map(x -> x.toLowerCase())
                    .collect(Collectors.toList());
        System.out.println(minusculas);
        // pregunta lo mismo que el ejercicio 8?
    }

    public static void noEmpiezaPorA(List<String> palabras){
        List<String> noA = palabras.stream()
                    .filter(x -> x.charAt(0) != 'A')
                    .collect(Collectors.toList());
        System.out.println(noA);
    }

    public static void por2MayorQue6(List<Integer> numeros){
        List<Integer> por2 = numeros.stream()
                    .map(x -> x * 2)
                    .filter(x -> x > 6)
                    .collect(Collectors.toList());
        System.out.println(por2);
    }



}