import java.io.OutputStream;
import java.io.PrintStream;

public class hide {
    public static void main(String[] args) {
        PrintStream originalStream = System.out;
        PrintStream dummyStream = new PrintStream(new OutputStream() {
            public void write(int b) {
                // NO-OP
            }
        });
    }
}
