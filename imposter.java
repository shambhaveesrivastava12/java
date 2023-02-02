import java.util.*;
class imposter
{
    Scanner sc = new Scanner(System.in);
     int revduplicates(int arr[], int n)
    {
        
        if(n==0 || n==1){
            return n;
        }
        
    int j=0;
    for(int i=0; i<n-1; i++)
    {
        if(arr[i]!=arr[i+1])
        {
            arr[j++]=arr[i];
        }
    }
    arr[j++]=arr[n-1];
    return j;
}
}
class Dwm{
public static void main(String args[])
{;
    imposter kn = new imposter();
    int arr[]={1,1,1,2,2,3,3,4,4,5};
    int n = arr.length;
    int j = 0;
    j=kn.revduplicates(arr, n);
    for(int i=0; i<j; i++){
        System.out.println(arr[i] + " ");
    }

}
}


