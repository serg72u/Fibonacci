/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

/**
 *
 * @author serg72u
 */
public class Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Fibonacci(10);
    }
 
    static void Fibonacci(int count){
        int first;
        int second;
        int fib;
        
        fib = 1;
        first = 0;

        for(int i = 0; i < count; i++) {
            
            System.out.print(fib + ", ");
              
            second = first;
            first = fib;
            fib =  first + second;  
            }
    }
}
