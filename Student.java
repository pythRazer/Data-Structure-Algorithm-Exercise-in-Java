
public class Student {
    private String name;
    private int class1;
    private int class2;

    public Student(String name_, int class1_, int class2_) {
        name = name_;
        class1 = class1_;
        class2 = class2_;
    }

    public String getName() {
        return name;
    }

    public int getClass1() {
        return class1;
    }

    public int getClass2() {
        return class2;
    }
}
