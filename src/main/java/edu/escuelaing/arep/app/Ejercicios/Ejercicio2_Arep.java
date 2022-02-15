package edu.escuelaing.arep.app.Ejercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2_Arep {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        String urlIngresada = input.nextLine();
        URL newURL = new URL(urlIngresada);
        String contenidoURL = extraerDatosURL(newURL);
        crearArchivoHtml();
    }

    private static String extraerDatosURL(URL urlExtraer) throws Exception {
        String contenido = "";
        try {
            URLConnection urlConnection = urlExtraer.openConnection(); //objeto que utilizamos para examinar las propiedades del recurso remoto referenciado o para obtener su contenido
            InputStream is = urlConnection.getInputStream(); //declara los métodos para leer datos desde una fuente concreta
            BufferedReader br = new BufferedReader(new InputStreamReader(is)); // para leer el texto de una secuencia de entrada (como un archivo) almacenando en el búfer
            String linea = br.readLine();
            while (linea != null){
                contenido = linea;
                linea = br.readLine();
            }
        }catch (MalformedURLException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return contenido;
    }

    private static void crearArchivoHtml(){

    }

}
