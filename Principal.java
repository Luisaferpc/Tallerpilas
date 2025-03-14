import java.util.Scanner;
import java.util.Stack;

public class Principal {
    public static void main(String[] args) {
        int opt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el punto que desea ver: ");
        opt = sc.nextInt();
        Punto1 p1 = new Punto1();

        switch (opt) {

            case 1:System.out.println("Ingrese la dimension de la matriz: ");
            int dimension = sc.nextInt();
            int [][] m = p1.llenarMatriz(dimension);
            p1.mostrarMatriz(m);
            System.out.print("1. Sumar filas \n 2. Sumar Columnas \n 3. Factorial \n 4. numeros de mayor a menor" );
            int opc1 = sc.nextInt();

                switch (opc1) {
                    case 1:
                    Stack<Integer> P = p1.sumarFilas(m);
                    p1.mostrarPila(P);
                        break;
                    case 2:
                    Stack<Integer> P2 = p1.sumarColumnas(m);
                    p1.mostrarPila2(P2);
                        break;
                    case 3:
                    p1.factorial(dimension);
                        break;
                    case 4:
                    default:
                        break;
                }
            case 2:
            System.out.println("Ingrese una palabra: ");
            String palabra = sc.nextLine();
           Punto2 p2 = new Punto2();
           p2.invertirPalabra(palabra);
                break;
            case 3:
            Punto3 p3 = new Punto3();
            Stack<Integer> pilaOriginal = p3.Solicitarpila();
            p3.mostrarPila(pilaOriginal); 
            p3.mostrarPila2(pilaOriginal, 0); 
            p3.raizCuadrada(pilaOriginal);
                break;
            
           
        
            default:
                break;
        }
        
    }
}