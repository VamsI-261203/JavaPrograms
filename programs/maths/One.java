//metho overridingn

class One{
	public static void main(String[] args){
		Child c=new Child();
		c.mul(10,20);
		c.add();
		}
}
class O {
	public void add(){
	}
	}
class Child extends O{
	public void mul(int a,int b){
		int c=a*b;
		System.out.println(c);
		}
	@Override
	public void add()
	{
		System.out.println("Parent override clss");
	}
}