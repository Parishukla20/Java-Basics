//Fibonacci Series using iteration

import java.util.Scanner;
public class Three {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int first = 0;
        int second =1;
        System.out.println(first);
        System.out.println(second);
        for(int i = 0;i<=n;i++){
            int next = first + second;
            System.out.println(next);
            first = second;
            second = next;
        }
    }
}

