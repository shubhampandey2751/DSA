package DS;
public class Bubblesort {
    static void bubblesort(int[]a){
        int n=a.length;
        //n-1 iterations/passes
        // i=0 to i=n-2 -->
        for(int i=0;i<n-1;i++){
            boolean flag=false; // has any swapping happend
            for(int j=0;j<n-i-1;j++){
                    // last i elements are already at correct sorted positions,
                    //so no need to check them
                if(a[j]>a[j+1]){
                    // swap- a[j],a[j+1]
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                    flag=true; //some swap has happend
                }
            }
            if(flag==false){ //have any swap happend 
                return;
            }
        }
    }
    public static void main(String[] args) {
        int[] a={4,3,2,5,1};
        bubblesort(a);
        for(int val:a){
            System.out.println(val+" ");
        }

        
    }
}
