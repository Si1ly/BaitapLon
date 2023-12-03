/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_tap_lon;

/**
 *
 * @author ASUS
 */
public class inra_CungHoangDao {

    public String in_CungHoangDao(String date ) {
       
        int day = Integer.parseInt(date.substring(0, 2).toString());
        int month = Integer.parseInt(date.substring(3, 5).toString());
        int year = Integer.parseInt(date.substring(6, 10).toString());
        // Tính cung hoàng đạo
        int sign = (month - 1) * 30 + day;
        String zodiac = "";
        if (sign >= 0 && sign <= 30) {
            zodiac = "Bạch Dương";
        } else if (sign >= 31 && sign <= 59) {
            zodiac = "Kim Ngưu";
        } else if (sign >= 60 && sign <= 89) {
            zodiac = "Song Tử";
        } else if (sign >= 90 && sign <= 119) {
            zodiac = "Cự Giải";
        } else if (sign >= 120 && sign <= 149) {
            zodiac = "Sư Tử";
        } else if (sign >= 150 && sign <= 179) {
            zodiac = "Xử Nữ";
        } else if (sign >= 180 && sign <= 209) {
            zodiac = "Thiên Bình";
        } else if (sign >= 210 && sign <= 239) {
            zodiac = "Bọ Cạp";
        } else if (sign >= 240 && sign <= 269) {
            zodiac = "Nhân Mã";
        } else if (sign >= 270 && sign <= 299) {
            zodiac = "Ma Kết";
        } else if (sign >= 300 && sign <= 329) {
            zodiac = "Bảo Bình";
        } else {
            zodiac = "Song Ngư";
        }
        
        return zodiac;
    }
    
}
