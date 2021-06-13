
package comp603;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import static java.lang.System.out;

//Method managing reading to file functionality
public class ReadToFile {
    

        public static void writeFile(){
        try{
            FileReader fread = new FileReader("Output.txt");
            BufferedReader bread = new BufferedReader(fread);
            
            String s;
            while(( s = bread.readLine()) != null) {
               out.println(s +"\n");
            }
            bread.close();
        }
        catch (IOException e) {
            out.println("File Not Found");
        }

    }
}