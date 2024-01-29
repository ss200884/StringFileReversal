package reverseArtifact;

import org.junit.Test;

import java.io.*;

import static org.junit.Assert.assertEquals;

public class FileReverseTest {
    private final FileReverse fileReverse = new FileReverse();

    @Test
    public void testReverseFileSingleLine() throws IOException {
        String input = "Hello World";
        String output = "dlroW olleH";

        reverseFileTest(input, output);
    }

    @Test
    public void testReverseFileMultipleline() throws IOException {
        String input = "Line 1\nLine 2\nLine 3";
        String output = "3 eniL\n2 eniL\n1 eniL";

        reverseFileTest(input, output);
    }

    @Test
    public void testReverseFileEmptyFile() throws IOException {
        String input = "";
        String output = "";

        reverseFileTest(input, output);
    }

  
    private void reverseFileTest(String inputContent, String expectedOutput) throws IOException {
        ByteArrayInputStream inputStream = new ByteArrayInputStream(inputContent.getBytes());
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        fileReverse.reverseFile(new InputStreamReader(inputStream), new OutputStreamWriter(outputStream));

        assertEquals(expectedOutput, outputStream.toString());
    }
}