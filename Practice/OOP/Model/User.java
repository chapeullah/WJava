package Practice.OOP.Model;

public class User {

    private String name;
    private int age;
    private String city;

    public User setName(String name) {
        this.name = name;
        return this;
    }

        public User setAge(int age) {
        this.age  = age;
        return this;
    }

        public User setCity(String city) {
        this.city = city;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public String getCity() {
        return this.city;
    }


}
