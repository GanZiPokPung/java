
import java.util.Objects;

//스위치 실패 피하기
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

// 항상 괄호 사용하기
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

// 코드 대칭 이루기
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