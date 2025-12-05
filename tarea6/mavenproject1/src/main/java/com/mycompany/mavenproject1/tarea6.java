/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.util.HashMap;

/**
 *
 * @author Danny
 */
public class tarea6 {

public static void main(String[] args) {
      
        HashMap<String, String> informacionPersonal = new HashMap<>();

        informacionPersonal.put("nombre", "Haruto San");
        informacionPersonal.put("edad", "30");
        informacionPersonal.put("ciudad", "Japon");
        informacionPersonal.put("profesion", "Ingeniero");

    
        informacionPersonal.put("ciudad", "Osaka");

        
        informacionPersonal.put("profesion", "Ingeniero");

    
        if (!informacionPersonal.containsKey("telefono")) {
            informacionPersonal.put("telefono", "061234567890");
        }

     
        informacionPersonal.remove("edad");

        
        System.out.println("Informacion personal:");
        for (String clave : informacionPersonal.keySet()) {
            System.out.println(clave + ": " + informacionPersonal.get(clave));
        }
    }
}
