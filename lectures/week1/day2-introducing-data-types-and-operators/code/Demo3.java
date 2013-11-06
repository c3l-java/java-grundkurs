/*
    Boolean demo
 */
class Demo3 {
    public static void main(String args[]){
        boolean b;
        b = false;
        System.out.println(b);
        b = true;
        System.out.println(b);

        // A boolean value can control an if statement
        if(b) System.out.println("This is executed.");

        b = false;
        if(b) System.out.println("This is not executed.");

        // The outcome of a relational operation is a boolean value
        System.out.println("10 > 9 is " + (10 > 9));
    }
}