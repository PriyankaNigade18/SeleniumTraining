package dataAbstraction;

public class TestAccessSamepackage extends AccessModifier{

	public static void main(String[] args) {
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.id);//default
		System.out.println(a1.name);//public
		System.out.println(a1.phno);//protected
		
	}

}
