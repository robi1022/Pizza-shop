
public class NonVegetable extends Menu {
 

     public String type;

    public NonVegetable(String type,String name, int id, double price) {
        super(name, id, price);
        this.type = type;
    }

    
    public NonVegetable(String type , String name, String id, String price) {
        super(name, id, price);
        this.type = type;
    
    }

    @Override
    public void show_Menu() {
        super.show_Menu(); 
        System.out.println("Type:"+type);
    }

    
    
}
    

