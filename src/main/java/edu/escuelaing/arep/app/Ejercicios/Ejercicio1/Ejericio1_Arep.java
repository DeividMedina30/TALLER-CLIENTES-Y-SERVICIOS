package edu.escuelaing.arep.app.Ejercicios.Ejercicio1;
import java.io.*;
import java.net.*;

public class Ejericio1_Arep {
    public static void main(String[] args) throws Exception {
        URL newUrl = new URL("https://www.geeksforgeeks.org/url-getprotocol-method-in-java-with-examples/?title=protocol#RefCreada");
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(newUrl.openStream()))) {
            System.out.println("GetProtocol: " + newUrl.getProtocol());  //La función getProtocol() devuelve el protocolo de una URL especificada.
            System.out.println("GetAuthority: " + newUrl.getAuthority()); //La función getAuthority() devuelve la autoridad de un URI especificado. La parte de Autoridad de la URL es el nombre de host y el puerto del URI.
            System.out.println("GetHost: " + newUrl.getHost());      //La función getHost() devuelve el host de una URL específica.
            System.out.println("GetPort: " + newUrl.getPort());      //Devuelve el número de puerto remoto al que está conectado el socket. Este método devolverá el número de puerto incluso después de que se cierre el socket.
            System.out.println("GetPath: " + newUrl.getPath());      //Obtiene la cadena de ruta que el File con el que se construyó el objeto, y puede ser el directorio actual relativo.
            System.out.println("GetQuery: " + newUrl.getQuery());     //La función getQuery() devuelve la consulta de una URL especificada.
            System.out.println("GetFile: " + newUrl.getFile());      //Devuelve el nombre de archivo de una URL específica.
            System.out.println("GetRef: " + newUrl.getRef());       //Devuelve la parte de referencia o ancla de una URL especificada.
        } catch (IOException x) {
            System.err.println(x);
        }
    }
}
