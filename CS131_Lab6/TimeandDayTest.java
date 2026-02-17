import java.time.*;

public class TimeandDayTest {
   public static void main(String args[]) {
	   LocalDateTime t1 = LocalDateTime.now();
	   Ar_SList slist = new Ar_SList();
	   for(int i=1;i<=250000;i++) {
		   try {
			slist.putItem(i);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	   }
	   LocalDateTime t2 = LocalDateTime.now();
	   Duration duration = Duration.between(t1, t2);
	   System.out.println("slist filled in " + duration.getSeconds() + " seconds");
	   
	   LocalDateTime t3 = LocalDateTime.now();
	   Ar_UList ulist = new Ar_UList();
	   for(int i=1;i<=250000;i++) {
		   ulist.putItem(i);
	   }
	   LocalDateTime t4 = LocalDateTime.now();
	   Duration duration2 = Duration.between(t3, t4);
	   System.out.println("ulist filled in " + duration2.getNano() + " nano seconds");
	   
	   LocalDateTime t5 = LocalDateTime.now();
	   for(int i=1;i<=250000;i++) {
		   ulist.getItem(i);
	   }
	   LocalDateTime t6 = LocalDateTime.now();
	   duration = Duration.between(t5,t6);
	   System.out.println("ulist searched in " + duration.getNano() + " nano seconds");
	   
	   t1 = LocalDateTime.now();
	   for(int i=1;i<=250000;i++) {
		   slist.getItem(i);
	   }
	   t2 = LocalDateTime.now();
	   duration = Duration.between(t1, t2);
	   System.out.println("slist searched in " + duration.getNano() + " nano seconds");
    }
   
}