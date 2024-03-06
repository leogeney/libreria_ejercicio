/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.libros;

import java.util.Scanner;

/**
 *
 * @author SCIS2PC09
 */
public class Libros {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int opc;
        Character O;
        
        
                
                
        libro libro1 = new libro();
        libro libro2 = new libro();
        libro libro3 = new libro();
        libro libro4 = new libro();
        libro libro5 = new libro();
        
        
        
        
        
        
        
        
        
        
        //libro #1
        libro1.title = "100 años de soledad";
        libro1.author = "Gabriel Garcia Marquez";
        libro1.genre = "Novela, Ficcion...etc"; 
        libro1.avaliable = "DISPONIBLE";
        libro1.quantity= 9;
        libro1.loantime = "12 DIAS";
        libro1.user = 192210;
        libro1.returnDate = "24 de febrero";
        libro1.loandate = "12 de febrero";
        
        //libro #2
        libro2.title = "El extranjero";
        libro2.author = "Albert Camus";
        libro2.genre = "Novela, Ficcion filosofica...etc"; 
        libro2.avaliable = "DISPONIBLE";
        libro2.quantity= 2;
        libro2.loantime = " 3 DIAS";
        libro2.user = 192209;
        libro2.returnDate = "20 de febrero";
        libro2.loandate = "17 de febrero";
        
        //libro #3
        libro3.title = "Guerra y paz";
        libro3.author = "León Tolstói";
        libro3.genre = "Novela historica, Ficcion filosofica...etc"; 
        libro3.avaliable = "NO DIPONIBLE";
        libro3.quantity= 0;
        libro3.loantime = "OCHO DIAS";
        libro3.user = 192211;
        libro3.returnDate = "10 de febrero";
        libro3.loandate = "2 de febrero";
        
        //libro #4
        libro4.title = "Orgullo y prejucio";
        libro4.author = "Jane Austen";
        libro4.genre = "Novela Rosa,Satira"; 
        libro4.avaliable = "DISPONIBLE";
        libro4.quantity= 1;
        libro4.loantime = "15 DIAS";
        libro4.user = 192244;
        libro4.returnDate = "15 de febrero";
        libro4.loandate = "2 de marzo";
        
        
        
        //libro #5
        libro5.title = "EL DIARIO DE ANA FRANK";
        libro5.author = "Ana Frank";
        libro5.genre = "Biografia, Narrativa personal...etc"; 
        libro5.avaliable = "DISPONIBLE";
        libro5.quantity= 6;
        libro5.loantime = "4 DIAS";
        libro5.user = 192212;
        libro5.returnDate = "8 de febrero";
        libro5.loandate = "12 de febrero";
        
          
        
        
        
        System.out.println("LIBRERIA LEYENDO");
        System.out.println("1. 100 AÑOS DE SOLEDAD");
        System.out.println("2. EL EXTRANJERO");
        System.out.println("3.GUERRA Y PAZ");
        System.out.println("4. ORGULLO Y PREJUCIO");
        System.out.println("5. EL DIARIO DE ANA FRANK");
       opc = entrada.nextInt();
         
        switch(opc){
            case 1 : 
                
                System.out.println(libro1.title );
                System.out.println(libro1.author);
                System.out.println(libro1.genre);
                System.out.println(libro1.avaliable);
                System.out.println(libro1.quantity);
                System.out.println(libro1.loantime);
                System.out.println(libro1.user);
                System.out.println(libro1.returnDate);
                System.out.println(libro1.loandate);
                
                
                System.out.println("ENTREGADO MARQUE 'E'  O RECIBIDO MARQUE 'R'" );
                O = entrada.next().charAt(0);
                if ( O == 'E'){
                
                libro1.lendBook();
                }
                if( O == 'R'){
                libro1.returnBook();
                }
                
    
                break;
    
            case 2 : 
                System.out.println(libro2.title );
                System.out.println(libro2.author);
                System.out.println(libro2.genre);
                System.out.println(libro2.avaliable);
                System.out.println(libro2.quantity);
                System.out.println(libro2.loantime);
                System.out.println(libro2.user);
                System.out.println(libro2.returnDate);
                System.out.println(libro2.loandate);
                
                
                System.out.println("ENTREGADO MARQUE 'E'  O RECIBIDO MARQUE 'R'" );
                O = entrada.next().charAt(0);
                if ( O == 'E'){
                
                libro1.lendBook();
                }
                if( O == 'R'){
                libro1.returnBook();
                }
                
                break;
        
        case 3 : 
        System.out.println(libro1.title );
                System.out.println(libro3.author);
                System.out.println(libro3.genre);
                System.out.println(libro3.avaliable);
                System.out.println(libro3.quantity);
                System.out.println(libro3.loantime);
                System.out.println(libro3.user);
                System.out.println(libro3.returnDate);
                System.out.println(libro3.loandate);
                
                
                System.out.println("ENTREGADO MARQUE 'E'  O RECIBIDO MARQUE 'R'" );
                O = entrada.next().charAt(0);
                if ( O == 'E'){
                
                libro1.lendBook();
                }
                if( O == 'R'){
                libro1.returnBook();
                }
                
                break;
                
                
        case 4 : 
             
                System.out.println(libro4.title );
                System.out.println(libro4.author);
                System.out.println(libro4.genre);
                System.out.println(libro4.avaliable);
                System.out.println(libro4.quantity);
                System.out.println(libro4.loantime);
                System.out.println(libro4.user);
                System.out.println(libro4.returnDate);
                System.out.println(libro4.loandate);
                
                
                System.out.println("ENTREGADO MARQUE 'E'  O RECIBIDO MARQUE 'R'" );
                O = entrada.next().charAt(0);
                if ( O == 'E'){
                
                libro1.lendBook();
                }
                if( O == 'R'){
                libro1.returnBook();
                }
                
                
               break;
               
               
        case 5 :
                System.out.println(libro5.title );
                System.out.println(libro5.author);
                System.out.println(libro5.genre);
                System.out.println(libro5.avaliable);
                System.out.println(libro5.quantity);
                System.out.println(libro5.loantime);
                System.out.println(libro5.user);
                System.out.println(libro5.returnDate);
                System.out.println(libro5.loandate);
                
                System.out.println("ENTREGADO MARQUE 'E'  O RECIBIDO MARQUE 'R'" );
                O = entrada.next().charAt(0);
                if ( O == 'E'){
                
                libro1.lendBook();
                }
                if( O == 'R'){
                libro1.returnBook();
                }
    
    } 
       
        
        
        
        
        
    }
}
