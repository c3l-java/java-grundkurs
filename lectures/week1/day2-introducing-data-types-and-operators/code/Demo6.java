class Demo6 {
    public static void main(String args[]){
        int count;
        for(count = 0; count < 10; count++) {
            int count; // Error can't redefine a variable even if it is in another scope.
        }
    }
}