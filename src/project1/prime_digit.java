package project1;

public class prime_digit {

	public static void main(String[] args) {
		      String a="ChAithanya gadam";
		      int vowels=0;
		      int con=0;
		      String[] words=a.split(" ",-1);
		      for(int j=0;j<words.length;j++) {
		      for(int i=words[j].length()-1;i>=0;i--) {
		    	  char ch=Character.toLowerCase(words[j].charAt(i));
		    if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
		    	vowels++;
		    	
		    }else {
		    	con++;
		    }
		      }
		      }
		    System.out.println("vowels are" + vowels);
		    System.out.println("consonants are " +con);
		      
	}
}
