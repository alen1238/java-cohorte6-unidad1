public class App {
    public static void main(String[] args) throws Exception {
        int calificacion = 60;
        String mensaje = (calificacion >= 90) ? "Excelente" : 
                        (calificacion >= 80) ? "Muy bien":
                        (calificacion >= 70) ? "Bien": "necesita mejorar";


        int diaSemana = 3; // 1=Lunes, 2=Martes, etc.

// Usando switch expression para asignar un valor a una variable
String nombreDiaModerno = switch (diaSemana) {
    case 1 -> "Lunes";
    case 2 -> "Martes";
    case 3 -> "Miércoles";
    case 4 -> "Jueves";
    case 5 -> "Viernes";
    case 6, 7 -> "Fin de semana"; // Múltiples casos separados por coma
    default -> "Día inválido";
}; // Nota el punto y coma al final de la expresión switch

System.out.println("El día (moderno) es: " + nombreDiaModerno); // Salida: El día (moderno) es: Miércoles


    }
}
