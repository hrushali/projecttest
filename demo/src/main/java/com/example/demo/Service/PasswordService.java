package com.example.demo.Service;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class PasswordService {

    public String generatePassword(String firstName, String middleName, String lastName) {
        String firstPart = firstName.length() >= 2 ? firstName.substring(0, 2) : firstName;
        String middlePart = middleName.length() >= 2 ? middleName.substring(0, 2) : middleName;
        String lastPart = lastName.length() >= 2 ? lastName.substring(0, 2) : lastName;

        Random random = new Random();
        int randomDigits = 100 + random.nextInt(900); 
        return firstPart + middlePart + lastPart + randomDigits;
    }
}
