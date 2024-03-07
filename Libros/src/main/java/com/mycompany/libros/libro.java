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
    String loanTime;
    int user;
    String loandate;
    String returnDate;
    
    
    void datosLibro(String  title , String author , String genre, String datePub , String avaliable , int quantity, String loanTime, int user , String loandate , String returnDate){
    this.title = title;
    this.author = author;
    this.genre = genre;
    this.datePub = datePub;
    this.avaliable = avaliable;
    this.quantity = quantity;
    this.loanTime =loanTime;
    this.user = user;
    this.loandate = loandate;
    this.returnDate = returnDate;
    
        System.out.println("Title: " +title);
        System.out.println("Author: " + author);
        System.out.println("Genre: " + genre);
        System.out.println("Date-Pub: " + datePub);
        System.out.println("Avaliable: " + avaliable);
        System.out.println("Quantity: " + quantity);
        System.out.println("LoanTime: " +loanTime);
        System.out.println("User: " + user);
        System.out.println("Loan-date :" + loandate);
        System.out.println("Return-date: "+ returnDate);
    
    }
    
    
    void lendBook(){
        System.out.println("LIBRO ENTREGADO");
    
    }
    
    
    void returnBook(){
    
        System.out.println("LIBRO RECIBIDO");
    }
}
