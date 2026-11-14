package project1;

public class reverseString {

	public static void main(String[] args) {
		String s="hello java";
		String rev="";
		String[] words=s.split(" ",-1);
		for(int j=0;j<words.length;j++) {
			for(int i=words[j].length()-1;i>=0;i--) {
				rev=rev+words[j].charAt(i);
			}if(j<words.length-1) {
				rev=rev+" ";
			}
		}System.out.println(rev);

	}

}
