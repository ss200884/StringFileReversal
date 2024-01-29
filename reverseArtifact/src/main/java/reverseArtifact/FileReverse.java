package reverseArtifact;

import java.io.*;

public class FileReverse {
     public void reverseFile(InputStreamReader inputStreamReader, OutputStreamWriter outputStreamWriter) {
        StringBuilder fileContents = new StringBuilder();

        try (BufferedReader read = new BufferedReader(inputStreamReader)) {
            String line;
            while ((line = read.readLine()) != null) {
                fileContents.append(line).append("\n");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String reverseContent = fileContents.reverse().toString().replaceFirst("^\\n", "");

        try (BufferedWriter writer = new BufferedWriter(outputStreamWriter)) {
            writer.write(reverseContent);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
