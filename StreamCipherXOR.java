import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;

public class StreamCipherXOR {
    
    // XOR Function for encryption and decryption
    public static LinkedList<Character> xorCipher(LinkedList<Character> input, char key) {
        LinkedList<Character> result = new LinkedList<>();
        for (char c : input) {
            result.add((char) (c ^ key)); // XOR operation
        }
        return result;
    }

    // Convert LinkedList<Character> to String
    public static String linkedListToString(LinkedList<Character> list) {
        StringBuilder sb = new StringBuilder();
        for (char c : list) {
            sb.append(c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get file path and key
        System.out.print("Enter the file path: ");
        String filePath = scanner.nextLine();
        System.out.print("Enter a single-character key: ");
        char key = scanner.next().charAt(0);
        scanner.close();

        LinkedList<Character> inputData = new LinkedList<>();

        // Read file into LinkedList
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            int ch;
            while ((ch = br.read()) != -1) {
                inputData.add((char) ch);
            }
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
            return;
        }

        // Encrypt Data
        LinkedList<Character> encryptedData = xorCipher(inputData, key);
        String encryptedText = linkedListToString(encryptedData);
        System.out.println("Encryption Key: " + key);
        System.out.println("Cipher Text: " + encryptedText);

        // Write Encrypted Data to File
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("encrypted_output.txt"))) {
            bw.write(encryptedText);
            System.out.println("Encrypted data saved to encrypted_output.txt");
        } catch (IOException e) {
            System.err.println("Error writing encrypted file: " + e.getMessage());
        }

        // Decrypt Data
        LinkedList<Character> decryptedData = xorCipher(encryptedData, key);
        String decryptedText = linkedListToString(decryptedData);

        // Write Decrypted Data to File
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("decrypted_output.txt"))) {
            bw.write(decryptedText);
            System.out.println("Decrypted data saved to decrypted_output.txt");
        } catch (IOException e) {
            System.err.println("Error writing decrypted file: " + e.getMessage());
        }
    }
}
