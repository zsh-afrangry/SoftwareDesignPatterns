import java.io.IOException;
import java.util.List;

public interface MyFileWriter {
    void writeData(List<String[]> data) throws IOException;
}
