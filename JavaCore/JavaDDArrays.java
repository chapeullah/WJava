package JavaCore;

public class JavaDDArrays {
    public static void main(String[] args) {
        String[] fruits = {"яблоко", "банан", "киви"};
        String[] vegetables = {"картошка", "лук", "морковь"};
        String[] meats = {"курица", "свинина", "говядина", "рыба"};

        String[][] groceries = {
            fruits, 
            vegetables, 
            meats
        };

        groceries[0][0] = "апельсин";

        for (String[] foods : groceries) {
            for (String food : foods) {
                System.out.print(food + " ");
            }
            System.out.println();
        }

        char[][] telephone = {
            {'1', '2', '3'},
            {'4', '5', '6'},
            {'7', '8', '9'},
            {'*', '0', '#'}
        };

        for (char[] line : telephone) {
            for (char symbol : line) {
                System.out.print(symbol + " ");
            }
            System.out.println();
        }
    } 
}