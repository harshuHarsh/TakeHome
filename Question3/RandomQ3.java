package test;

import java.util.Random;
public class RandomQ3
{	
        public static void main(String[] args) 
        {

        	int sum=0;
        	Random numGenerator = new Random();
            for (int i = 0; i< 10; i++){
              int randomNumber = numGenerator.nextInt(15);
              System.out.println("Random No : " + randomNumber); 
              sum=sum+randomNumber;
              
             }
            System.out.println("sum of 10 random numbers:"+" "  + sum);
     }
}