package alarm;


import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 입력양식 yyyymmddhhmm		
		Scanner scan = new Scanner(System.in);
		String scon = scan.next();
		
		DateCalculator.datecalculator(scon);
		
		
		Timer m_timer = new Timer();
		TimerTask m_task = new TimerTask() {

				@Override
				public void run() {
				// TODO Auto-generated method stub
					if(DateCalculator.datecalculator(scon)) {
							PlaySound2.playsound();
							m_timer.cancel();
					}
				}
		
					
		};
		m_timer.schedule(m_task, 0, 1000);
		
			
		
		
		
	}

}
