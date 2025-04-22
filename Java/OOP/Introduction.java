
public class Introduction{
    public static void main(String[] args) {
        System.out.println("Hello World!");


        User user = new User();
        user.setName("ph.fuark");
        user.setAge(17);
        System.out.println(user.getName());
        System.out.println(user.getAge());
    }
}

class User{
    private String _name;
    private int _age;

    public void setName(String name){
        _name = name;
    }
    public String getName() {
        return _name;
    }

    public void setAge(int age){
        _age = age;
    }
    public int getAge() {
        return _age;
    }
}

