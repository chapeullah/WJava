package JavaCore;

public class JavaSystemArrayCopy {
    
    public static void main(String[] args) {
        int result = 123______456_789;
        int[] arr = {1, 2, 3};
        int[] array1 = {1, 2, 3};
        int[] array2 = new int[6];
        System.arraycopy(array1, 0, array2, 3, array1.length);
        for (int i : array2) {
            System.out.println(i);
        }
        System.out.println(array1.equals(array2));
        System.out.println(result);
        for (int i : arr) {
            System.out.println(i);
        }
    }   
}   