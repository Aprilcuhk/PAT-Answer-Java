import java.util.Scanner;
public class Code1038 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int data=sc.nextInt();
        int gewei=data%10;
        int shiwei=data%100/10;
        int baiwei=data/100;
        if(data<0) {
            return;
        }
        while(baiwei>0) {
            System.out.print("B");
            baiwei--;
        }
        while(shiwei>0) {
            System.out.print("S");
            shiwei--;
        }
        for(int i=1;i<=gewei;i++) {
            System.out.print(i);
        }
        System.out.println();
    }
}
