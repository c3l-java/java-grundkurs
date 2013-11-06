/*
    Pythagorean theorem to calculate the 
    length of the hypotenuse
 */
class Demo1 {
    public static void main (String args[]){
        double x, y, z;

        x = 4;
        y = 3;

        z = Math.sqrt((x*x) + (y*y));

        System.out.println("Hypotenuse is " + z);

    }
}