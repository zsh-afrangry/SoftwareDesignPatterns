import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class TXTReader implements MyFileReader {
    private BufferedReader reader;

    public TXTReader(String Path) throws FileNotFoundException {
        FileReader fr = new FileReader(Path);
        this.reader = new BufferedReader(fr); //利用装饰者模式包装reader
    }

    @Override
    public List<String[]> readData() throws IOException {
        List<String[]> data = new ArrayList<>();
        String line;
        while ((line = reader.readLine()) != null) { // 按行读取
            line = line.trim();
            if (line.isEmpty()) continue; // 跳过空行
            // 假设TXT文件每行是以空格分隔的数据
            String[] tokens = line.split("\\s+");
            if (tokens.length >= 2) { // 确保至少有两个字段
                data.add(new String[]{tokens[0], tokens[1]});
            }
        }
        reader.close();
        return data;
    }
}
