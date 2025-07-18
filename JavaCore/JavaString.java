package JavaCore;

public class JavaString {
    
    public static void main(JavaString[] args) {

        String name = "       Chapeullah      ";

        int length = name.length();
        char letter = name.charAt(0);
        int index = name.indexOf('l');
        int lastIndex = name.lastIndexOf('l');

        System.out.println("length = " + length + "\nletter = " + letter + "\nindex = " + index + "\nlastIndex = " + lastIndex);

        name = name.toUpperCase();
        name = name.toLowerCase();
        name = name.trim();
        name = name.replace('a', 'o');

        if (name.isEmpty()) {
            System.out.println("Name is empty");
        } else {
            System.out.println("Hello, " + name);
        }

        if (name.contains("p")) {
            System.out.println("Your name contains a 'p'");
        } else {
            System.out.println("Your name DOESNT contain a 'p'");
        }

        if (name.equalsIgnoreCase("chopeulloh")) {
            System.out.println("Report!");
        } else {
            System.out.println("Bye, " + name);
        } 
        
    }  

}