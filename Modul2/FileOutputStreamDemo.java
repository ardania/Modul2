/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 *
 * @author LAB_TI
 */
public class FileOutputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String destination = "D:/praktikum.txt";
        OutputStream output = new FileOutputStream(destination);
        System.out.println("Opened " + destination + " for writing");

        String data = "Try to write data using output stream";
        for (int i = 0; i<data.length(); i++){
            output.write((byte) data.charAt(i));
        }

        output.close();
        System.out.println("output stream closed");
    }
}
