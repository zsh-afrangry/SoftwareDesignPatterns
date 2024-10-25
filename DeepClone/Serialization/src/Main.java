import java.io.*;

public class Main {
    public static void main(String[] args) {
        //这段代码用于演示序列化 和 反序列化
        People people1 = new People("张斯涵", 21);
        Address address1 = new Address("郫都区", "成都市");
        people1.setAddress(address1);
        //绑定完成，张斯涵，21岁，成都市，郫都区
        try (FileOutputStream fos = new FileOutputStream("person.ser");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(people1);
            System.out.println("对象已序列化到 person.ser 文件");
        } catch (IOException e) {
            e.printStackTrace();
        }
        // 反序列化过程：从 person.ser 文件中读取对象
        try (FileInputStream fis = new FileInputStream("person.ser");
             ObjectInputStream ois = new ObjectInputStream(fis)) {

            People people2 = (People) ois.readObject();
            System.out.println("对象已从 person.ser 文件反序列化");
            System.out.println("姓名: " + people2.getName());
            System.out.println("年龄: " + people2.getAge());
            System.out.println("城市: " + people2.getAddress().getCity());
            System.out.println("街道: " + people2.getAddress().getStreet());

        } catch (IOException e) {
            System.err.println("反序列化过程中发生IO错误:");
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            System.err.println("无法找到类定义:");
            e.printStackTrace();
        }
    }
}