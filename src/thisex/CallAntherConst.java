package thisex;

public class CallAntherConst {
	public static void main(String[] args) {
		Person noName = new Person( );
		System.out.println(noName.name);
		System.out.println(noName.age);
		
		Person p = noName.returnItself();
		System.out.println(p);
		System.out.println(noName);
	}

}
