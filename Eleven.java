//Take array as an input
import java.util.*;
public class Eleven {
    public static void main(String[] args) {
        System.out.println("enter array length:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];

        System.out.println("enter array elements:");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.println("Array Elements are");
        for(int i =0;i<n;i++){
            System.out.println(i +" ");
        }
    }
}
