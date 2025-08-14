
//3477. Fruits Into Baskets II
class Solution {
    public int numOfUnplacedFruits(int[] fruits, int[] baskets) {
        int nc=fruits.length;;
        for(int i=0;i<fruits.length;i++){
            for(int j=0;j<baskets.length;j++){
                if(fruits[i]<=baskets[j]){
                    baskets[j]=0;
                    break;
                }
            }
        }
        return nc-countZero(baskets);
    }
    private int countZero(int[] arr){
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                c++;
            }
        }
        return c;
    }
}
