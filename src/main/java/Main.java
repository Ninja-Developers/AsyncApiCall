import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CallApi x = new CallApi("https://jsonplaceholder.typicode.com/todos/1");
        System.out.println(x.getDataString());
    }

}
