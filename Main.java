
public class Main {
    public static void main(String[] args) {
        Vegetable pizza=new Vegetable("Normal"," Sun-Dried Tomatoes","01","680.75");
        pizza.show_Menu();
        Vegetable piz=new Vegetable("Normal"," Red onion","02","580.00");
        piz.show_Menu();
       
         NonVegetable Pizza=new NonVegetable("Chicken"," Pepper Barbecue Chicken","03","800.00");
      Pizza.show_Menu();
       NonVegetable Piz=new NonVegetable("Beef"," Pepper Beef","04","1000.12");
      Piz.show_Menu();
      Order P=new Order("12.02.2020","12.12pm","Pepper Barbecue Chicken",04,800.00);
      P.Order_View();
    }
    
    
    
}
