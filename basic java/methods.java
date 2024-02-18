import java.util.Scanner;

public class methods {

    static void myMethod(){
        System.out.println("This is a method in java, fancy word for function");
    }

    static int add(int num1, int num2){
        // this is function which adds two numbers
        return num1 + num2;
    }

    public static void main(String[] args) {
        methods.myMethod();
        Scanner newObj = new Scanner(System.in);
        int n1 = newObj.nextInt();
        int n2 = newObj.nextInt();

        int ans = add(n1, n2);

        System.out.println(ans);

        newObj.close();
    }
}
