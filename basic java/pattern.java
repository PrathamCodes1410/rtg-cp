import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        
        Scanner newObj = new Scanner(System.in);
        int n = newObj.nextInt();

        for(int i = 1; i <= n; i++){
            for(int j = 1; j <= i; j++){
                System.out.print(j);
            }
            System.out.println();
        }

        newObj.close();


    }
}
