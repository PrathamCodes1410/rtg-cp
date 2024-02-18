public class typecast {
    public static void main(String[] args) {
        //Widening Casting (automatically) - converting a smaller type to a larger type size

        int myInt = 16;
        double myDouble = myInt; // Int will be converted into a double

        System.out.println(myDouble); // outputs 16.0
        
        //Narrowing casting must be done manually by placing the type in parentheses in front of the value:
        
        myDouble = 16.9;
        myInt = (int) myDouble; // Manual casting: double to int

        System.out.println(myDouble);   // Outputs 16.9
        System.out.println(myInt);      // Outputs 16
    }
}
