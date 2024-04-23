package Regex;

import java.util.Scanner;
import java.util.regex.*;

/**
 *
 * @author amerm
 */
public class BosnianRegistrationPlates {
    public static void main (String[] args){
        String registrationPlate;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter BiH number plate to see if it's formatted right");
        registrationPlate=input.nextLine();
        Pattern pattern = Pattern.compile("[AEJKMOT|\\d]\\d{2}-[AEJKMOT]-\\d{3}");
        Matcher m = pattern.matcher(registrationPlate);
        
        if(m.find())
            System.out.println("The number plate is Bosnian format");
        else
            System.out.println("No, the plate is not Bosnian format");
                
    }
}
