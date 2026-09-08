class B{
    int num1,num2;
    public int multiply(int num1,int num2){
        int mul=num1*num2;
        System.out.println("Multiplication of "+num1+" and "+num2+" is: "+mul);
        return mul;
    }
    public int add(int num1,int num2){
        int sum=num1+num2;
        System.out.println("Addition of "+num1+" and "+num2+" is: "+sum);
        return sum;
    }

}
class A{
    public static void main(String[] args){
        B obj=new B();
        int result=obj.multiply(5,10);
        if(result==50){
            System.out.println("Test case passed");
        }
        else{
            System.out.println(" Test case failed");
        }
    }
}