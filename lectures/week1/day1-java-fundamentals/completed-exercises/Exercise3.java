/*
    Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
    
    Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to an upperbound
    (e.g., 100). Also compute and display the average. 

    The output shall look like:
    The sum is 5050
    The average is 50.5

    When you have got the code working:
    Can you get the code working with a while loop?
    What about a do-while loop?
 */

class Exercise3 {   // saved as "SumAndAverage.java"
   public static void main (String[] args) {
      int sum = 0;          // store the accumulated sum, init to 0
      double average;       // average in double
      int lowerbound = 1;   // the lower bound to sum
      int upperbound = 100; // the upper bound to sum

      for (int number = lowerbound; number <= upperbound; ++number) { // for loop
         sum += number;     // same as "sum = sum + number"
      }
      // Compute average in double. Beware that int/int produces int.
      /* Your code here */
      average = (double)sum / (double)upperbound;
      
      // Print sum and average.
      /* Your code here */
      System.out.println("The sum is " + sum);
      System.out.println("The average is " + average);

      /* ------------- While implementation ------------- */

      int number = lowerbound;
      sum = 0;

      while(number <= upperbound){
        sum += number;
        number++;
      }

      average = (double)sum / (double)upperbound;

      System.out.println("The while loop sum is " + sum);
      System.out.println("The while loop average is " + average);

      /* ------------- do while implementation ------------- */

      number = lowerbound;
      sum = 0;
      do {
         sum += number;
         number++;
      } while (number <= upperbound);

      average = (double)sum / (double)upperbound;

      System.out.println("The do while loop sum is " + sum);
      System.out.println("The do while loop average is " + average);


   }
}