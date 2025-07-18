package Practice.OOP.Controller;

import Practice.OOP.Model.Friend;

public class FriendController {
    public static void main(String[] args) {
        Friend friend1 = new Friend("Denis");
        System.out.println(Friend.numOfFriends);
        Friend friend2 = new Friend("Alex");
        System.out.println(Friend.numOfFriends);
        Friend friend3 = new Friend("Katya");
        System.out.println(Friend.numOfFriends);
        System.out.println(friend1.name + " " + friend2.name + " " + friend3.name);
    }
}