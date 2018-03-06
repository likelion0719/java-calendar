package calendar;

import java.util.Calendar;
import java.util.Scanner;

public class calendarMain {
	private static final String PROMPT = "cal > ";
	public static void run() {
		
		//숫자를 입력받아 해당하는 달의 최대 일수를 출력하는 프로그램
		Scanner sc = new Scanner(System.in);
		calendar c1 = new calendar();
		
		
		while(true) {
			System.out.println("달을 입력하세요");
			System.out.println(PROMPT);
			int month = sc.nextInt();
			if(month == -1) {
				break;
			}
			if (month > 12) {
				continue;
			}
			c1.printCalendar(2018, month);
		}
	
		sc.close();
	}
	
	public static void main(String[] args) {
		calendarMain main = new calendarMain();
		main.run();
	}
}
