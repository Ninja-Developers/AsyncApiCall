import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class CallApi {
    private String _URL;
    public CallApi(String url){
        this._URL = url;
    }

    public void Get_data() throws IOException {
        URL url = new URL(this._URL);
        HttpURLConnection con = (HttpURLConnection) url.openConnection();
        con.setRequestMethod("GET");
        int status = con.getResponseCode();
        BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
        String data;
        StringBuffer content = new StringBuffer();
        while ((data = in.readLine())!=null){
            content.append(data);
        }
        in.close();
        System.out.println(content);
    }
}
