import java.util.Stack;

public class Punto1{
    public int[][] llenarMatriz(int dimension){
        int [][] matriz = new int[dimension][dimension];
        for(int i = 0; i < dimension; i++){
            for(int j = 0; j < dimension; j++){
                matriz[i][j] = (int)(Math.random()*10+1);
            }
        } return matriz;
    }
    public void mostrarMatriz(int[][] matriz){
        for(int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz.length; j++){
                System.out.print(matriz[i][j] + " - ");
            } System.out.println();
        }
        System.out.println();
    }
    public Stack<Integer> sumarFilas(int [][] matriz){
        Stack<Integer> pila = new Stack<Integer>();
        int suma = 0;
        
            for(int i = 0; i < matriz.length; i++){
                 for(int j = 0; j < matriz.length; j++){
                    suma += matriz[i][j];
        }
            } pila.push(suma);
        
    
    
    return pila;   
}
public void mostrarPila(Stack<Integer> pila){
    
        System.out.println("La suma de las filas es de: " + pila);   
}
public Stack<Integer> sumarColumnas(int [][] matriz){
    Stack<Integer> pila2 = new Stack<Integer>();
    int suma = 0;
    
        for(int j = 0; j < matriz.length; j++){
             for(int i = 0; i < matriz.length; i++){
                suma += matriz[j][i];
    }
        } pila2.push(suma);
return pila2;   
}
public void mostrarPila2(Stack<Integer> pila2){
    
    System.out.println("La suma de las columnas es de: " + pila2);   
}
public void factorial (int dimension){
    int fact = 1;
    for(int i = 1; i <= dimension; i++){
        fact = fact * i;
    }
    System.out.println("El factorial de " + dimension + " es: " + fact);
}
public void orden(Stack<Integer> pila2){

}
}

           


