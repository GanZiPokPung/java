package Chapter3;

import java.util.regex.Pattern;

//class Supply {
//	/**
//	 * 아래 코드는 어디서든 재고를 식별한다.
//	 * 
//	 * S로 시작해 숫자 다섯자리 재고 번호가 나오고
//	 * 뒤이어 앞의 재고 번호와 구분하기 위한 역 슬래시가 나오고
//	 * 국가 코드가 나오는 엄격한 형식을 따른다.
//	 * 국가 코드는 반드시 참여 국가인 (US, EU, RU, CN) 중
//	 * 하나를 뜻하는 대문자 두 개여야 한다.
//	 * 이어서 마침표와 실제 재고명이 소문자로 나온다.
//	 */
//	static final Pattern CODE =
//			Pattern.compile("^S\\d{5}\\\\(US|EU|RU|CN)\\.[a-z]+$");
//}

class Supply {
	/**
	 * 아래 표현식은 어디서든 재고 코드를 식별한다.
	 * 
	 * 형식: "S<inventory-number>\<COUNTRY_CODE>.<name>"
	 * 
	 * 유효한 예: "S12345\US.pasta", "S08342\CN.wrench"
	 * "S88888\EU.laptop", "S12233\RU.brush"
	 * 
	 * 유효하지 않은 예:
	 * "R12345\RU.fuel"		(재고가 아닌 자원)
	 * "S1234\US.light"		(숫자가 다섯 개여야 함)
	 * "S01234\AI.coconut"	(잘못된 국가 코드, US EU RU CN 중 하나를 사용한다)
	 * "S88888\EU.laptop " 	(마지막에 여백이 있음)
	 */
	static final Pattern SUPPLY_CODE =
			Pattern.compile("^S\\d{5}\\\\(US|EU|RU|CN)\\.[a-z]+$");
}
