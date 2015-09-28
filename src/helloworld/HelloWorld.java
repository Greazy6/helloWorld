/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;


public class HelloWorld {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("trying again");
        System.out.println("It worked");
        
        int x = 0;
        int y = 0;
        
        while (x < 5){
           /* y = y + 2;
            if ( y > 4){
                y = y -1;
             */
            /*x = x + 1;
            y = y + x;
            */
            
            if ( y < 5){
                x = x + 1;
                if (y < 3){
                    x = x-1;
                }
            }
            y = y + 2;
            }
            
            
            System.out.println( x + " " + y +  " ");
            
            x = x + 1;
        }
        
    }
    
