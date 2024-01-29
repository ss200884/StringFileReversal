package reverseArtifact;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;


public class ReverseStringFile {

	 public static void main(String[] args) throws IOException, FileNotFoundException
     {
		 try{
			 FileReverse file = new FileReverse();
			 FileInputStream fi = new FileInputStream("../reverseArtifact/src/main/resources/input.txt");
			 InputStreamReader input =  new InputStreamReader(fi);
			 
			 OutputStream fo = new FileOutputStream("../reverseArtifact/src/main/resources/output.txt");
			 OutputStreamWriter output =  new OutputStreamWriter(fo);
			 
			 file.reverseFile(input, output);
		 }catch(Exception e){
		     System.out.println("Exception in ReverseString class : " );
		 }
		 
     }
}
