package CH17;


import java.util.Calendar;
import java.util.Date;





public class C07Date {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Date d1 = new Date();
		System.out.println(d1);
		System.out.println(d1.getYear());
		System.out.println(d1.getMonth()+1);
		System.out.println(d1.getDay());
		System.out.println(d1.getHours());
		System.out.println(d1.getMinutes());
		System.out.println(d1.getSeconds());
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal);
		System.out.println(cal.get(Calendar.YEAR));		//연
		System.out.println(cal.get(Calendar.MONTH)+1);
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		System.out.println(cal.get(Calendar.HOUR));
		System.out.println(cal.get(Calendar.MINUTE));
		System.out.println(cal.get(Calendar.SECOND));
		
		String strWeek = null;
		int week = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("요일 값 : " + week);// 1 - 7 (일월화수목금토)
		System.out.println(Calendar.SATURDAY);
		
		switch(week)
		{
		case Calendar.MONDAY :
			strWeek = "월";
			break; 	
			
		case Calendar.TUESDAY :
			strWeek = "화";
			break;
		case Calendar.WEDNESDAY :
			strWeek = "수";
			break;
		case Calendar.THURSDAY :
			strWeek = "목";
			break;
		case Calendar.FRIDAY :
			strWeek = "금";
			break;
		case Calendar.SATURDAY :
			strWeek = "토";
			break;
		case Calendar.SUNDAY :
			strWeek = "일";
			break;
				
		}
		
		
		
		
	}

}
