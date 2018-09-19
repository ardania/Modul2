/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author LAB_TI
 */
public class nomer4 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufReader= new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Masukan nama");
        
        for (int i = 0; i < 5; i++) {
            String data = bufReader.readLine();
            System.out.println("Anda Menulis" + data );
            if (data.equals("exit")) {
        break;
            }
        }
    }
}
