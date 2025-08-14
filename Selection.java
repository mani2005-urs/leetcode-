

public class Selection {
    private static int selectionSort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n-1;i++){
            int sel=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[sel]){
                    sel=j;
                }
            }
            int temp=arr[sel];
            arr[sel]=arr[i];
            arr[i]=temp;

        }
        for (int idx = 0; idx < arr.length; idx++) {
            System.out.print(arr[idx] + " ");
            
        }
        return 0;
    }
   public static void main(String[] args) {
    int[] arr={5,3,4,2,11};
    selectionSort(arr);
       
   }
     
}