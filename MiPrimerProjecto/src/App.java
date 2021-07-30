import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        var Scanner = new Scanner(System.in); // Recibe los datos por teclado
        var clearscr = "cls";
        System.out.print( clearscr + "Introduce el primer numero: ");
        var num1 = Scanner.nextInt();//tipo entero para realizar las operaciones
        System.out.print("Introduce el segundo numero: ");
        var num2 = Scanner.nextInt();//tipo entero para realizar las operaciones
        //System.out.println("Hello, World!");
        Scanner.close();//desabilita el scanner para dejar de escuchar el teclado
        //se puede reutilizar el codigo de resultado
        var resultado = suma(num1, num2); // guarda el resultaod de la funcion
        System.out.println("La suma de: " + num1 + "  y  " + num2 + " es el valor: "+ resultado);
        resultado = resta(num1, num2); // guarda el resultaod de la funcion
        System.out.println("La resta de: " + num1 + "  y  " + num2 + " es el valor: "+ resultado);
        resultado = multiplicacion(num1, num2); // guarda el resultaod de la funcion
        System.out.println("La multiplicación de: " + num1 + "  y  " + num2 + " es el valor: "+ resultado);
        resultado = division(num1, num2); // guarda el resultaod de la funcion
        System.out.println("La división de: " + num1 + "  y  " + num2 + " es el valor: "+ resultado);
    }
    public static Integer suma(int num1, int num2){//funcion estatica que devuelve el numero entero
    //recibe los 2 paramtertos como numeros
    return num1 + num2; //Devue lve la operacion de los dos nuymeros
    }
    
    public static Integer resta(int num1, int num2){//funcion estatica que devuelve el numero entero
        //recibe los 2 paramtertos como numeros
        return num1 - num2; //Devuelve la operacion de los dos nuymeros
    }
    public static Integer multiplicacion(int num1, int num2){//funcion estatica que devuelve el numero entero
        //recibe los 2 paramtertos como numeros
        return num1 * num2; //Devuelve la operacion de los dos nuymeros
    }
    public static Integer division(int num1, int num2){//funcion estatica que devuelve el numero entero
        //recibe los 2 paramtertos como numeros
        return num1 / num2; //Devuelve la operacion de los dos nuymeros
    }

}
