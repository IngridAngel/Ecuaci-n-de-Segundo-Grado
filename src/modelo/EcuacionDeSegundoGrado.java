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
    public void setCoeficienteA(double a)
        {
            this.a=a;
          
        }
    public void setCoeficienteB(double b)
        {
           this.b=b;
            
        }
    public void setCoeficienteC(double c)
        {
            this.c=c;
             
        }
    public double getCoeficienteA()
        {
            
            return a;
        }
    public double getCoeficienteB()
        {
            
            return b;
        }
    public double getCoeficienteC()
        {
            
             return c;
        }
    public int getDiscriminante()
        {
            int discriminante=((int) Math.pow(this.b, 2)) - 4 * ((int)this.a)* ((int) this.c);
           
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
             else
             {
                  Raiz1 = (-(this.b) + ((double) Math.sqrt(this.getDiscriminante())) )/ (2*this.a);
             }
               
            return Raiz1;
            
        }
     
    public double getRaiz2()
        {
             double Raiz2 =0;
             if( this.getDiscriminante() > 0)
               {
  
                   Raiz2 = (-(this.b) - ((double) Math.sqrt(this.getDiscriminante())) )/ (2*this.a);
                  
               }
            return Raiz2;
        }

  
    
    
}
