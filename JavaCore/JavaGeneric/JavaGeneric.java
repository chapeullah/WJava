package JavaCore.JavaGeneric;

import JavaCore.JavaGeneric.Model.BoxGeneric;
import JavaCore.JavaGeneric.Model.BoxNonGeneric;
import JavaCore.JavaGeneric.Model.ClassC;

public class JavaGeneric {
    public static void main(String[] args) {
        Integer integer = 10;
        String string = "string";
        Double double1 = 10.;

        BoxNonGeneric boxNG = new BoxNonGeneric(string);

        boxNG.run(integer);
        boxNG.run(double1);

        BoxGeneric<ClassC> boxG = new BoxGeneric<>();
        boxG.getValue();
    }
}
