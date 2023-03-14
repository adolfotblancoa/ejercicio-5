package aplicacion;
import java.util.Arrays;
import java.util.List;
public class Principal {

    public static void main(String[] args) {
        
        System.out.println("Ejercicio 12: Explique que es una expresión lambda: \n R: Es una función anónima en programación que se define sin un nombre y se puede pasar como argumento a otras funciones.");
        
        System.out.println("Ejercicio 14: ");
        //ejer 14.1
        System.out.println("1: Dada una lista de números, obtiene otra lista con sus cuadrados.");
        List<Integer> lista = Arrays.asList(1, 2, 3, 4, 5);
        dominio.Matematicas.listaCuadrados(lista);
        //ejer 14.2
        System.out.println("2: Dada una lista de números, obtiene su suma.");
        List<Integer> lista2 = Arrays.asList(1, 2, 3, 4, 5);
        dominio.Matematicas.sumaLista(lista2);
        //ejer 14.3
        System.out.println("3: Dada una lista de números, obtiene la suma de los numeros pares.");
        List<Integer> lista3 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        dominio.Matematicas.sumaPares(lista3);
        //ejer 14.4
        System.out.println("4: Dada una lista de números, obtiene otra lista con los números pares.");
        List<Integer> lista4 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        dominio.Matematicas.paresLista(lista4);
        //ejer 14.5
        System.out.println("5: La media aritmética de los elementos de una lista dada.");
        List<Integer> lista5 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        dominio.Matematicas.mediaAritmetica(lista5);
        //ejer 14.6
        System.out.println("6. La desviación típica de los elementos de una lista dada.");
        List<Integer> lista6 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        dominio.Matematicas.desviacionTipica(lista6);
        //ejer 14.7
        System.out.println("7. El menor de una lista de números.");
        List<Integer> lista7 = Arrays.asList(1, 2, 3, 4, 5);
        dominio.Matematicas.menorLista(lista7);
        //ejer 14.8
        System.out.println("8. A partir de una lista de String, obtiene otra lista con sus elementos transformados a minúscula. ");
        List<String> lista8 = Arrays.asList("ADOlfo", "TOMAs", "blANco", "ARauJO");
        dominio.Matematicas.aMinusculas(lista8);
        //ejer 14.9
        System.out.println("9. Devuelve una cadena que sea la concatenación de todos los elementos de una lista de String. ");
        List<String> lista9 = Arrays.asList("uno", "dos", "tres", "cuatro", "cinco");
        dominio.Matematicas.concatenarCadenas(lista9);
        //ejer 14.10
        System.out.println("Devuelve una lista con todos los elementos de otra lista de String transformados a minúsculas. ");
        List<String> lista10 = Arrays.asList("ADOlfo", "TOMAs", "blANco", "ARauJO");
        dominio.Matematicas.transformarAMinusculas(lista10);
        //ejer 14.11
        System.out.println("11. Devuelve una lista con todos los elementos de otra lista de String que no empiezen por la letra 'A'.");
        List<String> lista11 = Arrays.asList("aDOlfo", "TOMAs", "blANco", "ARauJO");
        dominio.Matematicas.noEmpiezaPorA(lista11);
        //ejer 14.12
        System.out.println("Devuelve una lista con todos los números mayores que seis resultantes de multiplicar por 2 todos los elementos de una lista de entrada. ");
        List<Integer> lista12 = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        dominio.Matematicas.por2MayorQue6(lista12);

    }
    
}
