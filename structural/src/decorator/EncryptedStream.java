package decorator;

public class EncryptedStream implements Stream {
    private Stream stream;

    public EncryptedStream(Stream stream) {
        this.stream = stream;
    }

    @Override
    public void write(String data) {
        System.out.println("Encrypting: " + data);
        stream.write(encrypt(data));
    }

    private String encrypt(String data) {
        return "$&*#@^*$^@#$^&&@#";
    }
}
