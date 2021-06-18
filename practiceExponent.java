import java.util.Scanner;

public class practiceExponent
{
  
   public static void main(String args[])
   {        
     
      Scanner input = new Scanner(System.in);
      int values = input.nextInt();
      
      Scanner input2 = new Scanner(System.in);
      int expt = input2.nextInt();
     
      practiceExponent newobject = new practiceExponent();
      System.out.println(newobject.practiceExponent(values, expt));

    }
  
   public static double practiceExponent(int value, int exp)
    {
      //base case
      
      if (exp == 0)
      {
        return 1;
      }
      
      //base case 2 -- if negative value
      if(exp < 0)
      {
        return 1.0 / practiceExponent(value, Math.abs(exp));
      }
  
      //recursive case
      else
      {
        return value*practiceExponent(value, exp-1);
      }
   }
  
  

  
}