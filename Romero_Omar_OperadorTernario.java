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
        En este ejemplo al introducir un numero, el codigo determinara si es par o impar.
        Cabe agregar que en esta investigacion descubri que el 0 es par.
         */
        System.out.println("Ingrese un numero para determinar si es par o impar");
        int numero = lea.nextInt();
        String parimpar=(numero % 2==0) ? " es par" : " es impar";
        System.out.println("El numero "+numero+parimpar);
        
        

    }
}
