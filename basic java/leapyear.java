import java.util.Scanner;
public class leapyear {
    public static void main(String[] args) {
        
        Scanner obj = new Scanner(System.in);

        int n = obj.nextInt();

        if(n % 4 == 0){
            if(n % 100 == 0 && n % 400 != 0){
                System.out.println("It is not a leap year :(");
            }
            System.out.println("It is a leap year :)");
        }
        else{
            System.out.println("It is not a leap year :(");
        }

        obj.close();

    }
}
