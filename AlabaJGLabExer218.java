import java.io.*;
 
public class AlabaJGLabExer218{
    public static void main(String[] args) {
        String filename = "image_out.txt";
        try
        {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
           
            // write file
            for (int i = 0, out = 0; i < 64; i++, out = (i / 8) * 8){
                for (int j = 0; j < 64; j++){
                    writer.write(out+"\n");
                }
            }  
            writer.close();
        }
        catch(IOException e){
            System.exit(1);
        }
       
    }
}