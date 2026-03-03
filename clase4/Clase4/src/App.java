import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

       Scanner scanner = new Scanner(System.in); //para crear un lector
        String nombreCliente = "Alejandra";
        String producto = "Laptop";
        double precio = 1250.758;
        int cantidad = 2;

        System.out.printf("Apreciada %s, El producto es %s, su precio es %.2f y la cantidad es %d.%n", nombreCliente, producto, precio, cantidad);


        

       System.out.println("Esta es una linea");
       System.out.print("Esta es otra linea");
    
       System.out.print("Escriba su edad: ");
       int edad = scanner.nextInt(); //aqui quiero que leas un entero

       scanner.nextLine();
       
       System.out.print("Escriba su nombre: ");
       String nombre = scanner.nextLine();

        System.out.println("Su edad es:  " + edad + " y su nombre es: " + nombre);
        //System.out.println("Su nombre es:  " + nombre);



      
    }

    public static void ejemplo1() {
         int a = 45;
       int b = 10;

       int resultado = b + ++a; // 
       System.out.println(resultado);
       System.out.print(a);
    }
}
