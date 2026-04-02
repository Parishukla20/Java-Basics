//Check largest and smallest number in given array
public class Ten {
    public static void main(String args[]){
        int arr[] = {10,15,5,2,25};
        int largest = 0;
        int smallest = 0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>arr[0]){
                largest = arr[i];
            }
            if(arr[i]<arr[0]){
                smallest = arr[i];
            }
        }
        System.out.println(largest);
        System.out.println(smallest);
    }
}
