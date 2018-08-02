package lti.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class DynamicReflection {
	public static void main(String[] args) throws Exception {
		String qcn = "lti.reflect.Customer";
		
		// Manually loading the class
		Class custClass = Class.forName(qcn);
		
		// Getting the parameterized constructor
		Constructor custConst = custClass.getConstructor(String.class);
		
		// Instantiating with parameterized constructor
		Object obj = custConst.newInstance("Zubair");
		System.out.println(obj);
		
		// Getting private method of class with name and param types
		Method printMethod = custClass.getDeclaredMethod("print", null);

		// Calling print method on customer object
		printMethod.setAccessible(true);
		printMethod.invoke(obj, null);
	}
}
