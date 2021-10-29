import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Input class size: ");
        int n=s.nextInt();

        LabClass c=new LabClass(n);
        c.getStudents();
    }
}
