public class Array_declare{
    public static void main(String[] args) {
        //declare array
        int arr[]={11,34,67,34,23};//static declaration
        int arr1[]=new int[5];//dynamic declaration
        arr1[0]=11;
        arr1[1]=9;
        arr1[2]=7;
        arr1[3]=5;
        arr1[4]=78;
        System.out.println("static array elements are:");
        for(int i=0;i<arr.length;i++){
            System.out.println("element of static array : "+arr[i]);//access the element of static array
        }
        System.out.println("\n");
        for(int i=0;i<arr1.length;i++){
            System.out.println("element of dynamic array : "+arr1[i]);
        }
    }
}