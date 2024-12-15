public class Matrix_declare{
    public static void main(String[] args) {
        int arr[][]={
            {1,2,5},
            {4,7,9,4},
            {5,8,9,35,67}
        };
        int arr1[][]=new int[3][3];
        arr1[0][0]=1;
        arr1[0][1]=2;
        arr1[0][2]=5;
        arr1[1][0]=4;
        arr1[1][1]=7;
        arr1[1][2]=9;
        arr1[2][0]=5;
        arr1[2][1]=8;
        arr1[2][2]=9;
        System.out.println("First Matrix:");
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
         System.out.println();
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }
}