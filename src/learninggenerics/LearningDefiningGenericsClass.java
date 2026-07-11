package learninggenerics;

public class LearningDefiningGenericsClass {
    static void main() {

        Data<Integer> d = new Data<>();
        d.setData(10);
        System.out.println(d.getData());


        Data<String> d2 = new Data<>();
        d2.setData("Hello");
        System.out.println(d2.getData());

    }
}

class Data<T> {
    private T data;

    public void setData(T v) {
        data = v;
    }

    public T getData() {
        return data;
    }
}
