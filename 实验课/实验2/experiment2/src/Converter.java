import java.io.IOException;
import java.util.List;

public class Converter {
    private MyFileReader reader;
    private MyFileWriter writer;

    // 构造函数依赖于抽象接口，而非具体实现
    public Converter(MyFileReader reader, MyFileWriter writer) {
        this.reader = reader;
        this.writer = writer;
    }

    public void convert() throws IOException {
        List<String[]> data = reader.readData();
        writer.writeData(data);
    }
}
