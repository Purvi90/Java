package j2;

public class Pattern {
    public static void main(Strings[] args) {
     /*    int n=4;
        int m=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=m;j++){
                System.out.print("*");
            }
            System.out.println();
        }
            */
            /* 
            int n=4;
            for(int i=1;i<=n;i++){
                for(int j=1;j<=i;j++){

                
                System.out.print("*");
            }
           System.out.println();

        }
    }
        */

        int n=5;
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
}
}