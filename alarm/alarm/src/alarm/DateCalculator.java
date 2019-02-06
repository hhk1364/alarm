package alarm;

import java.text.SimpleDateFormat;

public class DateCalculator {

	public static int datecalculator(String scon){
				
		int timmer = 0;
		
		String yyyy = scon.substring(0,4);
		String MM = scon.substring(4,6);
		String dd = scon.substring(6,8);
		String hh = scon.substring(8,10);
		String mm = scon.substring(10);
		//System.out.println(yyyymmdd);
		//System.out.println(hhmm);
		
		SimpleDateFormat format1 = new SimpleDateFormat ( "yyyy");
		SimpleDateFormat format2 = new SimpleDateFormat ( "MM");
		SimpleDateFormat format3  = new SimpleDateFormat ( "dd");
		SimpleDateFormat format4 = new SimpleDateFormat ( "HH");
		SimpleDateFormat format5 = new SimpleDateFormat ( "mm");
		
		String format_time1 = format1.format (System.currentTimeMillis());
		String format_time2 = format2.format (System.currentTimeMillis());
		String format_time3 = format3.format (System.currentTimeMillis());
		String format_time4 = format4.format (System.currentTimeMillis());
		String format_time5 = format5.format (System.currentTimeMillis());
		
			
		int pretime1 = Integer.parseInt(format_time1);
		int pretime2 = Integer.parseInt(format_time2);
		int pretime3 = Integer.parseInt(format_time3);
		
		int posttime1 = Integer.parseInt(format_time4);
		int posttime2 = Integer.parseInt(format_time5);
		
		int input_pretime1 = Integer.parseInt(yyyy);
		int input_pretime2 = Integer.parseInt(MM);
		int input_pretime3 = Integer.parseInt(dd);
		
		int input_posttime1 = Integer.parseInt(hh);
		int input_posttime2 = Integer.parseInt(mm);
		
		/*
		 * System.out.println(input_pretime1); System.out.println(input_pretime2);
		 * System.out.println(input_pretime3); System.out.println(input_posttime1);
		 * System.out.println(input_posttime2);
		 */
		
		
		int timmer_pre_time1 =  (input_pretime1 - pretime1) * 31556926; 
		int timmer_pre_time2 =  (input_pretime2 - pretime2) * 2592000; 
		int timmer_pre_time3 =  (input_pretime3 - pretime3) * 86400; 
			
		int timmer_post_time1 = (input_posttime1 - posttime1) * 3600;
		int timmer_post_time2 = (input_posttime2 - posttime2) * 60;
		
		timmer = timmer_pre_time1+timmer_pre_time2+timmer_pre_time3+timmer_post_time1+timmer_post_time2;
		
		/*
		 * System.out.println(timmer_pre_time1); System.out.println(timmer_pre_time2);
		 * System.out.println(timmer_pre_time3); System.out.println(timmer_post_time1);
		 * System.out.println(timmer_post_time2);
		 * 
		 */
		
		System.out.println(timmer);
		
		return timmer*1000;
		
	}
}
