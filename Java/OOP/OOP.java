import java.util.ArrayList;
import java.util.List;

public class OOP {
    public static void main(String[] args) {
        // ======================= Single Instances ==============================
        User user = new User();
        user.setName("ph.fuark");
        user.setName("ph.fuark", "7");
        user.setAge(17);

        Student student = new Student();
        student.setName("ph.fuark");
        student.setName("ph.fuark", "7");
        student.setAge(17);
        student.setRegister(true);

        // ======================= Polymorphic List =============================
        List<User> users = new ArrayList<>();
        users.add(user);
        users.add(student);

        // ======================= Loop and Demonstrate Polymorphism ============
        for (User u : users) {
            System.out.println("Name: " + u.get_name());
            System.out.println("Age: " + u.getAge());
            System.out.println("Is Adult: " + User.isAdult(u));
            System.out.println("User Type: " + u.getUserType());
            System.out.println();
        }
    }
}

class User {
    private String _name;
    private int _age;

    // ======================= Constructors ===================================
    public User() {}

    public User(String name, String lastName, int age) {
        setName(name, lastName);
        setAge(age);
    }

    // ======================= Name Setters ===================================
    public void setName(String name) {
        _name = name;
    }

    public final void setName(String firstName, String lastName) {
        _name = firstName + " " + lastName;
    }

    public String get_name() {
        return _name;
    }

    // ======================= Age Setters & Getters ==========================
    public final void setAge(int age) {
        _age = age;
    }

    public int getAge() {
        return _age;
    }

    // ======================= Static Method ==================================
    public static boolean isAdult(User user) {
        return user.getAge() >= 18;
    }

    // ======================= Polymorphic Method =============================
    public String getUserType() {
        return "User";
    }
}

class Student extends User {
    private boolean _registered;

    // ======================= Registration Flag ==============================
    public void setRegister(boolean register) {
        _registered = register;
    }

    public boolean getRegister() {
        return _registered;
    }

    // ======================= Overridden Polymorphic Method ==================
    @Override
    public String getUserType() {
        return "Student";
    }
}
