import java.util.Scanner;

public class App {
    
    static Scanner sc = new Scanner(System.in);
    static boolean next = false;
    static int cuentaReal = 12345;
    static int claveReal = 2026;
    static double saldo = 1_000_000d;


    public static void main(String[] args) throws Exception {
        login();
        if(next){
            menu();
        }
    }

    //Ejercicio 1
    public static void login() {

        //Aqui ingresan los datos de la BBDD
         String miClave = "12345";
        String claveIngresadaString = "54645";

        //if(miClave.equals(claveIngresadaString))
        // --------------------------
        boolean loginExitoso = false; //bandera
        int intentos = 0;
        int cuentaIngresada, claveIngresada;

        do {
            System.out.print("Ingrese numero de cuenta: ");
            cuentaIngresada = sc.nextInt();

            System.out.print("Ingrese la clave: ");
            claveIngresada = sc.nextInt();

            if(cuentaIngresada == cuentaReal && claveIngresada == claveReal){
                System.out.println("    Ingresando al sistema...\n");
                loginExitoso = true;
                next = true;
            }else{
                System.out.println("credenciales incorrectas");
                intentos++;
            }
            
        } while (!loginExitoso && intentos <3); //loginExitoso == false

       if(intentos == 3){
          System.out.println("cuenta bloqueada");
        }
        sc.nextLine();
    }

    public static void transferencia(){
        System.out.print("Numero de cuenta destino: ");
        String destino = sc.nextLine();
        System.out.print("Monto a transferir: ");
        double monto = sc.nextDouble();

        if(monto > 0 && monto <= saldo){
            System.out.println("transferencia exitosa a cuenta " + destino);
            saldo -= monto; // saldo = saldo - monto;
            System.out.println("Su nuevo saldo es: " + saldo);
        }else if(monto > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("Ingrese un monto válido");
        }
        sc.nextLine();
    }

    public static void retirar(){
        System.out.print("Monto a retirar: ");
        double monto = sc.nextDouble();

        if(monto > 0 && monto <= saldo){
            saldo -= monto;
            System.out.println("Retire su dinero");
            System.out.println("Nuevo saldo: " + saldo);
        }else if(monto > saldo){
            System.out.println("Saldo insuficiente");
        }else{
            System.out.println("monto inválido");
        }
        sc.nextLine();
    }


    public static void menu() {
        String opcion;
        do {
            System.out.println("\n=========MENU PRINCIPAL========");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Transferir dinero");
            System.out.println("3. Retirar dinero");
            System.out.println("4. Salir");
            System.out.print("Opcion: ");
            opcion = sc.nextLine();

        switch (opcion) {
            case "1":
                    System.out.println("Su saldo actual es: " + saldo);
                break;
            case "2":
                 //transferir dinero
                 transferencia();
                break;
            case "3":
                    //retirar dinero
                    retirar();
                break;
            case "4":
                    System.out.println("Saliendo del sistema bancario...");
                break;
            default:
                    System.out.println("opcion inválida. Elija entre 1-4");
                break;
          }
        } while (!opcion.equals("4"));
    }


}
