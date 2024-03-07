

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
        
     
       
        
        
    //elegir opcion del libro
        System.out.println("Libros en disponibilidad");
        System.out.println("1. 100 AÑOS DE SOLEDAD");
        System.out.println("2. EL EXTRANJERO");
        System.out.println("3.GUERRA Y PAZ");
        System.out.println("4. ORGULLO Y PREJUCIO");
        System.out.println("5. EL DIARIO DE ANA FRANK");
        
         opc = entrada.nextInt();
         
        switch(opc){
            case 1 : 
                    libro1.datosLibro("100 años de soledad", "Gabriel Garcia Marquez","Novela, Ficcion...etc", "", "DISPONIBLE", 9, 12, "192210");

                   
                    break;
    
            case 2 : 
                    libro2.datosLibro("El extranjero", "Albert Camus", "Novela, Ficcion filosofica...etc", "", "DISPONIBLE", 2,3, "192211" );
                    
                    
                    break;
        
            case 3 : 
                   libro3.datosLibro("Guerra y paz", "Leo Tolstói","Novela historica, Ficcion filosofica...etc", "", "NO DISPONIBLE", 0, 4, "192121");

                
                   break;
                
                
            case 4 : 
                   libro4.datosLibro("Orgullo y prejucio", "Jane Austen", "Novela Rosa,Satira", "", "DISPONIBLE", 1, 5,"182121");

                
                   break;
               
               
        case 5 :
                libro5.datosLibro("EL DIARIO DE ANA FRANK", "Ana Frank", "Biografia, Narrativa personal...etc", "", "DISPONIBLE", 6, 8, "192112" );


                    break;
    

        }
         System.out.println("ENTREGADO MARQUE 'E'  O RECIBIDO MARQUE 'R'" );
                    O = entrada.next().charAt(0);
                    if ( O == 'E' || O == 'e'){
                    libro1.lendBook();
                    
                    }
                    if( O == 'R' || O == 'r'){
                    libro1.returnBook();
                    }
    }
}
