public class hello 
{
    int i=10;
   public static void main(String[] args){
        System.out.println("Hello World");
        hello obj=new hello();
        hello.inner obj1=obj.new inner();
        obj1.display();
    }
    class inner{
        void display(){
            System.out.println("Hello World"+i);
        }
    }

}
