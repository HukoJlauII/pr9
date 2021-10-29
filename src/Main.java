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


        while (true)
        {
            System.out.println("Меню для работы со студентами");
            System.out.println("1) Вывод списка студентов");
            System.out.println("2) Вывод списка студентов отсортированный по имени");
            System.out.println("3) Вывод списка студентов отсортированный по ID");
            System.out.println("4) Поиск студентов по имени");
            System.out.println("5) Выход");
            System.out.print("Вы ввели ");
            try {
                n = sc.nextInt();
            }
            catch (InputMismatchException e) {
                throw new InputMismatchException("Неправильный формат ввода");
            }
            Scanner scan=new Scanner(System.in);
            switch (n)
            {
                case 1:
                {
                    System.out.println("Класс без сортировки:");
                    c.getStudents();
                    break;
                }
                case 2:
                {
                    System.out.println("Класс с сортировкой по имени:");
                    c.sortByName();
                    c.getStudents();
                    break;
                }
                case 3:
                {
                    System.out.println("Класс с сортировкой по ID:");
                    c.sortById();
                    c.getStudents();
                    break;
                }
                case 4:
                {

                    try {
                        System.out.print("Введите имя для поиска: ");
                        String str=scan.nextLine();

                        if(str.length()==0)
                        {
                            throw new EmptyStringException();
                        }
                        Student stu = c.find(str);
                        System.out.println(stu.name+": "+stu.id);


                    } catch (NullPointerException e) {
                        throw new NullPointerException("Student NOT found!");
                    }catch (EmptyStringException e)
                    {
                        throw new EmptyStringException("String is Empty");
                    }

                    break;
                }
                case 5:
                {
                    System.out.println("Выход...");
                    return;
                }
            }
            System.out.println();
        }




    }
}
