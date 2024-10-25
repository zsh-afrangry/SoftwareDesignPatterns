import java.io.Serializable;

public class People implements Serializable {
    private final static long serialVerisonUID = 10086L;
    private String name;
    private int age;
    private Address address;
    People(String n, int a){
        this.name = n;
        this.age = a;
    }
    public void setAddress(Address address){
        this.address = address;
    }
    public Address getAddress(){
        return this.address;
    }
    String getName(){
        return this.name;
    }
    int getAge(){
        return this.age;
    }
}
