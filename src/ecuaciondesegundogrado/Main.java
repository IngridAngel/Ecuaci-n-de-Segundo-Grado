/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecuaciondesegundogrado;

import java.util.Scanner;
import modelo.EcuacionDeSegundoGrado;

/**
 *
 * @author jany-yin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   
     Scanner entrada = new Scanner(System.in);
      
      double a,b,c; 
      
      
       System.out.print("Ingrese el valor de a: ");
        a = entrada.nextDouble();
        System.out.print("Ingrese el valor de b: ");
        b = entrada.nextDouble();       
        System.out.print("Ingrese el valor de c: ");
        c = entrada.nextDouble();  
      
         EcuacionDeSegundoGrado Ecuacion = new EcuacionDeSegundoGrado(1,1,1);
                  Ecuacion.setCoeficienteA(a);
                Ecuacion.setCoeficienteB(b);
                Ecuacion.setCoeficienteC(c);
      
        System.out.println("Discriminante: " + Ecuacion.getDiscriminante());
       System.out.println("Numero de soluciones Reales: " + Ecuacion.getNumeroDeSolucionesReales());
        
        if(a == 0 )
        {
           //  System.out.println("La ecuacion no es de segundo GRADO"); 
        }
        else
        {
            if( Ecuacion.getDiscriminante() == 0)
               {
                  System.out.println("Raiz 1 : " + Ecuacion.getRaiz1()); 
               } 
            else{
                if( Ecuacion.getDiscriminante() > 0)
               {
                  System.out.println("Raiz 1 : " + Ecuacion.getRaiz1()); 
                  System.out.println("Raiz 2 : " + Ecuacion.getRaiz2()); 
               }  
            }
        }
   }

}
