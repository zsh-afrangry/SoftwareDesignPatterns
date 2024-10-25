import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class XMLWriter implements MyFileWriter{
    // 用于写成XML文件
    private BufferedWriter writer;

    public XMLWriter(String filePath) throws IOException {
        FileWriter fw = new FileWriter(filePath);
        this.writer = new BufferedWriter(fw); // 使用 BufferedWriter 装饰
    }

    @Override
    public void writeData(List<String[]> data) throws IOException {
        writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        writer.write("<StringTable>\n");
        for (String[] record : data) {
            // 确保记录有两个字段
            if (record.length >= 2) {
                String id = escapeXml(record[0]);
                String stuName = escapeXml(record[1]);
                writer.write(String.format("<String ID=\"%s\" stuName=\"%s\"/>\n", id, stuName));
            }
        }
        writer.write("</StringTable>");
        writer.close();
    }

    //简单转义
    private String escapeXml(String input) {
        return input.replace("&", "&amp;")
                .replace("\"", "&quot;")
                .replace("'", "&apos;")
                .replace("<", "&lt;")
                .replace(">", "&gt;");
    }
}
