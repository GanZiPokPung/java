// 불 표현식을 직접 반환
public class Astronaut {
	
	String name;
	int missions;
	
	boolean isValid() {
		// Not good code
		/*
		 * if(missions < 0 || name == null || name.trim().isEmpty()) { return false; }
		 * else { return true; }
		 */
		// good code
//		return missions >= 0 && name != null && !name.trim().isEmpty();
		// 조건이 많다면 작은 덩어리로 분할
		boolean isValidMissions = missions >= 0;
		boolean isValidName = name != null && !name.trim().isEmpty();
		return isValidMissions && isValidName;
	}
}
