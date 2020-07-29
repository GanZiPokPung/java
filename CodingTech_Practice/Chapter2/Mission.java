package Chapter2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

// 이어 붙이기 대신 서식화
//class Mission {
//
//	Logbook logbook;
//	LocalDate start;
//	
//	void update(String author, String message) {
//		LocalDate today = LocalDate.now();
//		String month = String.valueOf(today.getMonthValue());
//		String formattedMonth = month.length() < 2 ? "0" + month : month;
//		String entry = author.toUpperCase()+ ": [" + formattedMonth + "-" +
//					   today.getDayOfMonth() + "-" + today.getYear() + "](Day " +
//					   (ChronoUnit.DAYS.between(start, today) + 1) + ")>" +
//					   message + System.lineSeparator();
//		logbook.write(entry);
//	}
//}

class Mission {

	//Logbook logbook;
	LocalDate start;
	
	void update(String author, String message) {
		final LocalDate today = LocalDate.now();
		String entry = String.format("%S: [%tm-%<te-%<tY](Day %d)> %s%n",
				author, today,
				ChronoUnit.DAYS.between(start, today) + 1, message);
		System.out.println(entry);
		//logbook.write(entry);
	}
}

