package j2;

import java.util.Scanner;

public class Array {
    public static void main(Strings[] args) {
      /* 
        int[] marks = new int[3];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;

        for (int i = 0; i < 3; i++) {
            System.out.println(marks[i]);
        }
            */
           

            /*  search x  user se input lenge*/

            Scanner sc = new Scanner(System.in);
            int size = sc.nextInt();
            int numbers[] =new int[size];
         
            for(int i=0;i<size;i++){
                numbers[i]=sc.nextInt();

            }
            int x= sc.nextInt();

            for(int i=0;i<numbers.length;i++){
                if(numbers[i]==x){
                    System.out.println("x found at index :" + i);
                }
            }
    }
}

