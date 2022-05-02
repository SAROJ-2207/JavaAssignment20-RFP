package com.assignment19.bl;
/**
 * Email Verification
 */
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class EmailIsValid {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        String regex = "^[a-z+.]+@(.+)$";
        System.out.print("Enter Email-id :- ");
        String mail =sc.nextLine();

        Pattern pt = Pattern.compile(regex);
        Matcher mt = pt.matcher(mail);

        boolean email_result =mt.matches();
        System.out.print("Email-id :- "+email_result);
    }
}
