import java.io.Serializable;


//Every JavaBean has to be serializable..


//Creating a constructor

public class Temperature implements Serializable  {
	public Temperature() {
		temp = 0.0;
}


//Must Create getters and setter for Javabeans. A temperature value must be returned or set. Meaning a value is either being returned or passed in.

//getter called getTemp

	public double getTemp() {
		return temp;
 }


//setter called setTemp which is paramater T

	public void setTemp (double t) {
 		temp = t;
 }

//Write methods that are necessary for the class

//cToF method converts celsius to Farenheit

	public void cToF() {
		temp = temp * (9.0/5.0) + 32.0;

 }

//fToC method converts farenheit to celsius

	public void fToC() {
		temp = (temp - 32.0) * (5.0/9.0);
 }


