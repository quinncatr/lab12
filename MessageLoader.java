import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MessageLoader {

    public static ArrayList<OpenMessage> loadFile(String filename) 
    {            
        ArrayList<OpenMessage> messageList = new ArrayList<OpenMessage>();
      
        try
        {
            File file = new File(filename);
            Scanner scnr = new Scanner(file);
            while(scnr.hasNextLine())
            {
                String to = parseLine(scnr.nextLine());
                String from = parseLine(scnr.nextLine());
                String subject = parseLine(scnr.nextLine());
                String body = parseLine(scnr.nextLine());

                messageList.add(new OpenMessage(to, from, subject, body));
            }
            scnr.close();    
        }
        catch(FileNotFoundException e)
        {
            System.out.println("Broke");
            return null;
        }       
        return messageList;
    }   

    public static String parseLine(String line) {

        return line.substring(line.indexOf(" "));
    }

}
