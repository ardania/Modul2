/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

/**
 *
 * @author LAB_TI
 */
public class InputStreamToReaderDemo {
    public static void main(String[] args) throws IOException {
        try{
            System.out.print("Please enter your name : ");

            InputStream input = System.in;
            InputStreamReader reader = new InputStreamReader(input);
            BufferedReader bufReader = new BufferedReader(reader);
            String nama = bufReader.readLine();
            System.out.println("Please to meet you, " + nama);
        }catch (IOException ide){
            System.out.println("I/O error : " + ide);
        }
    }
}
