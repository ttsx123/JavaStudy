package CHp5.Add;

public class Address {
    String address;
    String zipCode;
    
    public Address(){
        
    }
    public Address(String address,String zipCode){
        System.out.println("地址为："+address+"，邮编是："+zipCode);
    }
}
