
public class Vegetable extends Menu {
 

     public String Cheese;

    public Vegetable(String Cheese,String name, int id, double price) {
        super(name, id, price);
        this. Cheese= Cheese;
    }

    public Vegetable(String Cheese , String name, String id, String price) {
        super(name, id, price);
        this. Cheese= Cheese;
    
    }

    @Override
    public void show_Menu() {
        super.show_Menu(); 
        System.out.println("Cheese:"+Cheese);
    }

    
}
    

