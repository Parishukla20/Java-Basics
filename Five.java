//Count vowels,consonant and digits

import java.util.Scanner;

public class Five {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase(); // for handling uppercase letter
        int digit = 0;
        int vowel = 0;
        int consonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                digit++;
            }
            else if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowel++;
                }
                else{
                    consonant++;
                }
            }
        }
        System.out.println("Vowels:" + vowel);
        System.out.println("Consonants:" + consonant);
        System.out.println("Digits:" + digit);;
    }
}
