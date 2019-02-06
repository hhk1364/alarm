package alarm;

import java.text.SimpleDateFormat;

public class DateCalculator {

	public static boolean datecalculator(String scon){
			
		boolean result =  false;
		String input = scon;
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyyMMddHHmm");
		
		String format_time1 = format1.format (System.currentTimeMillis());
		
		if(input.equals(format_time1)) {
			result = true;
			return result;
		}
			
		else
			return result;
		
	}
}
