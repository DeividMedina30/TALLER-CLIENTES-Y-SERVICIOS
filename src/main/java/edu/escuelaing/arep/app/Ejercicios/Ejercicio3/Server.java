package edu.escuelaing.arep.app.Ejercicios.Ejercicio3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;
import static java.lang.Integer.parseInt;

/**
 * Funciones Java
 * Curso: Arquitectura Empresarial
 * @version 1.1
 * @author Deivid Medina
 */
public class Server {

    /**
     * Clase main que ejecuta el ejercicio 3, la función main es la del servidor.
     * @param args - Argumento por defecto que contiene el main.
     * @throws Exception - Excepción para controlar posibles errores por URL.
     */
    public static void main(String[] args) throws Exception {
        ServerSocket servidor;
        Socket cliente;
        final int puerto = 4500;
        BufferedReader entrada = null;
        String mensajeCliente = "a";
        int numero = 0;
        try{
            servidor =  new ServerSocket(puerto);
            cliente = new Socket();
            cliente = servidor.accept(); //Quedamos esperando un cliente
            while (!mensajeCliente.equalsIgnoreCase("")){
                entrada = new BufferedReader(new InputStreamReader(cliente.getInputStream())); //Leyendo dato del cliente que nos manda
                mensajeCliente = entrada.readLine();
                if (!mensajeCliente.equalsIgnoreCase("")){
                    numero = parseInt(mensajeCliente);
                    System.out.println("El cuadrado del número: " + numero + ", es: " + Math.pow(numero,2));
                }

            }
            entrada.close();
            cliente.close();
            servidor.close();
        }catch (IOException ex){
            Logger.getLogger(Server.class.getName()).log(Level.SEVERE,null,ex);
        }

    }
}
