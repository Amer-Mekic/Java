/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Swing_AP;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.StringTokenizer;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

/**
 *
 * @author amerm
 */
public class PigLatin extends JFrame implements ActionListener{
    private JButton button;
    private JPanel panel;
    private JTextArea text1, text2;
    private JLabel label,label2;
    private Font font;
    public PigLatin(){
        super("English to Pig Latin translator");
        setSize(500,500);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.getContentPane().setBackground(new Color(250,235,215));
        
        setLayout(new GridLayout(2,1));
        panel=new JPanel();
        label = new JLabel("English Text: ");
        text1=new JTextArea(1,15);
        label2 = new JLabel("Pig Latin: ");
        text2=new JTextArea(1,15);
        text2.setEditable(false);
        panel.add(label);
        panel.add(text1);
        panel.add(label2);
        panel.add(text2);       
        add(panel);
        
        button=new JButton("TRANSLATE");
        button.setBackground(new Color(255,218,185));
        button.addActionListener(this);
        font = new Font("Times New Roman", Font.BOLD, 16);
        button.setFont(font);
        add(button);
        setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e){
        String getEnglish = text1.getText();
        String delimiters = " ";
        StringTokenizer token = new StringTokenizer(getEnglish,delimiters);
        while(token.hasMoreTokens()){           
            
            String word =token.nextToken();
            char[] ch = word.toCharArray();
            
            if(ch[0]=='A' || ch[0]=='E' || ch[0]=='O' || ch[0]=='I' || ch[0]=='U'||ch[0]=='a' || ch[0]=='e' || ch[0]=='o' || ch[0]=='i' || ch[0]=='u'){
                text2.append(word+"way ");
            }
            else if (ch[0]!='A' || ch[0]!='E' || ch[0]!='O' || ch[0]!='I' || ch[0]!='U'||ch[0]!='a' || ch[0]!='e' || ch[0]!='o' || ch[0]!='i' || ch[0]!='u'){              
                StringBuilder newWord=new StringBuilder();
                for(int i =1;i<ch.length;i++){
                    newWord.append(ch[i]);                   
                }
                newWord.append(ch[0]);
                text2.append(newWord.toString()+"ay ");
            }  
        }          
    }  
}
