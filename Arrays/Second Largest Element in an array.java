import java.util.*;
class Second_Largest_Element
 {
    public static int getSecondLargest(int[] arr,int n) {
       
        Arrays.sort(arr);
        
        for(int i=n-2; i>=0; i--){
            
            if(arr[i]!=arr[n-1]){
                return arr[i];
            }
        }
        return -1;
    }
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        int[] arr = new int[n];
		for(int i=0;i<n;i++){
			arr[i] = sc.nextInt();
		}
        System.out.print(getSecondLargest(arr,n));
    }
}
