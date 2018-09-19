/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package Modul2;

import java.awt.BorderLayout;
import java.awt.Image;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author LAB_TI
 */
public class ImageInputStreamDemo {
    public static void main(String[] args) throws IOException {
        Image image = null;
        try{
            File sourceimage = new File("D:/Koala.jpg");
            image = ImageIO.read(sourceimage);

            InputStream is = new BufferedInputStream(new FileInputStream("D:/Koala.jpg"));
            image = ImageIO.read(is);
        } catch (IOException e){
        }

        JFrame frame = new JFrame();
        JLabel label = new JLabel(new ImageIcon(image));
        frame.getContentPane().add(label, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
}
