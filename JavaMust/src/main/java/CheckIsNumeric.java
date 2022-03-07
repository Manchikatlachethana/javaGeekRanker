
//check whether sequence is numeric
public class CheckIsNumeric {

    public static boolean isEmpty(CharSequence cs){
        if(cs == null ||cs.length()==0){
            return false;
        }
        return true;
    }

    public static boolean isNumeric(CharSequence cs){
        if(!isEmpty(cs)){
            return false;
        }
        for(int i=0;i<cs.length();i++){
            if(!Character.isDigit(cs.charAt(i))){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(isNumeric(null));
        System.out.println(isNumeric(""));
        System.out.println(isNumeric("1null"));
        System.out.println(isNumeric("null1"));
        System.out.println(isNumeric("nu0ll"));
        System.out.println(isNumeric("1"));
        System.out.println(isNumeric("1 "));
        System.out.println(isNumeric("-1"));
        System.out.println("unicode: "+"\u0030");
        System.out.println(isNumeric("\u0030"));//uniode
    }
}
