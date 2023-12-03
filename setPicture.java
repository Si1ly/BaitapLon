/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_tap_lon;

import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author ASUS
 */
public class setPicture {
    public void Picture(String src, JLabel label){
        ImageIcon icon = new ImageIcon(src);
        label.setIcon(icon);
    }
}
