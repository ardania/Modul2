/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul2;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

/**
 *
 * @author LAB_TI
 */
public class OutputStreamToWriteDemo {
    public static void main(String[] args) {
        try{
            OutputStream output = System.out;
           OutputStreamWriter write = new OutputStreamWriter(output);
            write.write("Hello world");

            write.flush();
            write.close();
        }catch (IOException ide){
            System.out.println("I/O error : " + ide);
        }
    }
}
