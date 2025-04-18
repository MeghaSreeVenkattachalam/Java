An integer array original is transformed into a doubled array changed by appending twice the value of every element in original, and then randomly shuffling the resulting array.

Given an array changed, return original if changed is a doubled array. If changed is not a doubled array, return an empty array. The elements in original may be returned in any order.

 

Example 1:

Input: changed = [1,3,4,2,6,8]
Output: [1,3,4]
Explanation: One possible original array could be [1,3,4]:
- Twice the value of 1 is 1 * 2 = 2.
- Twice the value of 3 is 3 * 2 = 6.
- Twice the value of 4 is 4 * 2 = 8.
Other original arrays could be [4,3,1] or [3,1,4].
Example 2:

Input: changed = [6,3,0,1]
Output: []
Explanation: changed is not a doubled array.
Example 3:

Input: changed = [1]
Output: []
Explanation: changed is not a doubled array.
 

Constraints:

1 <= changed.length <= 105
0 <= changed[i] <= 105

CODE:

class Solution {
    public int[] findOriginalArray(int[] changed) {
        //here we are checking for their doubled values as well then the array should be even in lenght
        if(changed.length%2!=0) return new int[0];

        Arrays.sort(changed);
        Map<Integer,Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();
        
        for(int num:changed){
            map.put(num,map.getOrDefault(num,0)+1);
        }
        for(int num:changed){
            if(map.get(num)==0) continue;

            if(map.getOrDefault(num*2,0)==0) return new int[0];

            list.add(num);
            map.put(num,map.get(num)-1);
            map.put(num*2,map.get(num*2)-1);
        }

        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}

OUTPUT:

Runtime
91
ms
Beats
72.09%

//ANOTHER APPROACH

CODE:

class Solution {
    public int[] findOriginalArray(int[] changed) {
        if(changed.length%2!=0) return new int[0];
        Arrays.sort(changed);
        List<Integer> list = new ArrayList<>();
        boolean arr[] = new boolean[changed.length];
        for(int i=0;i<changed.length;i++){
            if(arr[i]) continue;
            boolean found = false;
            for(int j=i+1;j<changed.length;j++){
                if(changed[i]*2==changed[j] && arr[j]!=true && arr[i]!=true){
                    list.add(changed[i]);
                    arr[j]=true;
                    arr[i]=true;
                    found = true;
                    break;
                }
            }
            if(!found) return new int[0];
        }
        int res[] = new int[list.size()];
        for(int i=0;i<list.size();i++){
            res[i]=list.get(i);
        }
        return res;
    }
}

OUTPUT:

Runtime
2193
ms
Beats
5.08
