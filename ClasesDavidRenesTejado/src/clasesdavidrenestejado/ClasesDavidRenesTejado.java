

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesdavidrenestejado;
import java.lang.String;// importamos dicho paquete, aunque JAVA en este caso (String) no haría falta, pero nosotros lo ponemos como metodo de aprendizaje

/**
 *
 * @author deivi
 */
public class ClasesDavidRenesTejado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String nombre = "David Renes Tejado";
        
      
        System.out.println("El tamaño en caracteres de mi nombre es de "+nombre.length() +" caracteres");//imprimirá el tamaño
            char primera_posicion = nombre.charAt(0);
            char ultima_posicion =  nombre.charAt(nombre.length()-1);
        
        System.out.println("El primer carácter y úlimo de mi nombre son "+primera_posicion+ " y " +ultima_posicion);//imprimir primra y última letra de mi nombre
        System.out.println("El nombre es: "+nombre.substring(0,5));//imprime mi nombre
        System.out.println("El segundo apellido es: "+nombre.substring(12, 18));//imprime el segundo apellido
        System.out.println("Si cambiamos todas las"+" 'a' " +"por "+ "'_'" + " ,el resultado sería: "+nombre.replace('a','_'));//imprime cambiando las 'a' por '_'
        
        System.out.println(DavidRenesTejado.ayuda());//imprime el metodo estatico, return
        
        DavidRenesTejado n1 = new DavidRenesTejado();// creacion de un objeto llamado n1
        n1.setEdad(35);                              //valor de edad
        n1.setNombre1("David Renes Tejado");                      //valor de nombre
        
        System.out.println(n1.getEdad());            //imprime en pantalla edad
        System.out.println(n1.getNombre1());         //imprime en pantalla nombre
        
        
    }
    
}
