/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.classBiblioteca;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author SCIS2-22
 */
public class Admin {
    
    private File file;
    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private String name;

    public Admin(String name) throws FileNotFoundException {
        this.name = name;
    }
    
    public void crearFile(String nameFile){
    
        file = new File("./"+nameFile+".txt");
    }
    
    public void WitreLibro(String nameFile,String text) throws FileNotFoundException, IOException{
        File ficher = new File("./"+nameFile+".txt");
        try{
        FileWriter writer = new FileWriter(ficher);
        PrintWriter pw = new PrintWriter(writer);
        pw.println(text);
        pw.close();
        }
        catch(FileNotFoundException e){
            e.printStackTrace();
        }
        catch(IOException e2){
            e2.printStackTrace();
        }
        
        
        
        
        
    }
    
}
