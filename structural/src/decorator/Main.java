package decorator;

public class Main {
    public static void main(String[] args) {
        storeCreditCard(new EncryptedStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("8472893478237");
    }
}
