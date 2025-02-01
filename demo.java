import java.util.*;
class demo{
    public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enter the number:");

        int numb =sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println();
            System.out.println(numb+"X"+i+"="+(i*numb));

        }
    }
}