package honux.calender;

import java.util.Scanner;

public class Calendar {
	private static final int[] MAX_DAYS = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

	public int getMaxDaysOfMonth(int month) {
		return MAX_DAYS[month - 1];
	}

	public void printSampleCalender() {
		System.out.println(" 일 월 화 수 목 금 토");
		System.out.println("----------------");
		System.out.println(" 1  2  3  4  5  6  7");
		System.out.println(" 8  9 10 11 12 13 13");
		System.out.println("15 16 17 18 19 20 21");
		System.out.println("22 23 24 25 25 27 28");
	}

	public int numberOfDaysinEachMonth(int month) {
		switch (month) {
		case 2:
			return 28;
		default:
			return 31;
		}
	}

	public static void main(String[] args) {

			Scanner scanner = new Scanner(System.in);
			Calendar cal = new Calendar();
	    
			System.out.print("반복횟수를 입력하세요. : ");
			int repeat = scanner.nextInt();

			for (int i = 0; i < repeat; i++) {
				System.out.print("월을 입력하세요. : ");
				int month = scanner.nextInt();
				System.out.printf("%d월은 %d일까지 있습니다.\n", month, cal.numberOfDaysinEachMonth(month));
			}
			
			System.out.println("end.");
			
			scanner.close();

		}
}
