class Demo8 {
    public static void main(String args[]){
        byte a = 1;
        byte b = 1;
        byte c = a + b; // This fails as bytes, chars and shorts are promoted to int's in expressions
    }
}