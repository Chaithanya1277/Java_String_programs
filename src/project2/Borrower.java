package project2;

public class Borrower {
	 int id;
     String name;
	public Borrower(int id,String name){
		this.id=id;
		this.name=name;
		
	}
	public int getid(){
		return id;
	}
	public String getname() {
		return name;
	}
	public String toString() {
		return id + "," + name;
	}

	public static void main(String[] args) {
		Borrower b1=new Borrower(101,"Chaithanya");
		System.out.println("id :" +b1.getid());
		System.out.println("name :" +b1.getname());
		

	}

}
