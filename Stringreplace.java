
import java.util.Scanner;
public class Char_replace {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	    System.out.println("Enter a String: ");
        String originalString = sc.nextLine();
        System.out.println("Enter index Number where to replace the Character: ");
        int indexToReplace = sc.nextInt();
        System.out.println("Enter a Character to replace: ");
        char replacementChar = sc.next().charAt(0);
        String modifiedString = replaceCharAtIndex(originalString, indexToReplace, replacementChar);
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceCharAtIndex(String str, int index, char replacement) {
        if (str == null || index < 0 || index >= str.length()) {
            return str;
        }

        char[] chars = str.toCharArray();
        chars[index] = replacement;
        return new String(chars);
    }
}
