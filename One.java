//Swap two numbers using third variable
public class One {
    public static void main(String args[]){
    int a =10;
    int b =20;
    int temp;
    System.out.println("After Swapping:");
    temp = a;
    a = b;
    b = temp;
    System.out.println("a = "+a);
    System.out.println("b = "+b);

//Swap two numbers without using third variable
    int c = 5;
    int d = 3;
    System.out.println("After Swapping:");
    c = c + d;
    d = c - d;
    c = c - d;
    System.out.println(c);
    System.out.println(d);
    }
}
