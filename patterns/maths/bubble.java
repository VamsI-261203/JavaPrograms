public class bubble{
    public static void main(String[] args){
        int arr[]={50,400,20,1,3,60};
        f(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    static void f(int arr[]){
        for(int i=arr.length-1;i>=1;i--){
            for(int j=0;j<=i-1;j++){
                if(arr[j]>arr[i]){
                    int temp=arr[j];
                    arr[j]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
}