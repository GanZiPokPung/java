package Chapter3;

import java.util.Arrays;

//class LaunchChecklist {
//	
//	List<String> checks = Arrays.asList(
//			"Cabin Leak",
//			// "Communication", // �޽��ϰ� ���� ��ȭ�ϰ� ������?
//			"Engine",
//			"Hull",
//			// "Rover", // �� �������� �ʿ� ���µ�...
//			"OxygenTank"
//			// "Supplies"
//			);
//	
//	Status prepareLaunch(Commander commander) {
//		for(String check : checks) {
//			boolean shouldAbortTakeoff = commander.isFailing(check);
//			if(shouldAbortTakeoff) {
//				// System.out.println("REASON FOR ABORT: " + item);
//				return Status.ABORT_TAKE_OFF;
//			}
//		}
//		return Status.READY_FOR_TAKE_OFF;
//	}
//}

class LaunchChecklist {
	
	List<String> checks = Arrays.asList(
			"Cabin Leak",
			"Engine",
			"Hull",
			"OxygenTank"
			);
	
	Status prepareLaunch(Commander commander) {
		for(String check : checks) {
			boolean shouldAbortTakeoff = commander.isFailing(check);
			if(shouldAbortTakeoff) {
				return Status.ABORT_TAKE_OFF;
			}
		}
		return Status.READY_FOR_TAKE_OFF;
	}
}