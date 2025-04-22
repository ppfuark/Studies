
public class Introduction{
    public static void main(String[] args) {
        System.out.println("Hello World!");


        User user = new User();
        user.setName("ph.fuark");
        user.setName("ph.fuark", "7");
        user.setAge(17);
        System.out.println(user.get_name());
        System.out.println(10);
        System.out.println(user.getAge());
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

// ==============================================================================================================

    public final void setAge(int age){
        _age = age;
    }
    public int getAge() {
        return _age;
    }
}

