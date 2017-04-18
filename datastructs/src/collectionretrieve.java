import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by akshay on 4/17/17.
 */
class MyClass{
    int value;
    String data;

   public MyClass(int value, String data) {
        this.value = value;
        this.data = data;
    }

    public int getValue() {
        return value;
    }
}

class collectionretrieve {
    public static void main(String[] args) {

        MyClass[] list = {
        new MyClass(1, "bush"),
        new MyClass(2, "kush")
    };

    Collection<MyClass> anotherlist = Arrays.asList(list);

        anotherlist.forEach(c -> System.out.println(c.getValue()));


    }
}