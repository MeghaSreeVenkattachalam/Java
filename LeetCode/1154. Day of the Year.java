Given a string date representing a Gregorian calendar date formatted as YYYY-MM-DD, return the day number of the year.

Example 1:
Input: date = "2019-01-09"
Output: 9
Explanation: Given date is the 9th day of the year in 2019.
Example 2:
Input: date = "2019-02-10"
Output: 41

Constraints:
date.length == 10
date[4] == date[7] == '-', and all other date[i]'s are digits
date represents a calendar date between Jan 1st, 1900 and Dec 31st, 2019.

CODE:

class Solution {
    public int dayOfYear(String date) {
        String str = date;
		char ch[] = str.toCharArray();
		int year = Integer.valueOf(str.substring(0,4));
		int total_days = 0;
		int month = Integer.valueOf(str.substring(5,7));
		int sum=0;
		int day = Integer.valueOf(str.substring(8,10));

        //for doing such things u can easily spilt the input "-" based on hyphen
        //then convert them to string array
        //easily change arr[0],arr[1],arr[2] to integer
		for(int i=1;i<month;i++){
		if(i==1 || i==3|| i==5 || i==7 || i==8 || i==10 || i==12){
			sum+=31;
			
		}else if(i==2){
		if(year%4==0 && year%100!=0 || year%400==0){
			sum+=29;
			
		}else{
			
			sum+=28;
			
		}
		}	
		else{
			sum +=30;
			
		}
		}
		
	if(month>1){
		return sum+day;
    }
     else return day;
    }
}

OUTPUT:
Runtime
7
ms
Beats
92.85%
