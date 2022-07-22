package encapsulationTest;

import dataAbstraction.AccessModifier;
import dataAbstraction.TestAccessSamepackage;

public class TestAccessModifier extends AccessModifier {

	public static void main(String[] args) {
		AccessModifier a1=new AccessModifier();
		System.out.println(a1.name);//public
		TestAccessModifier t1=new TestAccessModifier();
		System.out.println(t1.phno);
		
	}

}
