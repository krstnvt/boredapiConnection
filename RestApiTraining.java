import java.io.IOException;
import java.io.*;
import java.net.*;

public class RestApiTraining {
    public static void main(String[] args) throws IOException {

        String CONNECT_API_URL = "https://www.boredapi.com/api/activity";

        URL url = new URL(CONNECT_API_URL);
        URLConnection urlConnection = url.openConnection();

        BufferedReader reader = new BufferedReader(new InputStreamReader(urlConnection.getInputStream()));
        String line = null;

        while ((line = reader.readLine()) != null)
        {
            System.out.println(line);
        }
        reader.close();
    }
}
