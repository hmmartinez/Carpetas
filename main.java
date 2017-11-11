package ejerciciodirectorio;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
    Directorio raiz=new Directorio(" Principal ",200,"publicos",null);
        raiz.addCarpeta(new Directorio("sub",200,"privados",null));
       raiz.addCarpeta(new Directorio("sub2",200,"privados",null));
        raiz.Prueba();
        Scanner leer = new Scanner(System.in);
        
        do {
        System.out.println("**** Menú *******");
        System.out.println("1. Agregar carpeta");
        System.out.println("2. Agregar archivo");
        System.out.println("3. Buscar carpeta");
        System.out.println("4. Salir");
        System.out.println("Elija su opción: ");
        int opc = leer.nextInt();
        
        switch(opc){
            case 1:
                System.out.println("Ingrese el nombre de la carpeta: ");
                String nc = leer.next();
                raiz.addCarpeta(raiz);
                break;
            case 2:
                System.out.println("Ingrese el nombre del archivo: ");
                String na = leer.next();
                raiz.addArchivoSistema(nuevo);
                break;
            case 3:
                System.out.println("Ingrese el nombre de la carpeta a buscar: ");
                String nombre = leer.next();
                raiz.buscar_Carpeta(nombre);
                break;
            case 4:
                System.out.println("Saliendo...");
                break;
        }
    } while (opc != 4);
    }
}
