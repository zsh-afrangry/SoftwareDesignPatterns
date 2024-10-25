import java.io.Serializable;

public class Address implements Serializable {
    private final static long serialVersionUID = 10086L;
    private String street;
    private String city;
    Address(String s, String c){
        this.city = c;
        this.street = s;
    }
    public String getStreet(){
        return this.street;
    }
    public String getCity(){
        return this.city;
    }
    public void setStreet(String s){
        this.street = s;
    }
    public void setCity(String c){
        this.city = c;
    }

}
