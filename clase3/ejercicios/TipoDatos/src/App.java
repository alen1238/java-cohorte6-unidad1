public class App {

    public static void main(String[] args) throws Exception {
        byte numero = 125;

        short numero2 = 12534;

        int numero3 = 1_253_456_789;

        long numero4 = 1_253_456_789L;

        numero4 = 3;

        var numero5 = 125;

        float numero6 = 3.143535534f;
        System.out.println(numero6);

        var numero7 = 3.143535534;

        // tipo de dato variable = (lo que ingrese el usuario.)

        float gramos; //declaración de variable

            gramos= 3.5f; //asignación de variable
        

            boolean expresion = gramos > 3.0f && gramos < 5.0f; //expresión booleana
            System.out.println(expresion);

        char letra = 'A';
        char caracterNoImprimible = '\u0000';

        String saludo = "Hola\tMundo1";

        String palabra = "Hola\tMundo2";

        System.out.println(saludo);
        System.out.println(palabra);

        System.out.println("Retorno de carro\rHola Mundo3");

        String multilinea = """
                Hola Mundo4

                Hola Mundo5
                """;

        //System.out.println(multilinea);
        System.out.println("Este es el valor de numero: " + numero);
        System.out.println("Este es el valor de numero2: " + numero2);

        System.out.print("Aquí no salta linea...\n\n");
        System.out.println("Esta se supone que es otra linea");
        System.out.println("esta es otra linea");


    }

}
