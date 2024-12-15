public class Array_maxMin {
    public static void main(String[] args) {
        int arr[]={3,8,4,9,7};
        int max=arr[0],min=arr[0];
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
            max=arr[i];
            }
            if(min>arr[i]){
            min=arr[i];
            }
        }
        System.out.println(max);
        System.out.println(min);
    
}
}
