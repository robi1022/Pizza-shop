

    public class Staff extends Person{
protected float salary;
    protected String address;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void details() {
        super.details(); 
        System.out.println("Salary:"+salary + "Address: "+address);
   }
    
}
    

