import java.util.Scanner;

public class goat {
    public static void main(String[] args) {
        int a, b, c;

        Scanner newObj = new Scanner(System.in);

        a = newObj.nextInt();
        b = newObj.nextInt();
        c = newObj.nextInt();

        if(a > b && a > c){
            System.out.print(a + " is the goat");
        }
        else{
            if(b > c){
                System.out.print(b + " is the goat");
            }
            else{
                System.out.print(c + " is the goat");
            }
        }

        newObj.close();
    }
}
