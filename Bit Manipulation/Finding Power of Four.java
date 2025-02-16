Check whether it is a power of 4 or not?

class Solution {
    public boolean isPowerOfFour(int n) {
        return (n>0) && (n & (n-1)) == 0 && (n-1)%3 == 0;
    }
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    System.out.print(isPowerOfFour(n));
  }
}
