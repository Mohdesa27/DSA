public class Array_deletetion {
    public static void main(String[] args) {
        int arr[]={10,60,20,30,40};
        int pos=1;
        int n=arr.length;
        for(int i=pos;i<n-1;i++){
            arr[i]=arr[i+1];
        }
        n--;
        System.out.print("{");
     for(int i=0;i<n;i++){
        System.out.print(arr[i]+",");
     }
     System.out.println("}");
    }
}
