package day3b.Bai1;

public class Student {
    private int id;
    private String name;
    private int age;

    private String gender;
    private  int mark;

    public Student() {
    }

    public Student(int id, String name, int age, String gender, int mark) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.mark = mark;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", mark=" + mark +
                '}';
    }

    public void setMark(int mark) {
        this.mark = mark;
    }
}
