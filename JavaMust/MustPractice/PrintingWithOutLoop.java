package MustPractice;

public class PrintingWithOutLoop {
    public static void print(int num){
        if(num<=100){
            System.out.println(num);
            num++;
            print(num);
        }
    }
    public static void printWithStartEnd(int start, int end){
        if(start<=end){
            System.out.println(start);
            start++;
            printWithStartEnd(start,end);
        }
    }

    public static void main(String[] args) {
        print(1);
        printWithStartEnd(10,100);
    }
}
