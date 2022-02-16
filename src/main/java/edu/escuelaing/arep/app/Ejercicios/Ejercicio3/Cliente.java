package edu.escuelaing.arep.app.Ejercicios.Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Funciones Java
 * Curso: Arquitectura Empresarial
 * @version 1.1
 * @author Deivid Medina
 */
public class Cliente {

    /**
     * Clase main que ejecuta el ejercicio 3, la función main es la del Cliente.
     * @param args - Argumento por defecto que contiene el main.
     * @throws Exception - Excepción para controlar posibles errores por URL.
     */
    public static void main(String[] args) throws Exception {
        final String host= "127.0.0.1";
        final int puerto = 4500;
        final BufferedReader tecladoCliente;
        PrintStream salida = null;
        String teclado = "a";
        try{
            Socket clienteSocket = new Socket(host,puerto);
            tecladoCliente = new BufferedReader(new InputStreamReader(System.in));//Ingrese datos usando BufferReader
            while(!teclado.equalsIgnoreCase("")){
                teclado = tecladoCliente.readLine();           // Leyendo datos usando readLine
                salida = new PrintStream(clienteSocket.getOutputStream());
                salida.println(teclado);
            }
            salida.close();
            clienteSocket.close();
            tecladoCliente.close();
        }catch (IOException ex){
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
}
