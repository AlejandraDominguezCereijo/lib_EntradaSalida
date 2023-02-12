import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        boolean isOK_ventana = false;// aqui estan declarados como false solamente para inicializarlo podria estar true sin problema
        boolean isOK_consola = false;
        /*boolean isOK_suma = false;
        boolean isOK_resta = false;
        boolean isOK_multiplicacion = false;
        boolean isOK_division = false;*/

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");

        Scanner cubrir = new Scanner(System.in);
        System.out.println("Escribe un comentario: ");
        try {
            String comentario = cubrir.nextLine();
            System.out.println(EntradaSalida.entrada(comentario));
        } catch (Exception cadena) {
            System.out.println("Error al añadir el comentario");
            System.out.println(cadena.getMessage());
        }

        System.out.println("Dime tu edad: ");
        try {
            int coment = cubrir.nextInt();
            System.out.println(EntradaSalida.entrada(coment));
        } catch (Exception entero) {
            System.out.println("Error al añadir la edad");
            System.out.println(entero.getMessage());
        }
        System.out.println("¿Que operacion quieres realizar? \n1 Suma \n2 Resta \n3 Multiplicacion \n4 Division");
        int operacion = cubrir.nextInt();
        EntradaSalida.calculadora(5, 2, operacion);

        /*isOK_suma=EntradaSalida.calculadora(10,5,EntradaSalida.SUMA);
        isOK_resta=EntradaSalida.calculadora(10,5,EntradaSalida.RESTA);
        isOK_multiplicacion=EntradaSalida.calculadora(3,5,EntradaSalida.MULTIPLICACION);
        isOK_division=EntradaSalida.calculadora(7,2,EntradaSalida.DIVISION);*/
    }
}
