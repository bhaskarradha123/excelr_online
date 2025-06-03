package encapsulation_program;

public class Clock {
// hiding data members by using private keyword
	 private int hrs;
	 private int min;
	 private int sec;
	 
	 public void setHrs(int hrs) {
		 if(hrs>=0&&hrs<=12)
		 this.hrs=hrs;
	 }
	 public void setMin(int min) {
		 if(min>=0&&min<=60)
		 this.min=min;
	 }
	 public void setSec(int sec) {
		 if(sec>=0&&sec<=60)
		 this.sec=sec;
	 }
	 public int getHrs() {
		 return  this.hrs;
	 }
	 public int getMin() {
		 return this.min;
	 }
	 public int getSec() {
		 return this.sec;
	 }
	 public void displayTime() {
		 System.out.println("The time is : "+hrs+":"+min+":"+sec);
	 }
	
	 
}
