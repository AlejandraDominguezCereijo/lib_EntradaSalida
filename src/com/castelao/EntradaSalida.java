package com.castelao;

import javax.swing.*;
import java.util.Scanner;

/**
 * Libreria para sacar por dispositivos un mensaje y
 * pedir por consola distintos tipos de datos
 *
 * @author Damian Nogueiras
 * @version 0.1
 */
public class EntradaSalida {

    /**
     * opción de uso de la consola para imprimir un mensaje
     */
    public static final int SALIDA_CONSOLA = 1;
    /**
     * opción de uso de utilizar una ventana en el escritorio para sacar un mensaje
     */
    public static final int SALIDA_WINDOW = 2;
    public static final int SUMA = 1;
    public static final int RESTA = 2;
    public static final int MULTIPLICACION = 3;
    public static final int DIVISION = 4;


    private void EntradaSalida() {
    }

    ;

    /**
     * Salida por ventana o consala de un mensaje
     *
     * @param msj    cadena que queremos imprimir
     * @param device dispositivo de salida<br>consola: SALIDA_CONSOLA<br>ventana:SALIDA_VENTANA
     * @return si es true: correcto si no false
     */
    public static boolean salida(String msj, int device) {
        switch (device) {
            case SALIDA_CONSOLA:
                try {
                    System.out.println("Consola: " + msj);
                    return true;
                } catch (Exception e) {
                    return false;
                }

            case SALIDA_WINDOW:
                try {
                    JOptionPane.showMessageDialog(null, "Sale por un ventana " + msj);
                    return true;
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                    return false;
                }
            default:
                return false;
        }
    }

    /**
     * Método para obtener cadena de caracteres por consola
     *
     * @param comentario
     * @return comentario: nos va  a retornar el String que introdujo el usuario previamente
     */
    public static String entrada(String comentario) {

        return comentario;
    }

    /**
     * Método para obtener datos enteros por consola
     *
     * @param coment
     * @return coment: nos va  a retornar el int que introdujo el usuario previamente
     */
    public static int entrada(int coment) {


        return coment;
    }
    /**
     * Método para realizar operaciones, sumar, restar multiplicar y dividir
     *
     * @param dato1,dato2 son los valoros con los que realizar la operacion
     * @param operacion es para indicar la operacion que queremos realizar
     * @return operacion
     */
    public static int calculadora(float dato1, float dato2, int operacion) {
            switch (operacion) {
                case SUMA:
                    try {
                        float suma = dato1 + dato2;
                        System.out.println("El resultado de la suma es: " + suma);
                    } catch (Exception calcular) {
                        System.out.println("Error al realizar la operacion");
                        System.out.println(calcular.getMessage());
                    }
                    break;
                case RESTA:
                    try {
                        float resta = dato1 - dato2;
                        System.out.println("El resultado de la resta es: " + resta);
                    } catch (Exception calcular) {
                        System.out.println("Error al realizar la operacion");
                        System.out.println(calcular.getMessage());
                    }
                    break;
                case MULTIPLICACION:
                    try {
                        float multiplicacion = dato1 * dato2;
                        System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
                    } catch (Exception calcular) {
                        System.out.println("Error al realizar la operacion");
                        System.out.println(calcular.getMessage());
                    }
                    break;
                case DIVISION:
                    try {
                        float division =(Integer) Math.round(dato1/dato2);/*con Math.round conseguimos que solo nos devuelva la parte entera de la division*/
                        System.out.println("El resultado de la division es: " + division);
                    } catch (Exception calcular) {
                        System.out.println("Error al realizar la operacion");
                        System.out.println(calcular.getMessage());
                    }
                    break;
            }
            return operacion;

    }
}
