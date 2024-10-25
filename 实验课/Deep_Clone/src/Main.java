import javax.xml.soap.Detail;

class Account implements Cloneable{
    private Long id;
    AccountDetail accountDetail;
    //浅克隆
    public Object shallowClone() throws CloneNotSupportedException{
        return super.clone();
    }
    //深克隆
    public Object deepClone() throws CloneNotSupportedException{
        AccountDetail clonedDetail = new AccountDetail(accountDetail.Name, accountDetail.Email);
        return new Account(this.id, clonedDetail);
    }

    Account(Long id, AccountDetail accountDetail){
        this.id = id;
        this.accountDetail = accountDetail;
    }

    void show(){
        System.out.println("账号：" + id);
        System.out.println("姓名：" + accountDetail.Name);
        System.out.println("邮箱：" + accountDetail.Email + "\n");
    }
}

class  AccountDetail{
    public String Name;
    public String Email;
    AccountDetail(String Name, String Email){
        this.Email = Email;
        this.Name = Name;
    }
}

public class Main {
    public static void main(String[] args) {
        AccountDetail accountDetail = new AccountDetail("张斯涵", "zsh1794511189@gmail.com");
        Account account = new Account(114514L, accountDetail);

        try {
            System.out.println("原始对象:");
            account.show();

            // 浅克隆
            Account shallowClone = (Account) account.shallowClone();
            System.out.println("浅克隆成功！");
            shallowClone.show();

            // 深度克隆
            Account deepClone = (Account) account.deepClone();
            System.out.println("深克隆成功！");
            deepClone.show();

            System.out.println("修改原始对象\n");
            accountDetail.Name = "刘颖";
            accountDetail.Email = "liuying@example.com";

            System.out.println("浅克隆对象:");
            shallowClone.show();

            System.out.println("深度克隆对象:");
            deepClone.show();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}