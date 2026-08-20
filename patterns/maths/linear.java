public class linear {
    public static void main(String[] args){
        int arr[]={1,2,3,8,4,5};
        int num=4;
        f(arr,num);
        }
        static int f(int arr[],int num){
            for(int i=0;i<arr.length;i++){
                if(arr[i]==num){
                    System.out.println("found at index "+i);
                }
            }
            return -1;
        }
    }
