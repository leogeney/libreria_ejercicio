/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.libros;
import java.awt.print.Book;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SCIS2PC09
 */
public class libro {
    Scanner entrada = new Scanner(System.in);
    String title;
    String author;
    String genre;
    String datePub;
    String avaliable;
    int quantity;
    int loanTime;
    String user;
    String loandate;
    String returnDate;

    
    
    
    void datosLibro(String  title , String author , String genre, String datePub , String avaliable , int quantity, int loanTime, String user ){
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
    
      
    }
    
    
    void lendBook(){
        System.out.println("LIBRO ENTREGADO");
        this.quantity --;
        SimpleDateFormat fechaf = new SimpleDateFormat("dd/mm/yyyy");
               
               Date fecha = new Date();
              Calendar c1 = Calendar.getInstance();
             
              String fecha_H = String.valueOf(c1.get(Calendar.DATE))+"/"+String.valueOf(c1.get(Calendar.MONTH)+1)+"/"+String.valueOf(c1.get(Calendar.YEAR));
            try {

                Date fechaHoy = fechaf.parse(fecha_H);
               
                long sumaFecha = fechaHoy.getTime() + (this.loanTime*24*60*60*1000); //convierto loanTime en milisegundos
                 Instant instant = Instant.ofEpochMilli(sumaFecha);
                 Date myDate = Date.from(instant);
                 this.loandate = fecha_H;
                 this.returnDate = fechaf.format(myDate);

               
            } catch (ParseException ex) {
                Logger.getLogger(Book.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            System.out.println("¿a quien se le entrega?");
            user = entrada.nextLine();
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
    
    
    void returnBook(){
    
        System.out.println("LIBRO RECIBIDO");
        this.quantity++;
        System.out.println("¿a quien se le entrega?");
            user = entrada.nextLine();
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
    
    
    
}
