package act2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//Descripción: Utiliza un HashMap para almacenar nombres de países y sus capitales.
//Solicita al usuario un país y muestra su capital correspondiente.
//Puntos a considerar:
//● Manejar el caso en que el país no esté en el mapa.
//● Utilizar Scanner para la entrada del usuario.
public class Main {
    public static void main(String[] args){

        Map<String, String> mundo = new HashMap<>();
        
        mundo.put("Espania", "Madrid");
        mundo.put("Francia", "Paris");
        mundo.put("Italia", "Roma");
        mundo.put("Alemania", "Berlin");
        
        System.out.println("Dime el nombre de un pais");
        Scanner sc = new Scanner (System.in);
        String pais = sc.nextLine();
        
        
        if(mundo.containsKey(pais)){
            String capital = mundo.get(pais);
            System.out.println("La capital de "+pais+" es "+ capital);
        }
        else{
            System.out.println("Ese pais no está en el mapa");
        }




    }
}
