import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class BufferedRead {
    public void buffReader(){
        BufferedReader rd = new BufferedReader(InputStreamReader(System.in));
        System.out.print("Enter the preffered drink ");
            
        // read user input from the console
        String drink;
        try {
            drink = rd.readLine();
            System.out.println(drink+"'s not available");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        



    }

    private Reader InputStreamReader(InputStream in) {
        return null;
    }
    
}
