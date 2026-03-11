import java.util.Scanner;

public class App {

    public static int numeroPersonal;
    public static Scanner sc = new Scanner(System.in);

    //metodos....

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       // System.out.println("Digite su nombre: ");
       //String tuNombre = sc.nextLine();
        
     //  imprimirMensajeRepetido("este es el mensaje", 6);
        int miNumero = 30;
        cambiarValor(miNumero);
        System.out.println(miNumero);
    }

    public static void cambiarValor(int numero){
        numero = 10;
        numeroPersonal = 10;
        sc.nextLine();
    }


     public static void saludar(String nombre){
        System.out.println("Hola en mayusculas " + nombre.toUpperCase());
        int numero = 10;
        numeroPersonal = 30;
    }

    public static void imprimirMensajeRepetido(String mensaje, int veces){
        int numero = 10;
        for(int i = 0; i < veces; i++){
            System.out.println(mensaje);
        }

        numero = 23;
    }

    public static void prueba(){
        int i = 0;
        for (; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println(i);
    }

    public static void otraPrueba(int otroNumero){
        int numero;
        if(otroNumero < 10){
            numero = 20;
        }
        System.out.println(numero);
    }

    public static void ejemplo3(){
        int opcion = 1;

        switch (opcion) {
            case 1: {
                     int numero = 10;
            }
                break;  
            case 2: {
                    int numero = 20;
            }         
                break;  
        
            default:
                break;
        }
    }


}


