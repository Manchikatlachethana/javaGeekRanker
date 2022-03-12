public class LeftPyramid {
    public static void pyramid(int n){
        for (int i=0;i<n;i++){
            for(int j=2*(n-i);j>=0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        pyramid(5);
    }
}
