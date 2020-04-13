
public class Person { private String name;
	  private int  phone;
	  private int age;
          private String mail;
          private int id;
    
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
        public String getMail(){
            return mail;
        }
        public void setMail(String mail){
            this. mail= mail;
        }
        public int getId() {
		return id;
	}
        public void setId(int id) {
		this.id = id;
	}
	
	public void details(){
            
            System.out.println("Name:"+name +"phone:"+phone +"Age:"+age +"Mail:"+mail +"Id:"+id);
		
        }   

    

    
}

   