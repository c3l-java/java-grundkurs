/*
    Adapted from http://www.ntu.edu.sg/home/ehchua/programming/java/J2a_BasicsExercises.html
    
    Check to see if the number entered is even. If it is print "even" 
    in the terminal other wise pint odd.

    Hint you will need % modulus. (n % 2) is 0
 */
class Exercise2 {   // saved as "CheckOddEven.java"
   public static void main(String[] args) {
      int number = 48;       // set the value of number here!
      System.out.println("The number is " + number);
      if ((number % 2) == 0) {
         System.out.println(" even");
      } else {
         System.out.println(" odd");
      }
   }
}