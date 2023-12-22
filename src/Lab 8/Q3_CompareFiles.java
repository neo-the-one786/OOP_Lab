// 8.3 Write a java program to compare two binary files, printing the
// first byte position where they differ.

import java.io.*;
import java.util.Scanner;

class CompareFiles {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String file1 = sc.next();
        System.out.println("Enter destination file: ");
        String file2 = sc.next();
        try (BufferedReader br1 = new BufferedReader(new FileReader(file1)); BufferedReader br2 = new BufferedReader(new FileReader(file2))) {
            int i = br1.read(), j = br2.read(), pos = 0;
            while (i != -1 && j != -1) {
                if (i != j) {
                    br1.close();
                    br2.close();
                    System.out.println("NOT equal files! Byte pos: " + pos);
                    return;
                }
                i = br1.read();
                j = br2.read();
                pos++;
            }
            System.out.println("Equal files");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}