import java.io.*;
import java.util.Scanner;

public class WriteToFile {
    private String path;
    private boolean appendFile = false;

    WriteToFile(String file_name, boolean append){
        path = file_name;
        appendFile = append;


    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        Student[] students = new Student[1];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        for (int i = 0; i < students.length; i++) {
            System.out.println("Enter name");
            students[i].setFirstName(scanner.next());
            System.out.println("Enter lastnaem");
            students[i].setLastName(scanner.next());
            System.out.println("Enter gender ");
            students[i].setGender(scanner.next());
            System.out.println("Enter year");
            students[i].setYear(scanner.nextInt());
            System.out.println("Enter mark");
            students[i].setMark(scanner.nextDouble());

        }

        WriteToFile write = new WriteToFile("studentsArray.txt", true);

        for (int i = 0; i < students.length; i++) {
            String str = students[i].toString();
            write.writeToFile(str);
        }

        ReadFile read = new ReadFile("studentsArray.txt");
        read.ReadFile();

        }

    public void writeToFile(String str) throws IOException {
        FileWriter write = new FileWriter(path, appendFile);
        PrintWriter print = new PrintWriter(write);
        print.println(str);
        print.close();

    }
}




