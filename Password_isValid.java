package com.assignment19.bl;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password_isValid {

        public static void main(String[] args) {

            Scanner sc = new Scanner (System.in);
            String regex = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[@$!%*#?&])[A-Za-z\\d@$!%*#?&]{8,}$";
            System.out.print("Enter Password  :- ");
            String password =sc.nextLine();

            Pattern pt = Pattern.compile(regex);

            if (password.matches(regex)) {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");
            }
    }
}
