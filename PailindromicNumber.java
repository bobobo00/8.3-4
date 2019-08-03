package day14;

/**
 * @ClassName PailindromicNumber
 * @Description TODO
 * @Auther danni
 * @Date 2019/8/3 23:19]
 * @Version 1.0
 **/

public class PailindromicNumber {
    public static void main(String[] args) {
        int number=12321;
        int p=10;
        int temp=0;
        int[] arr=new int[10];
        int i=0;
        while(temp!=number){
            temp=number%p;
            int q=p/10;
            arr[i++]=temp/q;
            p*=10;
        }
        int first=0;
        int last=--i;
        while(first<=last){
            if(arr[first]==arr[last]){
                first++;
                last--;
            }
            if(first==last||first>last){
                System.out.println("是回文数");
                break;
            }

            if(arr[first]!=arr[last]){
                System.out.println("不是回文数");
                break;
            }
        }


    }
}
