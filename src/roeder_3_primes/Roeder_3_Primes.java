/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package roeder_3_primes;

/**
 *
 * @author aroeder
 */
public class Roeder_3_Primes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int evens = 0;
        for(int i = 0;i < 100;i++){
            if(i % 2 == 1){
                evens = evens + 1;
                System.out.println(isEven(i));
                System.out.println(isOdd(i));
                System.out.println(isPrime(i));
                
                
              System.out.println("There are "+evens+" even integers");
              
            }    
        }
    }
               static boolean isEven(int someNumber){
                   return(someNumber % 2 == 0);}
                   
               static boolean isOdd(int someNumber){
                       return(someNumber % 2 == 1);
               }
                       static boolean isPrime(int somenumber){
                           return (somenumber % 2 != 0);
                       } boolean prime = true;
                           int divisor = 0;
                           
    
}
                     
                           
                           
                       

                           
                                  
                       
       
                       

                            
                               
                           
                           
                       
                           
                       
                   


               

               

               /* What is a Method?
                A method is a function
                It's like a little program, e.g.
                Like finding a square, something you
                might want to do again and again.
            */    
            
            
                
                // A return value is a type of 
                //value you are giving back to the program
           
         

    



/*
A method is like a little program that communicates with other parts of 
the program by returning values (most of the time)
*/

           
                 




            

    
            
            
        
        
            
            
//      for(int i = 0;i < 100;i++){
          //if(i % 2 != 0){
             // if(i % 3 != 0){
                 // if(i % 5 !=0){
                      
                  
              
              //System.out.println(i+"is not even");
          
      
    
    

