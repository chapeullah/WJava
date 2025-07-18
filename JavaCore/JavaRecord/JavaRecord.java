package JavaCore.JavaRecord;

import JavaCore.JavaRecord.Model.Player;

public class JavaRecord {
    public static void main(String[] args) {
        Player player = new Player("Denis", 22);
        System.out.println(player.name());
        System.out.println(player.level());
        System.out.println(player);
    }
}