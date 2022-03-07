//print name 1000 times without using loops.
public class PrintNames {
    public static void main(String[] args) {
        String s = "java";
        //printNameWithLoop(s);
        print(s);
    }

    public static void printNameWithLoop(String s){
        int i=0;
        while(i<1000){
            System.out.println(s);
            i++;
        }
    }

    public static void print(String s){
        String str ="i";
        str = str.replaceAll("i","iiiiiiiiii"); //10
        str = str.replaceAll("i","iiiiiiiiii"); // 10*10
        str = str.replaceAll("i","iiiiiiiiii"); //100*10
        str = str.replaceAll("i",s+"\n");
        System.out.println(str);
    }
}
