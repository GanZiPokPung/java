// �� ǥ������ ���� ��ȯ
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
		// ������ ���ٸ� ���� ����� ����
		boolean isValidMissions = missions >= 0;
		boolean isValidName = name != null && !name.trim().isEmpty();
		return isValidMissions && isValidName;
	}
}
