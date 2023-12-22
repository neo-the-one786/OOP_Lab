// 8.1 Write a java program which will accept students details like
// Student RollNo, Name, Subject, Marks from the keyboard using scanner class, stored
// the same in a file. Again open the file, read the content and display all.

import java.io.*;
import java.util.Scanner;

class WriteReadFile {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter roll no: ");
        int rollNo = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter name:");
        String name = sc.nextLine();
        System.out.println("Enter subject:");
        String subject = sc.nextLine();
        System.out.println("Enter marks: ");
        int marks = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter file name: ");
        String fileName = sc.next();
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true))) {
            bw.write("\nRoll No: " + rollNo + "\tName: " + name + "\tSubject: " + subject + "\tMarks: " + marks);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        sc.close();
    }
}