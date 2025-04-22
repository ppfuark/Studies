
public class Introduction{
    public static void main(String[] args) {
        System.out.println("Hello World!");


        User user = new User();
        user.setName("ph.fuark");
        user.setName("ph.fuark", "7");
        user.set_age(17);
        System.out.println(user.get_name());
        System.out.println(user.get_age());
    }
}

class User{
    private String _name;
    private int _age;

    public void setName(String name){
        _name = name;
    }

     // Overloaded version of setName with first and last name
     public void setName(String firstName, String lastName) {
        _name = firstName + " " + lastName;
    }

    public String get_name() {
        return _name;
    }

// ==============================================================================================================

    public void set_age(int age){
        _age = age;
    }
    public int get_age() {
        return _age;
    }
}

