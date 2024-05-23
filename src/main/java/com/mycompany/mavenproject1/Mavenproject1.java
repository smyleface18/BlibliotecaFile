/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import com.mycompany.mavenproject1.classBiblioteca.Admin;
import java.io.File;
import java.io.IOException;

/**
 *
 * @author SCIS2-22
 */
public class Mavenproject1 {

    public static void main(String[] args) throws IOException {
      
        Admin caleb = new Admin("caleb");
       
        caleb.crearFile("caleb");
        caleb.WitreLibro("caleb", "Ojala sirva");
        
        
       
    }
}
