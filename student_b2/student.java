import java.util.*;

public class student {
    private String id;
    private String name;
    private int age;

    public student(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(String id) {
         this.id = id;
    }

    public void setName(String name) {
         this.name = name;
    }

    public void setAge(int age) {
         this.age = age;
    }

    @Override
    public String toString() {
        return "student{id='" + id + "', name='" + name + "', age=" + age + "}";
    }
}
