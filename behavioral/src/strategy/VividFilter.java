package strategy;

public class VividFilter implements Filter {
    @Override
    public void filter(String fileName) {
        System.out.println("Vivid filter " + fileName);
    }
}
