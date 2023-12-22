// 8.4 Write a java program that displays the number of characters, no.
// of lines and no. of words present in a text file whose name is given by the user.

import java.io.*;
import java.util.*;

public class Q4_FileCharCounter {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file name: ");
        String fileName = sc.next();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            int count = 0, ln = 0, wrd = 0;
            while (line != null) {
                String[] words = line.split(" ");
                count += words.length;
                ln++;
                wrd += new StringTokenizer(line).countTokens();
                line = br.readLine();
            }
            System.out.println("Tot no of characters: " + count);
            System.out.println("No of lines: " + ln);
            System.out.println("No of words: " + wrd);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}