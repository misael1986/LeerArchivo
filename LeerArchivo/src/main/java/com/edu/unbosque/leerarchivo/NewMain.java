/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.edu.unbosque.leerarchivo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Usuario
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String csvFile = "archivo.txt";
        BufferedReader br = null;
        String line = "";

        String cvsSplitBy = ",";//Se define separador ","
        try {
            br = new BufferedReader(new FileReader(csvFile));//se lee el archivo
            while ((line = br.readLine()) != null) {//se recorre linea * linea
                String[] datos = line.split(cvsSplitBy);//se separa usando la coma ','
                //Imprimir los datos linea por linea.
                System.out.println(datos[0] + ", " + datos[1] + ", " + datos[2] 
                        + ", " + datos[3] + ", " + datos[4] + ", " + datos[5]);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

}
