package act3;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
//Descripción: Crea un programa que lea una frase del usuario y utilice un HashSet
//para mostrar todas las palabras únicas que contiene la frase.
//Puntos a considerar:


//● Elimina todos los signos de puntuación (“.”,”,”,”¡”,”!”).
//● Dividir la frase en palabras.
//● Convertir todas las palabras a minúsculas para evitar duplicados por
//mayúsculas.
//● Introducir cada palabra en el conjunto Set.

public class Main {
    public static void main(String [] args){
        Set<String> palabras = new HashSet();

        System.out.println("Dime una frase para que la lea");
        Scanner sc = new Scanner (System.in);
        String frase = sc.nextLine();

        frase = frase.toLowerCase();
        frase = frase.replace(".", "");
        frase = frase.replace(",", "");
        frase = frase.replace("!","");
        frase = frase.replace("¡","");

        String [] palabrasArray = frase.split(" ");
        for(String palabra : palabrasArray){
            palabras.add(palabra);
        }

        System.out.println(palabras);

        



    }
    
}
