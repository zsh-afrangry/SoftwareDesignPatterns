import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            // 示例1：将 TXT 转换为 XML
            MyFileReader txtReader = new TXTReader("C:\\Users\\张斯涵\\Desktop\\大三上\\软件设计模式\\实验课\\实验2\\格式1.txt");
            MyFileWriter xmlWriter = new XMLWriter("out_1.xml");
            Converter converter1 = new Converter(txtReader, xmlWriter);
            converter1.convert();
            System.out.println("TXT 转换为 XML 完成。生成文件：out_1.xml");

            // 示例2：将 CSV 转换为 XML
            MyFileReader csvReader = new CSVReader("C:\\Users\\张斯涵\\Desktop\\大三上\\软件设计模式\\实验课\\实验2\\格式2.CSV");
            MyFileWriter xmlWriter2 = new XMLWriter("output_from_csv.xml");
            Converter converter2 = new Converter(csvReader, xmlWriter2);
            converter2.convert();
            System.out.println("CSV 转换为 XML 完成。生成文件：output_from_csv.xml");
        /*
            // 示例3：将 TXT 转换为 二进制
            DataWriter binaryWriter = new BinaryDataWriter("output_from_txt.bin");
            DataConverter converter3 = new DataConverter(new TxtDataReader("格式一.txt"), binaryWriter);
            converter3.convert();
            System.out.println("TXT 转换为 二进制 完成。生成文件：output_from_txt.bin");
        */
        /*
            // 示例4：将 CSV 转换为 二进制
            DataWriter binaryWriter2 = new BinaryDataWriter("output_from_csv.bin");
            DataConverter converter4 = new DataConverter(new CsvDataReader("格式二.cvs"), binaryWriter2);
            converter4.convert();
            System.out.println("CSV 转换为 二进制 完成。生成文件：output_from_csv.bin");
        */
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}