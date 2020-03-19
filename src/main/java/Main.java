import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        CallApi x = new CallApi("https://jsonplaceholder.typicode.com/todos");
        x.Get_data();
    }
}
