/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author LAB_TI
 */
public class FileInputStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        InputStream fileInput = new FileInputStream("D:/praktikum.txt");
        int data = fileInput.read();
        while (data != -1){
            System.out.print((char)data);
            data = fileInput.read();
        }
        fileInput.close();
    }
}
