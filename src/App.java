import java.util.Arrays;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int idadeM = sc.nextInt();
        int filho = sc.nextInt();
        int filho2 = sc.nextInt();

        int filho3 = idadeM - (filho + filho2);

        int[] arr = {filho, filho2,filho3};
        
        Arrays.sort(arr);

        System.out.println(arr[2]);

        sc.close();
    }
}
