/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package com.mycompany.uas.prakstrukdat;

/**
 *
 * @author ib
 */
import java.io.File;
import java.io.IOException;
import javax.swing.*;  

public class TableExample {    
    JFrame f;    
    TableExample(){    
    f=new JFrame();    
    String data[][]={ {"101","Amit","670000"},    
                          {"102","Jai","780000"},    
                          {"101","Sachin","700000"}};    
    String column[]={"ID","NAME","SALARY"};         
    JTable jt=new JTable(data,column);    
    jt.setBounds(30,40,200,300);          
    JScrollPane sp=new JScrollPane(jt);    
    f.add(sp);          
    f.setSize(300,400);    
    f.setVisible(true);    
}     
public static void main(String[] args) throws IOException {    
    InvertedIndex idx = new InvertedIndex();
    idx.indexFile(new File("C:\\Users\\ib\\OneDrive\\Documents\\NetBeansProjects\\UAS-PrakStrukdat\\src\\main\\java\\com\\mycompany\\uas\\prakstrukdat\\test.txt"));
        
    new TableExample();    
}    
}  