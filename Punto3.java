import java.util.Stack;
import java.util.Scanner;

public class Punto3 {
    Scanner sc = new Scanner(System.in);

    public Stack<Integer> Solicitarpila(){
        Stack<Integer> P1 = new Stack<Integer>();
        int n = 0;
        
        System.out.println("Ingrese el tamaño de la pila: ");
        n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            int aleatorio = (int)(Math.random()*20+1);
            P1.push(aleatorio);  
        }
        return P1;

    }
    public void mostrarPila(Stack<Integer> P1){
        System.out.println("La pila es: ");
        for (int i = 0; i < P1.size(); i++) {
            System.out.println(P1.pop());
        }
    }
    public void validarNumero(Stack<Integer> P1, int aleatorio){
        if (aleatorio < 0) {
            aleatorio = 0;
            P1.push(aleatorio);
            
        } if (aleatorio > 8 && aleatorio < 20) {
            aleatorio = 50;
            P1.push(aleatorio);
        } if (aleatorio > 60 && aleatorio < 62) {
            aleatorio = 100;
            P1.push(aleatorio);
        } 
    }
    public void mostrarPila2(Stack<Integer> P1, int aleatorio){
        validarNumero(P1, aleatorio);
        Stack<Integer> P2 = new Stack<Integer>();
        for (Integer integer : P2) {
            
        
        System.out.println("La pila con los numeros validados es: ");
        for (int i = 0; i < P2.size(); i++) {
            System.out.println(P2.pop());
        }}

    }
    public void raizCuadrada(Stack<Integer> P1){
        Stack<Double> P2 = new Stack<Double>();
       while(!P1.isEmpty()){
           P2.push(Math.sqrt(P1.pop()));
       }
         System.out.println("La raiz cuadrada de los numeros de la pila es: "); 
         while (!P2.isEmpty()) {
             System.out.println(P2.pop());
            
         }
    }
    
}
