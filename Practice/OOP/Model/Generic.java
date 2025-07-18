package Practice.OOP.Model;

public class Generic<T, U> {
    
    T item;
    U price;

    public Generic(T item, U price) {
        this.item = item;
        this.price = price;
    };

    public void setItem(T item) {
        this.item = item;
    }

    public void setPrice(U price) {
        this.price = price;
    }

    public T getItem() {
        return this.item;
    }

    public U getPrice() {
        return this.price;
    }
}