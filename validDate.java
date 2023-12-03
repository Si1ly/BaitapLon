/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Bai_tap_lon;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ASUS
 */
public class validDate {
    public static boolean isDateValid(String date) {
    String regex ="dd-MM-yyyy";
    // Kiểm tra định dạng
    Pattern pattern = Pattern.compile(regex);
    
    Matcher matcher = pattern.matcher(date);
    if (!matcher.matches()) {
        return false;
    }

    // Kiểm tra ngày
    int day = Integer.parseInt(matcher.group(1));
    if (day < 1 || day > 31) {
        return false;
    }

    // Kiểm tra tháng
    int month = Integer.parseInt(matcher.group(2));
    if (month < 1 || month > 12) {
        return false;
    }

    // Kiểm tra năm
    int year = Integer.parseInt(matcher.group(3));
    if (year < 1900 || year > 2100) {
        return false;
    }

    return true;
}
}
