Given two sorted arrays nums1 and nums2 of size m and n respectively, return the median of the two sorted arrays.

CODE:

import java.util.*;
class Method {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len = (nums1.length)+(nums2.length);
        int new_arr[] = new int[len];
        int k=0;
        for(int i=0;i<nums1.length;i++){
            new_arr[k++]=nums1[i];
        }
        for(int i=0;i<nums2.length;i++){
            new_arr[k++]=nums2[i];
        }
        Arrays.sort(new_arr);
        if(len%2==0){
            return ((double)new_arr[len/2]+(double)new_arr[len/2-1])/2.0;
        }
        else{
            return (new_arr[len/2]);
        }
	}
}
class Median_of_two_Sorted_Arrays{
		public static void main(String args[]){
			Scanner sc = new Scanner(System.in);
			Method obj = new Method();
			System.out.println("Enter the size of 1st array: ");
			int n = sc.nextInt();
			System.out.print("Enter the array elements: ");
			int arr1[] = new int[n];
			for(int i=0;i<n;i++){
				arr1[i]=sc.nextInt();
			}
			System.out.println("Enter the size of 2nd array: ");
			int m = sc.nextInt();
			System.out.print("Enter the array elements: ");
			int arr2[] = new int[m];
			for(int i=0;i<m;i++){
				arr2[i]=sc.nextInt();
			}
			double median=obj.findMedianSortedArrays(arr1,arr2);
			System.out.println("The Median is "+median);
    }
}

OUTPUT:
Enter the size of 1st array:
2
Enter the array elements: 1 3
Enter the size of 2nd array:
1
Enter the array elements: 2
The Median is 2.0

Enter the size of 1st array:
2
Enter the array elements: 1 2
Enter the size of 2nd array:
2
Enter the array elements: 3 4
The Median is 2.5
