//Guess theorem (to find missing number from natural numbers in series starting form 1)
class FindMissingNumber{
  public int findNumber(int[] arr){
    int n = arr.length+1;
    int total = (n*(n+1))/2;
    int sum = 0;
    for(int i=0; i<arr.length; i++){
      sum = sum+arr[i];
    }
    int missing = total - sum;
    return missing;
  }
  public static void main(String[] args){
    FindMissingNumber m = new FindMissingNumber();
    int[] arr = {1,5,4,3,6};
    System.out.println(m.findNumber(arr));
  }
}
