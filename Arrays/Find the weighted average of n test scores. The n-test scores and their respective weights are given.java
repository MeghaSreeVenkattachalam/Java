Write a program to find the weighted average of n test scores. The n-test scores and their respective weights are given.

The weighted average of test scores = sum of (test scores*weights) / sum of all weights.

Input format :
The first line of the input consists of the value of n.
The next n lines consist of the test scores and their weights.
Output format :
The output prints the weighted average of the test scores (rounded off to 2 decimals).
Refer to the sample input and output for formatting specifications.

Sample test cases :
Input 1 :
4
75 0.20
95 0.35
85 0.15
65 0.30
Output 1 :
80.50
Input 2 :
5
91 0.10
65 0.15
80 0.20 
73 0.25
68 0.30
Output 2 :
73.50

CODE:
  
import java.util.*;
class weighted_avg{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		double test_score[] = new double[n];
		double weight[] = new double[n];
		
		double totalweight = 0;
		double sum_of_weight = 0;
		System.out.println("Enter the test scores and weights: ");
		for(int i=0;i<n;i++){
			test_score[i]=sc.nextDouble();
			weight[i]=sc.nextDouble();
			
			totalweight += test_score[i]*weight[i];
			sum_of_weight += weight[i];
		}
		double weighted_avg = totalweight/sum_of_weight;
		System.out.printf("%.2f The weighted average is: ",weighted_avg);
	}
}

OUTPUT:
Enter the size of the array:
5
Enter the test scores and weights:
91 0.10
65 0.15
80 0.20
73 0.25
68 0.30
The weighted average is: 73.50 
