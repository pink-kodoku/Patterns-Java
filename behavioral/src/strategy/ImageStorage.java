package strategy;

public class ImageStorage {
    public void store(Compressor compressor, Filter filter, String fileName) {
        compressor.compress(fileName);
        filter.filter(fileName);
    }
}
