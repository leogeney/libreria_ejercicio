/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libros;

/**
 *
 * @author SCIS2PC09
 */
public class libro {
    String title;
    String author;
    String genre;
    String datePub;
    String avaliable;
    int quantity;
    String loantime;
    int user;
    String loandate;
    String returnDate;
    
    
    
    void lendBook(){
        System.out.println("LIBRO ENTREGADO");
    
    }
    
    
    void returnBook(){
    
        System.out.println("LIBRO RECIBIDO");
    }
}
