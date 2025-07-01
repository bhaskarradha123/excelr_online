package spring_1;

public class Demo {
	private int valueA;
	private String valueB;
	public Demo() {
		super();
	}
	public Demo(int valueA, String valueB) {
		super();
		this.valueA = valueA;
		this.valueB = valueB;
	}
	public int getValueA() {
		return valueA;
	}
	public void setValueA(int valueA) {
		this.valueA = valueA;
	}
	public String getValueB() {
		return valueB;
	}
	public void setValueB(String valueB) {
		this.valueB = valueB;
	}
	@Override
	public String toString() {
		return "Demo [valueA=" + valueA + ", valueB=" + valueB + "]";
	}

}
