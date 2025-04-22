
public class OOP{
    public static void main(String[] args) {
        User user = new User();
        user.setName("ph.fuark");
        user.setName("ph.fuark", "7");
        user.setAge(17);
        System.out.println(user.get_name());
        System.out.println(user.getAge());
        System.out.println(User.isAdult(user));

        System.out.println("");

        Student student = new Student();
        student.setName("ph.fuark");
        student.setName("ph.fuark", "7");
        student.setAge(17);
        student.setRegister(true);
        System.out.println(student.get_name());
        System.out.println(student.getAge());
        System.out.println(Student.isAdult(student));
        System.out.println(student.getRegister());
    }
}

class User{
    private String _name;
    private int _age;

    public User(){

    }

    public User(String name, String lastName, int age){
        setName(name, lastName);
        setAge(age);
    }

    public void setName(String name){
        _name = name;
    }

     // Overloaded version of setName with first and last name
     public final void setName(String firstName, String lastName) {
        _name = firstName + " " + lastName;
    }

    public String get_name() {
        return _name;
    }

// ========================================================================================================

    public final void setAge(int age){
        _age = age;
    }
    public int getAge() {
        return _age;
    }

// ========================================================================================================
    public static boolean isAdult(User user){
        int age = user.getAge();
        return age >= 18;
    }
}

class Student extends User{
    boolean _registered;

    public void setRegister(boolean resgister){
        _registered = resgister;
    }
    public boolean getRegister(){
        return _registered;
    }
}