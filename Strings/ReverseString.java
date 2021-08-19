class ReverseString {
	public static void main (String[] args) {
		System.out.print("Reversed String: ");
		ReverseString r = new ReverseString();
		System.out.println(r.reverse("github"));
	}
	public String reverse(String s){
	    String ret = "";
	    for(int k = 0;k < s.length();k++){
	        ret = s.charAt(k)+ret;
	    }
	    return ret;
	}
}
