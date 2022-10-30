package decorator;

public class CompressedStream implements Stream {
    private Stream stream;

    public CompressedStream(Stream stream) {
        this.stream = stream;
    }

    private String compress(String data) {
        return data.substring(0, 5);
    }

    @Override
    public void write(String data) {
        System.out.println("Compressing: " + data);
        stream.write(compress(data));
    }
}
