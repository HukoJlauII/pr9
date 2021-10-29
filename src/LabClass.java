import java.util.ArrayList;
import java.util.Formatter;

public class LabClass {
    private ArrayList<Student> cls=new ArrayList<>();
    static String[] names = new String[] { "Nikita", "Ivan", "Pasha", "Igor", "Alexander", "Ilya","Mikhail","Egor"};
    public LabClass(int count) {
        for (int i=0;i<count;i++)
        {
            int a = (int)(Math.random()*90+10);
            cls.add(new Student(a,names[(int)(Math.random()* names.length)]));
        }
    }
    public void getStudents() {
        for (int i = 0; i < cls.size(); i++) {
            System.out.println(cls.get(i).toString() );
        }

    }
    public void sortById() {
        for(int i = 1; i < cls.size(); i++) {
            for(int j = i; j > 0 && cls.get(j-1).id > cls.get(j).id; j--) {
                Student tmp = cls.get(j - 1);
                cls.set(j - 1, cls.get(j));
                cls.set(j, tmp);
            }
        }
    }

    public void sortByName() {
        for(int i = 1; i < cls.size(); i++) {
            for(int j = i; j > 0 && cls.get(j-1).name.charAt(0) > cls.get(j).name.charAt(0); j--) {
                Student tmp = cls.get(j - 1);
                cls.set(j - 1, cls.get(j));
                cls.set(j, tmp);
            }
        }
    }

    public Student find(String name) {
        for (int i = 0; i < cls.size(); i++) {
            if (cls.get(i).name.equals(name)) {
                return cls.get(i);
            }
        }
        return null;
    }
}
