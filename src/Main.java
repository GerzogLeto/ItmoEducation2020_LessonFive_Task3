import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter string one: ");
        String str1 = scanner.nextLine();
        System.out.println("Enter string two: ");
        String str2 = scanner.nextLine();
        str1 = str1.replaceAll(" ", "");
        str2 = str2.replaceAll(" ", "");
        char[] chars = str2.toCharArray();
        char[] charsInvert = new char[chars.length];
        for (int i = 0, j = chars.length; j > 0; j--, i++){
            charsInvert[i] = chars[j-1];
        }
        str2 = new String(charsInvert);
        if(str1.equalsIgnoreCase(str2)){
            System.out.println(str1 + " is a polyndrom for " + str2);
        } else {
            System.out.println(str1 + " is not a polyndrom for " + str2);
        }

    }
}
