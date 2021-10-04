import java.util.*;
public class binarysearch {
    public static void main(String args[]){
        Scanner sc= new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Enter number of elements:");
        int n =sc.nextInt();
        System.out.println("Enter number which you want to find:");
        int m= sc.nextInt();
        int[] a= new int[n];
        for(int i=0;i<n;i++){
            a[i]=rd.nextInt(10000-6)+6;
            //System.out.println(a[i]+" ");
        }
        Arrays.sort(a);
        long start= System.nanoTime(); 
        int l = 0,r=n-1,mid = (l+r)/2;
        //a[mid]=m;
        while(l<=r){
            //System.out.print(mid+" ");
            if(a[mid]==m){
                System.out.println(m+" is present at: "+ (mid+1));
                break;
            }
            else if(a[mid]>m){
                r=mid-1;
            }
            else{
                l = mid+1;
            }
            mid = (r+l)/2;
        }
        long end = System.nanoTime();
        if(l>r){
            System.out.println(m+ " is not found.");
        }
        long totaltime= (end-start)/1000;
        System.out.println("Total time taken to execute this program is:"+totaltime+" ms");
    }
}
