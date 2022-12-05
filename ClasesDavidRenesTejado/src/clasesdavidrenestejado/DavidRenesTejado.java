/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesdavidrenestejado; //nombre de la clase

/**
 *
 * @author deivi
 */
public class DavidRenesTejado {
    
    private String nombre1 ;
    private int edad ;

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;                 //creamos un if,else 
            if (edad > 100 || edad < 0){     //if
            
                System.out.println("PERSONA ERRONEA");
                this.edad = 180;
                
            }
            else {                          //else
                this.edad = edad;
                this.nombre1 = nombre1;
            }
    }

    public DavidRenesTejado() {//este es constructor 
        nombre1 = "David Renes Tejado";
        edad = 180;
         if (edad > 100 || edad < 0){     //if
            
             System.out.println("PERSONA ERRONEA");
             this.edad = 0;
            
            }
            else {                          //else
                this.edad = edad;
                this.nombre1 = nombre1;
            }
    }
    

    public DavidRenesTejado(String nombre1, int edad) {//otro constructor 
        this.nombre1 = nombre1;
        this.edad = edad;
        
    }       

    
    
    public static String ayuda(){// método estático
        return "Esta clase permite crear personas con un nombre y una edad";
    }

    
    
    
}
