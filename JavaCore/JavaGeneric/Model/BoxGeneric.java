package JavaCore.JavaGeneric.Model;

// Generic версия коробки
public class BoxGeneric<T extends ClassA & ClassB & ClassD> extends Box<T> {
    /*
     * TYPE NAMING CONVENTION
     * 
     * E - Element (очень много внутри Java Collection)
     * K - Key
     * N - Number
     * T - Type
     * V - Value
     * S, U, V, ... - 2-ой, 3-ий, 4-ый типы 
     */
    
    private T value;

    public BoxGeneric() {
    }

    @Override
    public T getValue() {
        return this.value;
    }

    @Override
    public void setValue(T value) {
        this.value = value;
    }
}
