public class Triangle {
    public static void printing(int n){
        for (int i=0;i<n;i++){
            for(int j=n-i;j>1;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        printing(5);
    }
}
