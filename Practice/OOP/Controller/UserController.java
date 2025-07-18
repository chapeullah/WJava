package Practice.OOP.Controller;

import Practice.OOP.Model.User;

public class UserController {
    public static void main(String[] args) {
        User user = new User();
        user.setName("Denis").setAge(22).setCity("Moscow");
        System.out.println(user.getName());
        System.out.println(user.getAge());
        System.out.println(user.getCity());
    }
}
