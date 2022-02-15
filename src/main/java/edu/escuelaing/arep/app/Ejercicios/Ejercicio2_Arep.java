package edu.escuelaing.arep.app.Ejercicios;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2_Arep {
    public static void main(String[] args) throws Exception {
       extraerDatosURL(leerURL());
    }

    private static URL leerURL() throws MalformedURLException {
        Scanner input = new Scanner(System.in);
        String urlIngresada = input.nextLine();
        URL newURL = new URL(urlIngresada);
        return newURL;
    }

    private static void extraerDatosURL(URL urlExtraer) throws Exception {
        File archvivo = new File("src/main/java/edu/escuelaing/arep/app/Ejercicios/resultado.html");
        try {
            URLConnection urlConnection = urlExtraer.openConnection(); //objeto que utilizamos para examinar las propiedades del recurso remoto referenciado o para obtener su contenido
            InputStream is = urlConnection.getInputStream(); //declara los métodos para leer datos desde una fuente concreta
            BufferedReader br = new BufferedReader(new InputStreamReader(is)); // para leer el texto de una secuencia de entrada (como un archivo) almacenando en el búfer
            BufferedWriter bw = new BufferedWriter(new FileWriter(archvivo));
            String linea = br.readLine();
            while (linea != null){
                bw.write(linea);
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
