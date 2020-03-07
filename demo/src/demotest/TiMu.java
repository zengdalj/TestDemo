package demotest;

import java.util.Calendar;

public class TiMu {
	/**public static void main(String[] args) {
		int sum=0;
		int count=0;
		for(int i=0;i<=100;i++) {
			sum=sum+i;
			count=count++;	
			System.out.println(count);
		}	
		System.out.println(count*sum);
	}*/
	
	   public static void setValue(int value) {
           value++;
       }
       public static void setValue(Calendar value) {
           value.set(Calendar.YEAR, 2009);
       }
       public static void main(String[] args) {
           int i = 10;
           TiMu.setValue(i);
           Calendar cal = Calendar.getInstance();
           cal.set(Calendar.YEAR, 2000);
           TiMu.setValue(cal);
           System.out.print(i + "-" + cal.get(Calendar.YEAR));
       }
	
}
