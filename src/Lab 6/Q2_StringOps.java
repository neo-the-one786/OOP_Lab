// 6.2 Write a program to perform following operations on user entered
// strings and a character –
// i) Change the case of the string
// ii) Reverse the string
// iii) Compare two strings
// iv) Insert one string into another string
// v) Convert the string to upper case and lower case
// vi) Check whether the character is present in the string and at which position
// vii) Check whether the string is palindrome or not.
// viii) Check the number of word, vowel and consonant in the string

import java.util.Scanner;

class StringOps {
    public static String changeCase(String str) {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                ans.append((char) (str.charAt(i) + 32));
            } else if (Character.isLowerCase(str.charAt(i))) {
                ans.append((char) (str.charAt(i) - 32));
            } else {
                ans.append(str.charAt(i));
            }
        }
        return new String(ans);
    }

    public static String revStr(String str) {
        StringBuilder temp = new StringBuilder(str);
        temp.reverse();
        return new String(temp);
    }

    public static int strCmp(String str1, String str2) {
        return str1.compareTo(str2);
    }

    public static String append(String str1, String str2) {
        return str1 + " " + str2;
    }

    public static String[] toUpperAndLower(String str) {
        String[] ans = new String[2];
        ans[0] = str.toUpperCase();
        ans[1] = str.toLowerCase();
        return ans;
    }

    public static int isPresent(String str, char ch) {
        return str.indexOf(ch);
    }

    public static boolean isPalindrome(String str) {
        StringBuilder temp = new StringBuilder(str);
        temp.reverse();
        String rev = new String(temp);
        return str.equalsIgnoreCase(rev);
    }

    public static int[] counter(String str) {
        int[] count = new int[3];
        count[0]++;
        for (int i = 0; i < str.length(); i++) {
            if (Character.isLetter(str.charAt(i))) {
                if (str.charAt(i) == 'A' || str.charAt(i) == 'E' || str.charAt(i) == 'I' || str.charAt(i) == 'O' || str.charAt(i) == 'U' || str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                    count[1]++;
                } else {
                    count[2]++;
                }
            }
            if (Character.isWhitespace(str.charAt(i))) {
                count[0]++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string: ");
        String str = sc.nextLine();
        byte opt;
        do {
            System.out.println("Menu:\nEnter 1 to change the case of the string\nEnter 2 to reverse the string\nEnter 3 to compare two strings\nEnter 4 to insert one string into another string\nEnter 5 to convert the string to upper case and lower case\nEnter 6 to check whether the character is present in the string and at which position\nEnter 7 to check whether the string is palindrome or not.\nEnter 8 to check the number of word, vowel and consonant in the string\nEnter 9 to exit");
            System.out.println("Enter option: ");
            opt = sc.nextByte();
            sc.nextLine();
            switch (opt) {
                case 1:
                    System.out.println("Changed case: " + changeCase(str));
                    break;
                case 2:
                    System.out.println("Reversed: " + revStr(str));
                    break;
                case 3: {
                    System.out.println("Enter another string: ");
                    String str0 = sc.nextLine();
                    System.out.println("Comparison: " + strCmp(str, str0));
                    break;
                }
                case 4:
                    System.out.println("Enter another string: ");
                    String str0 = sc.nextLine();
                    System.out.println("Appended: " + append(str, str0));
                    break;
                case 5:
                    System.out.println("Uppercase: " + toUpperAndLower(str)[0] + "\tLowercase: " + toUpperAndLower(str)[1]);
                    break;
                case 6:
                    System.out.println("Enter character: ");
                    char ch = sc.next().charAt(0);
                    int idx = isPresent(str, ch);
                    if (idx >= 0 && idx < str.length()) {
                        System.out.println("Char " + ch + "found at index: " + isPresent(str, ch));
                    } else {
                        System.out.println("No such element!");
                    }
                    break;
                case 7:
                    if (isPalindrome(str)) {
                        System.out.println("Palindrome!");
                    } else {
                        System.out.println("NOT Palindrome!");
                    }
                    break;
                case 8:
                    System.out.println("Words: " + counter(str)[0] + "\tVowels:" + counter(str)[1] + "\tConsonants:" + counter(str)[2]);
                    break;
                case 9:
                    sc.close();
                    System.exit(0);
                    return;
                default:
                    System.out.println("Invalid Input!");
            }
        } while (true);
    }
}