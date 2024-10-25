import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

public class BINWriter implements MyFileWriter{
    private BufferedOutputStream bos;

    public BINWriter(String Path) throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream(Path);
        this.bos = new BufferedOutputStream(fos); // 使用 BufferedOutputStream 装饰
    }

    @Override
    public void writeData(List<String[]> data) throws IOException {
        for (String[] record : data) {
            for (int i = 0; i < record.length; i++) {
                bos.write(record[i].getBytes("UTF-8"));
                if (i < record.length - 1) {
                    bos.write(','); // 使用逗号分隔字段
                }
            }
            bos.write('\n'); // 换行分隔记录
        }
        bos.flush();
        bos.close();
    }
}
