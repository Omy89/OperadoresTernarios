package progra1q3;

import java.util.Scanner;

public class Romero_Omar_OperadorTernario {

    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        lea.useDelimiter("\n");

        /*
        Operadores ternarios en java
        Los operadores ternarios en java son una forma de condiciones en java.
        Estos hacen una prueba logica dando un valor diferente si es verdadero y falso en caso contrario.
        El formato de los operadores ternarios es el siguiente
        (Variable a la cual se le dara valor) = (Prueba Logica) ? (Resultado si es verdadero) : (Resultado si es falso);
        Cabe aclarar tanto la variable como la respuestas tienen que ser congruentes en cuanto la declaracion y la asignacion de valores.
         */
        
        
        /*
        ejemplo de valor constante
        En este ejemplo le daremos un valor constante a la variable "edad",si la edad es menor a 18 esta persona no podra votar, caso contrario si.
         */
        int edad = 17;
        System.out.println("Su edad es de "+edad);
        String edadlegalvoto = (edad < 18) ? "usted es menor de edad, no puede votar." : "usted es mayor de edad, puede votar.";
        System.out.println("Su edad es de " + edad + ", por lo tanto, " + edadlegalvoto+"\n");

        /*
        ejemplo de variable
        Este ejemplo es el mismo que el anterior, pero se le dara la opcion de escoger la edad.
         */
        System.out.println("Introduzca su edad");
        edad = lea.nextInt();
        if (edad > 0) {
            edadlegalvoto = (edad < 18) ? "usted es menor de edad, no puede votar." : "usted es mayor de edad, puede votar.";
            System.out.println("Su edad es de " + edad + ", por lo tanto, " + edadlegalvoto);
        } else {
            System.out.println("ERROR, introdujo una edad invalida \n");
        }

        /*
        ejemplo con formula
        En este ejemplo usted introducira productos, si estos pasan de 5 se le aplicara un descuento del 10%.
         */
        System.out.println("Ingrese cuantos productos desea comprar (estos tienen un valor de 10$), si estos son mas de 5 productos se le aplicara un 10% de descuento");
        int productos = lea.nextInt();
        if(productos>0){
        double precio=(productos>5) ? (productos*10)-(productos*0.10) : productos*10;
        System.out.println("Su total es de: "+precio+"$");
        } else {
            System.out.println("ERROR, introdujo una cantidad invalida");
        }
        

    }
}
