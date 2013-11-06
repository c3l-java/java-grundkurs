/*
    Showing the use of char variable
 */
class Demo2 {
    public static void main(String args[]){
        char ch;

        ch = 'X';
        System.out.println("ch contains " + ch);

        ch++; // A char is effectively a number and can be incremented
        System.out.println("ch is now " + ch);

        ch = 90; // A char can be assigned by an integer
        System.out.println("ch is now " + ch);
    }
}