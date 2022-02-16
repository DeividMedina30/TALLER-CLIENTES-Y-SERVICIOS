package edu.escuelaing.arep.app.Ejercicios.Ejercicio2;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Funciones Java
 * Curso: Arquitectura Empresarial
 * @version 1.1
 * @author Deivid Medina
 */
public class Ejercicio2_Arep {

    /**
     * Clase main que ejecuta el ejercicio 2.
     * @param args - Argumento por defecto que contiene el main.
     * @throws Exception - Excepción para controlar posibles errores por URL.
     */
    public static void main(String[] args) throws Exception {
       extraerDatosURL(leerURL());
    }

    /**
     * Función que me permite leer la URL ingresada por consola, para poder extraer sus datos.+
     * @return newURL - Retorna la URL ingresa, en formato URL.
     * @throws MalformedURLException - Excepción que me permite controlar las URL mal formadas.
     */
    private static URL leerURL() throws MalformedURLException {
        Scanner input = new Scanner(System.in);
        String urlIngresada = input.nextLine();
        URL newURL = new URL(urlIngresada);
        return newURL;
    }

    /**
     * Función que me permite extraer los datos de la URL, y colocarlos en un archivo llamado resultado.html que se encuentra en la carpeta de ejercicio2.
     * @param urlExtraer - URL que se ingresó por consola, a la cual pensamos extraer sus datos.
     * @throws Exception - Excepción para controlar posibles errores por URL.
     */
    private static void extraerDatosURL(URL urlExtraer) throws Exception {
        File archvivo = new File("src/main/java/edu/escuelaing/arep/app/Ejercicios/Ejercicio2/resultado.html");
        try {
            URLConnection urlConnection = urlExtraer.openConnection(); //objeto que utilizamos para examinar las propiedades del recurso remoto referenciado o para obtener su contenido
            InputStream is = urlConnection.getInputStream(); //declara los métodos para leer datos desde una fuente concreta
            BufferedReader br = new BufferedReader(new InputStreamReader(is)); // para leer el texto de una secuencia de entrada (como un archivo) almacenando en el búfer
            BufferedWriter bw = new BufferedWriter(new FileWriter(archvivo));
            String linea = br.readLine();
            while (linea != null){
                bw.write(linea);
                bw.newLine();
                linea = br.readLine();
            }
            br.close();
            bw.close();
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}
