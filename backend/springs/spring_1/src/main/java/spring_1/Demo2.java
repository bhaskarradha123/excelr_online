package spring_1;

public class Demo2 {
	 private Demo demoRef; // has a relationship
	 private double valueC;
	 
	public Demo getDemoRef() {
		return demoRef;
	}
	 public void setDemoRef(Demo demoRef) {
		 this.demoRef = demoRef;
	 }
	 public double getValueC() {
		 return valueC;
	 }
	 public void setValueC(double valueC) {
		 this.valueC = valueC;
	 }
	@Override
	public String toString() {
		return "Demo2 [demoRef=" + demoRef + ", valueC=" + valueC + "]";
	}
	
	
	
	
	

}
