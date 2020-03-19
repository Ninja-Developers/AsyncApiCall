import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CallApi x = new CallApi("https://jsonplaceholder.typicode.com/todos");
        System.out.println(x.getStatusCode());
    }
}
