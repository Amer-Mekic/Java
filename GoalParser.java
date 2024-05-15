/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author amerm
 */
public class GoalParser {
    public static String interpret(String command) {
        String news = new String();
        for(int i = 0;i<command.length();i++){
            if(command.charAt(i)=='G')
                news+="G";
            else if(command.charAt(i)=='(' &&command.charAt(i+1)==')')
                news+="o";
            else if(command.charAt(i)=='(' &&command.charAt(i+1)=='a')
                news+="al";
        }
        return news;
    }
    public static void main(String[] args){
        System.out.println(interpret("G()()()()(al)"));
    }
}
