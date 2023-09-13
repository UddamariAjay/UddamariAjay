package pack1;

import Pack2.*;

public class MainClass extends classA{

	MainClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int val=10;
	public String name2= "ajay...";
	private int val2=5;
	
	/*MainClass(int vale, String names){
		this.val = vale;
		this.name = names;
	}*/
	
	public void Party() {
		System.out.println("lets make a party mainclass");
	}
	
	public void test() {
		System.out.println(val);
		System.out.println(super.name2);
		System.out.println(name2);
		super.Party();
	}
	public static void main(String[] args) {
		
		MainClass m = new MainClass();
		
		//pack2Class1 p1 = new pack2Class1();
		
		pack2Class2 p2 = new pack2Class2();
		
		classA a = new classA();
		m.test();
		System.out.println(m.val2);
		System.out.println(m.value);
		
		
		
	}

}
