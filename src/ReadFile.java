import java.io.*;

public class ReadFile{

    private String path;


    public ReadFile(String file_path){
        path = file_path;}

    public void ReadFile(){
        try {
            FileReader read = new FileReader(path);

            BufferedReader textreader = new BufferedReader(read);
            String studentData;
            while ((studentData = textreader.readLine()) != null) {
                System.out.println(studentData);
            }
        }
        catch (FileNotFoundException e){
            e.printStackTrace();
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
