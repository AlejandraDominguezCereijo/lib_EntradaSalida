import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean isOK_ventana = false;// aqui estan declarados como false solamente para inicializarlo podria estar true sin problema
        boolean isOK_consola = false;

        isOK_consola = EntradaSalida.salida("Hola", EntradaSalida.SALIDA_CONSOLA);
        if (!isOK_consola) System.out.println("ERROR CONSOLA");
        isOK_ventana = EntradaSalida.salida("Hello world", EntradaSalida.SALIDA_WINDOW);
        if (!isOK_ventana) System.out.println("ERROR VENTANA");


        Scanner cubrir = new Scanner(System.in);
        System.out.println("Escribe un comentario: ");
        try {
            String comentario =cubrir.nextLine();
            System.out.println(EntradaSalida.entrada(comentario));
        }catch (Exception cadena){
            System.out.println("Error al añadir el comentario");
            System.out.println(cadena.getMessage());
        }

        System.out.println("Dime tu edad: ");
        try {
            int coment= cubrir.nextInt();
            System.out.println(EntradaSalida.entrada(coment));
        }catch (Exception entero){
            System.out.println("Error al añadir la edad");
            System.out.println(entero.getMessage());
        }



    }
}