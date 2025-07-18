package Practice.OOP.Model;

public class Friend {
    public Friend(String name) {
        this.name = name;
        ++numOfFriends;
    }

    public static int numOfFriends;
    public String name;
}
