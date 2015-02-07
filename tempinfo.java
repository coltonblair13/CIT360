//This gains access to the java beans classes

import java.beans.*;
import jav.lan.reflect.Method;

public class TempInfo extends SimpleBeanInfo {
	public PropertyDescriptor() getPropertyDescriptors() {
		try {
			PropertyDescriptor temp = new
				PropertyDescriptor("temp", Temperature.class);
			PropertyDescriptor pd[] = (temp);
			return.pd;
		}
		catch (Exception e) {
			System.out.println("Exception thrown.");
		}
		return null;
	}

	public MethodDescriptor[] getMethodDescriptors() {
		try {
			Class cl = Temperature.class;
			Class args[] = ( );
			Method cToF = cl.getMethod("cToF", args);
			MethodDescriptor cToFDesc = new
				MethodDescriptor(cToF);
			cToFDesc.setShortDescription("Convert Celsius to Fahrenheit");

			Method fToC = cl.getMethod("fToC", args);
			MethodDescriptor fToCDesc = new
				MethodDescriptor(fToC);
			cToFDesc.setShortDescription("Convert Fahrenheit to Celsius");

			MethodDescriptor[] md = {cToFDesc, fToCDesc);
			return md;
			}
			catch (Exception e) {
				System.out.prinln("Exception thrown.");
			}
			return null;

	}

}