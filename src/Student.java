import java.util.Formatter;

public class Student {
    protected int id;
    protected String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        Formatter f=new Formatter();
        f.format("%9s: %2s",name,id);
        return f.toString();
    }
}
