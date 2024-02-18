import java.util.Scanner;

public class oddeven {
    public static void main(String[] args) {
        
        Scanner myObj = new Scanner(System.in);

        int n = myObj.nextInt();

        if(n % 2 == 0){
            System.out.println("Your Number is Even");
        }
        else{
            System.out.println("Your number is Odd");
        }

        myObj.close();

    }
}
