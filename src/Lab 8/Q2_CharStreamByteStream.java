// 8.2 Write a program in Java to copy the content of a given file to
// another user entered file using character stream (using File Reader and FileWriter
// Classes) and byte Stream (using FileInputStream and FileOutputStream Class).

import java.io.*;
import java.util.Scanner;

class CharStreamByteStream {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source file: ");
        String file1 = sc.next();
        System.out.println("Enter destination file: ");
        String file2 = sc.next();
        try (FileReader fr1 = new FileReader(file1); FileWriter fr2 = new FileWriter(file2)) {
            int i = fr1.read();
            while (i != -1) {
                fr2.write(i);
                i = fr1.read();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try (FileInputStream fis = new FileInputStream(file1); FileOutputStream fos = new FileOutputStream(file2)) {
            byte[] buffer = new byte[100];
            int i = fis.read(buffer);
            while (i != -1) {
                fos.write(buffer, 0, i);
                i = fis.read(buffer);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}