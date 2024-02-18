import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        
        Scanner newObj = new Scanner(System.in);

        int n = newObj.nextInt();
        int ans = 1;
        for(int i = 1; i <= n; i++){
            ans = ans * i;
            System.out.println(i);
        }

        System.out.println(ans);

        newObj.close();

    }
}
