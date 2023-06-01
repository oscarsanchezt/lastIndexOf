import java.util.*;

public class Main {
	public static void main(String[] args) {
		ArrayList<String> miColeccion = new ArrayList<String>();
        miColeccion.add("Collection");
        miColeccion.add("List");
        miColeccion.add("Set");
        miColeccion.add("SortedSet");
        miColeccion.add("Map");

        String ultimoElto = "Map"; // Asigna el valor "Map" a la variable ultimoElto
        int posicion = miColeccion.lastIndexOf(ultimoElto);

       System.out.println("La posicion de 'Map' es: "+posicion);
	}
}
