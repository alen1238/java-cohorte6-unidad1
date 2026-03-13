import java.util.Scanner;

public class App {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        String nombreLeido = leerNombre(sc);
        int edad = leerEdad(sc);
        boolean esMayor = esMayorA18(edad);
        imprimirRespuesta(esMayor, nombreLeido);
    }

    public static String leerNombre(Scanner lector) {
        System.out.print("Ingrese su nombre: ");
        String nombre = lector.nextLine();
        return nombre;
    }

    public static int leerEdad(Scanner scan) {
        System.out.print("Ingrese su edad: ");
        int edad = scan.nextInt();
        scan.nextLine();
        return edad;
    }

    public static boolean esMayorA18(int edad) {
        return edad >= 18;
    }

    public static void imprimirRespuesta(boolean condicioEdad, String nombre) {
            if(condicioEdad){
                System.out.println("Bienvenido " + nombre + ", registro pwrmitido");
            }
            else{
                System.out.println("Lo sentimos " + nombre + ", debes ser mayor de edad");
            }
    }
}
