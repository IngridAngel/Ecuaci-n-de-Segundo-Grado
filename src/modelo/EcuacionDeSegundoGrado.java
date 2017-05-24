/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author jany-yin
 */
public class EcuacionDeSegundoGrado {
    private double a;
    private double b;
    private double c;
    
    public EcuacionDeSegundoGrado ( double a, double b, double c){
        this.a = a;
        this.b = b; 
        this.c = c; 
    }
    
    public double getCoeficienteA()
        {
            return this.a;
        }
    public double getCoeficienteB()
        {
            return this.b;
        }
    public double getCoeficientec()
        {
             return this.c;
        }
    public int getDiscriminante()
        {
            int discriminante=((int) Math.pow(this.b, 2)) - 4 * ((int)this.a)* ((int) c);
           //Math.pow(b, 2)- 4*a*c
            return discriminante;
           
        }
    
    public double getNumeroDeSolucionesReales()
        {
            int numeroDeSolucionesReales=0;
            
            if(this.a == 0 )
        {
           System.out.println("La ecuacion no es de segundo GRADO"); 
        }
        else
        {
            if(this.getDiscriminante() < 0)
            {
                numeroDeSolucionesReales=0;
              
            }  
            else
            {
               if(this.getDiscriminante() == 0)
               {
                   numeroDeSolucionesReales=1;
                
               }
               else
               {
                   numeroDeSolucionesReales=2;
               }
            }
        }    
            return numeroDeSolucionesReales;   
           }  
           
     public double getRaiz1()
        {
             double Raiz1 =0;
             if( this.getDiscriminante()== 0)
               {
                   Raiz1 = -(this.b)/ (2* this.a);
               }
               
            return Raiz1;
            
        }
     
    public double getRaiz2()
        {
             double Raiz2 =0;
             if( this.getDiscriminante() > 0)
               {
  
                   Raiz2 = -(this.b) + ((double) Math.sqrt(this.getDiscriminante())) / (2*this.a);
                   Raiz2 = (-(b) - Math.sqrt(disc))/ (2*a); 
                  
                  /*  x1 = (-(b) + Math.sqrt(disc))/ (2*a);
                   x2 = (-(b) - Math.sqrt(disc))/ (2*a); */
               }
            return Raiz2;
        }
    
    
}
