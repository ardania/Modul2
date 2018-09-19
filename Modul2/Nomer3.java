/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul2;

import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;

/**
 *
 * @author LAB_TI
 */
public class Nomer3 {
    public static void main(String[] args) {
        try {
            System.out.print("Please enter your name");
            InputStream input =System.in;
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader= new BufferedReader(reader);

            String masuk =bufReader.readLine();
            String destination = "D:/praktikum.txt";
            OutputStream output = new FileOutputStream(destination);

            String data = masuk;
            for (int i=0; i<data.length(); i++){
                output.write((byte) data.charAt(i));
            }
        } catch (Exception e) {
        }

        }
    }

