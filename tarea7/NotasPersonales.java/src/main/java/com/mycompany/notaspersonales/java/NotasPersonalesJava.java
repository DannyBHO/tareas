

package com.mycompany.notaspersonales.java;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;

public class NotasPersonalesJava {

    // Función para escribir en un archivo
    public static void escribirArchivo(String nombreArchivo) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
           writer.write("Nota 1: me gusta comer.");
            writer.newLine();
            writer.write("Nota 2: Hacer ejercicios todos los dias.");
            writer.newLine();
            writer.write("Nota 3: siempre ando intentando hacer algo nuevo.");
            writer.newLine();

            System.out.println("Archivo escrito correctamente.");
        } catch (IOException e) {
            System.out.println("Error al escribir: " + e.getMessage());
        }
    }

    // Función para leer un archivo
    public static void leerArchivo(String nombreArchivo) {
        try (BufferedReader reader = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Contenido del archivo:");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer: " + e.getMessage());
        }
    }

    // Método principal
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Debes indicar el nombre del archivo como argumento.");
            return;
        }

        String archivo = args[0]; 

        escribirArchivo(archivo);
        leerArchivo(archivo);
    }
}




