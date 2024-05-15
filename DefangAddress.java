/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Arrays;

/**
 *
 * @author amerm
 */
public class DefangAddress {
    public static String defangIPaddr(String address) {
        String newS = new String();
        for(int i = 0;i<address.length();i++){
            if(address.charAt(i)!='.'){
                newS+=address.charAt(i);
            }
            else{
                newS+="[.]";
            }
        }
        return newS;
    }
    public static void main(String[] args){
        System.out.println(defangIPaddr("1.1.1.1"));
    }
}
