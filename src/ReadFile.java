import java.io.*;

public class ReadFile{

    private String path;

    public ReadFile(String file_path) throws IOException {
        path = file_path;
    }

    public void ReadFile() throws  IOException{
        FileReader read = new FileReader(path);
        BufferedReader textreader = new BufferedReader(read);
        String studentData;
        while ((studentData = textreader.readLine()) != null){
            System.out.println(studentData);
        }
    }
}
