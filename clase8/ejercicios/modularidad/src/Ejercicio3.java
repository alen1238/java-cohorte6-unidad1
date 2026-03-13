import java.util.Scanner;

public class Ejercicio3 {

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        double horas = leerHoras(sc);
        double valorHora = 10000; 
        double base = calcularSalarioBase(horas, valorHora);
        double bono = 0;
        if(seAplicaBono(horas, 40)){
            bono = 20000;
        }
        double salarioTotal = calcularSalarioTotal(base, bono);
        imprimirMensaje(salarioTotal);
    }

    public static double leerHoras(Scanner sc) {
        System.out.print("Ingrese horas: ");
        double horas = sc.nextDouble();
        sc.nextLine();
        return horas;
    }

    public static double calcularSalarioBase(double horas, double valorHoras) {
        return horas * valorHoras;
    }

    public static boolean seAplicaBono(double horas, double horasMinimas) {
        return horas > horasMinimas;
    }

    public static double calcularSalarioTotal(double salarioBase, double bono) {
        return salarioBase + bono;
    }

    public static void imprimirMensaje(double salarioTotal) {
        System.out.println("Salario total: " + salarioTotal);
    }   

}
