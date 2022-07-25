package practise;

public class Regal {
    private String type;
    private String id;

    public Regal(String id,String type){
        this.id = id;
        this.type = type;
        System.out.println("车的型号是："+type+"，车的id是："+id);
    }

    public String getType(String type){
        this.type = type;
        System.out.println(type);
        return type;
    }

    public String getId(String id){
        this.id = id;
        System.out.println(id);
        return id;
    }
}
