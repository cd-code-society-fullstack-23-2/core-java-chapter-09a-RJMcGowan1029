package com.codedifferently.partA;

public class Challenge {
    public String formatPhoneNumber(int[] digits){
        StringBuilder phoneNumber = new StringBuilder();
        for (int digit : digits) {
            phoneNumber.append(digit);
        }
        String areaCode = "(" + phoneNumber.substring(0, 3) + ") ";
        String middle = phoneNumber.substring(3, 6) + "-";
        String end = phoneNumber.substring(6);
        return areaCode + middle + end;
    }
}
