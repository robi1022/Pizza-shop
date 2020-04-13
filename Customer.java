
public class Customer extends Person{
    private String choices;

    public String getChoices() {
        return choices;
    }

    public void setChoices(String choices) {
        this.choices = choices;
    }
@Override
public void details()
    {
        super.details();
        System.out.println("Choices: "+choices);
    }
    
}


    
