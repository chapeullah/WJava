package JavaCore.JavaGeneric.Model;

// Не Generic версия коробки
public class BoxNonGeneric {
    private Object value;

    public BoxNonGeneric(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return this.value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    // Наследование от Number гарантирует, что на вход пойдет число
    public <S extends Number> void run(S u) {
        System.out.println("Value: " + value.getClass().getName());
        System.out.println("Number: " + u.getClass().getName());
    }
}
