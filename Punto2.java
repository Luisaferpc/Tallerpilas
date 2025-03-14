import java.util.Scanner;
import java.util.Stack;

public class Punto2 {
    Scanner sc = new Scanner(System.in);
    String palabra;
    public Stack<String> invertir = new Stack<String>();
    Stack<String> pila = new Stack<String>();
    
    public void invertirPalabra(String palabra){
        System.out.println("Digite una palabra para invertir ");
        palabra = sc.nextLine();

        for(int i = 0; i < palabra.length(); i++){
            invertir.push(palabra.substring(i, i+1));
        }
        System.out.println("La palabra invertida es: ");
        int contador = 0;
        while(!invertir.isEmpty()){
            System.out.print(invertir.pop());
            contador++;
        }
        System.out.println("\nLa palabra tiene " + contador + " caracteres");
        
    }
    
}
