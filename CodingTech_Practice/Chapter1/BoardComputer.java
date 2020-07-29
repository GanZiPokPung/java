
import java.util.Objects;

//����ġ ���� ���ϱ�
//public class BoardComputer {
//	
//	CruiseControl cruiseControl;
//	
//	void authorize(User user) {
//		Objects.requireNonNull(user);
//		switch(user.getRank()) {
//		case UNKNOWN:
//			cruiseControl.logUnauthorizedAccessAttempt();
//			break;
//		case ASTRONAUT:
//			cruiseControl.grantAccess(user);
//			break;
//		case COMMANDER:
//			cruiseControl.grantAccess(user);
//			cruiseControl.grantAdminAccess(user);
//			break;
//		}
//	}
//}

// �׻� ��ȣ ����ϱ�
//public class BoardComputer {
//
//CruiseControl cruiseControl;
//
//void authorize(User user) {
//	Objects.requireNonNull(user);
//	if(user.isUnkown()) {
//		cruiseControl.logUnauthorizedAccessAttempt();
//	}
//		
//	if(user.isAstronaut()) {
//		cruiseControl.grantAccess(user);
//	}
//		
//	if(user.isCommander()) {
//		cruiseControl.grantAccess(user);
//	    cruiseControl.grantAdminAccess(user);
//	}
//}
//
//}

// �ڵ� ��Ī �̷��
public class BoardComputer {

CruiseControl cruiseControl;

void authorize(User user) {
	Objects.requireNonNull(user);
	if(user.isUnkown()) {
		cruiseControl.logUnauthorizedAccessAttempt();
	} else if(user.isAstronaut()) {
		cruiseControl.grantAccess(user);
	} else if(user.isCommander()) {
		cruiseControl.grantAccess(user);
	    cruiseControl.grantAdminAccess(user);
	}
}

}