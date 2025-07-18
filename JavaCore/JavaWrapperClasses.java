package JavaCore;

public class JavaWrapperClasses {
    public static void main(JavaString[] args) {

        // Autoboxing
        Integer integer = 20;
        Double double1 = 3.14;
        Character character = 'c';
        Boolean boolean1 = true;
    
        // Unboxing
        int x = integer;
        double y = double1;
        char z = character;
        boolean j = boolean1;

        System.out.println("" + x + y + z + j);

        String a = Integer.toString(123);
        String b = Double.toString(1.23);
        String c = Character.toString('a');
        String d = Boolean.toString(true);

        int a1 = Integer.parseInt(a);
        double b1 = Double.parseDouble(b);
        char c1 = c.charAt(0);
        boolean d1 = Boolean.parseBoolean(d);

        System.out.println("" + a1 + b1 + d1);
        /* 
            Ошибка \/
            String sum = a1 + b1 + c1 + d1;
        */
        
        System.out.println(Character.isLetter(c1));

        String result = a + b + c + d;
        System.out.println(result);
    }
}