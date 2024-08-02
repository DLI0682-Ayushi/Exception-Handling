import java.io.*;

class FileReadException extends Exception {
    public FileReadException(String message, Throwable cause) {
        super(message, cause);
    }
}
public class ExceptionChaining {
    public static void main(String[] args) {
        try {
            readFromFile("nonexistent-file.txt");
        } catch (FileReadException e) {
            System.out.println("Error: Unable to read file.");
            System.out.println("Original Exception: " + e.getMessage());
            System.out.println("Cause: " + e.getCause().getMessage());
        }
    }

    public static void readFromFile(String filename) throws FileReadException {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            reader.close();
        } catch (IOException e) {
            throw new FileReadException("Error while reading file: " + filename, e);
        }
    }
}
