package Practice.OOP.Controller;

import Practice.OOP.Model.Generic;

public class GenericController {
    public static void main(String[] args) {
        Generic<Integer, Integer> box1 = new Generic<>(3, 300);
        
        Generic<String, Integer> box2 = new Generic<>("арбуз", 20);
        
        Generic<Double, Integer> box3 = new Generic<>(3.14, 200);
        
        Generic<Boolean, Integer> box4 = new Generic<>(true, 140);

        System.out.println(box1.getItem() + "\n" + box2.getItem() + "\n" + box3.getItem() + "\n" + box4.getItem());
        System.out.println(box1.getPrice() + "\n" + box2.getPrice() + "\n" + box3.getPrice() + "\n" + box4.getPrice());
    }
}   