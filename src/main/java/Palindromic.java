import java.util.Scanner;

public class Palindromic {
    static boolean isPalindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {

            if (str.charAt(i) != str.charAt(j))
                return false;

            i++;
            j--;
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "alla";
        String str2 = "adios";

        System.out.print("Palabra 1 :");

        if (isPalindrome(str))
            System.out.print("Es palindromo");
        else
            System.out.print("No es palindromo");

        System.out.println();


        System.out.print("Palabra 2 :");
        if (isPalindrome(str2))
            System.out.print("Es palindromo");
        else
            System.out.print("No es palindromo");
    }
}

