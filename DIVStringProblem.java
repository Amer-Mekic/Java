/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Summer;

import java.util.StringTokenizer;

/**
 *
 * @author amerm
 */
public class DIVStringProblem {
    /*
    String argument
    String is of type HTML with <div> but is missing </div>, so we have to add missing divs.
    */
    public static void DivGive(String s){
        StringBuilder sb = new StringBuilder(s);
        String div = "<div>";
        StringTokenizer st = new StringTokenizer(s);   
        String firstToken = st.toString();
        while(st.hasMoreTokens()){
            if(!firstToken.equals(div)){
                firstToken=st.nextToken();
            }
            else {
                sb.setLength(sb.capacity()+7);
                sb.append(" </div>");
                firstToken=st.nextToken();
            }
        }
        System.out.println(sb.toString());
    }
    public static void main(String [] args){
        DivGive("<div> plw. <div> ..!'* <p> <div> >t< ");
    }
}
