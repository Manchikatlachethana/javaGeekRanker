package git;

public class Punctuation {

	public static void main(String[] args) {
		
		String input= "httpgitcommyprofile";
		String [] tokens= {"http","https","tcp","udp","ssh"};
		String output= "";
		
		for(String title:tokens) {
			if(input.startsWith(title)) {
				output+=title;
				output+="://";
				input=input.replaceFirst(title,"");
				
			}
			
		}
		String []bro=input.split("com",2);
		output+=bro[0];
		output+=".";
		output+="com";
		output+="/";
		output+=bro[1];
		System.out.println(output);
		

	}

}

/* sample output
http://git.com/myprofile
*/
