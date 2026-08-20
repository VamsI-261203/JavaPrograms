public class major{
    public static void main(String[] args){
        int arr[]={1,2,3,4,4,4,5,6,8,8,8,8};
        f(arr);
    }
    static void f(int arr[]){
        int count=0;
        int ele=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                count=1;
                ele=arr[i];
            }
            else if(arr[i]==ele){
                count++;
            }
            else{
                count--;
            }

        }
        int count1=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==ele){
                count1++;
            }
        }
        if(ele>arr.length/2){
            System.out.println(ele);
        }

    }
    
}
