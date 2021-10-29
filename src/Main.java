import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.print("Введите ИНН (4 цифры): ");
        try {
            int inn = sc.nextInt();
            if (inn > 9999 | inn < 1000) {
                System.out.println("Неправильный ИНН");
            }
            else {
                System.out.println(inn);
            }
        } catch (InputMismatchException e) {
            throw new InputMismatchException("Неправильный формат ввода");
        }

        System.out.print("Введите размер списка: ");
        int n=sc.nextInt();
        LabClass c=new LabClass(n);
        LabClassUI menu=new LabClassUI();
        menu.LabClassUI(c);

    }
}
