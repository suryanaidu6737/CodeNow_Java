import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=s.length();
        String v="aeiouAEIOU";
        for(int i=0;i<n;i++){
            char ch=s.charAt(i);
            if(v.indexOf(ch)!=-1){
                int outnum=magicfun(i);
                System.out.print(outnum);
            }else{
                System.out.print(ch);
            }
        }
    }
public static int magicfun(int i){
    int res=i*5;
    int outnum=findodd(res);
    int sum=0;
    while(outnum>0){
        int rem=outnum%10;
        sum+=rem;
        outnum/=10;
        if(outnum==0 && sum>9){
            outnum=sum;
            sum=0;
        }
    }
    return sum;
}
public static int findodd(int res){
    int sum=0;
    for(int i=1;i<=res;i++){
        if(i%2!=0){
            sum+=i;
        }
    }
    return sum;
}
}
