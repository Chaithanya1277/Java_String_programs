package project1;

public class usser {

	private final int userid;
	private final int id;
	private final String title;
	private final String body;
	public usser(int userid,int id,String title,String body) {
		this.userid=userid;
		this.id=id;
		this.title=title;
		this.body=body;
	}public int getuserid() {
		return userid;
	}public int getid() {
		return id;
	}public String gettitle() {
		return title;
	}public String getbody() {
		return body;
	}
	public void setuserid() {
		this.userid=userid;
	}public void setid() {
		this.id=id;
	}public void settitle() {
		this.title=title;
	}public void setbody() {
		this.body=body;
	}public static void main(String[] args) {
		usser u1=new usser(34,7,"kgghgk jyty","fdgfd giyb");
		usser u2=new usser(67,90 ,"fggjf","gfgfgg");
		System.out.println(u2.gettitle());
	}



	}


