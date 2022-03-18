import java.util.ArrayList;
import java.util.List;

public class SecondHighest {
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>();
       a.add(4);
        //int array[] = { 1, 2, 3, 4, 11, 12, 13, 14, 21, 22, 23, 24, 31, 32};
        a.add(94);
        a.add(0);
        a.add(44);
        int high = 0;
        int secondh = 0;
        for(int i=0;i<a.size();i++){
            if(a.get(i)>high){
                secondh = high;
                high = a.get(i);
            }else if(a.get(i)>secondh){
                secondh = a.get(i);
            }
        }
        System.out.println(high);
        System.out.println(secondh);

    }
}
