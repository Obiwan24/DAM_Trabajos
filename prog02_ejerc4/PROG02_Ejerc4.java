
package prog02_ejerc4;


public class PROG02_Ejerc4 {

    public static void main(String[] args) {
        
        //Establecemos la variable de la edad.
        int edad = 8;
        
        /*
        Establecemos una variable String con un operador condicional,
        para establecer la condicion de si la edad es mayor o igual que 18
        imprima un mensaje y si no cumple la condición, imprima otro mensaje diferente.
        */
        String mensaje = edad >= 18 ? "Es mayor de edad" : "Es menor de edad";
        
        
        //Impresión del mensaje.
        System.out.println(mensaje);
  
    }
    
}
