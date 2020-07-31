package Chapter3;

import java.util.Arrays;

//class LaunchChecklist {
//	
//	List<String> checks = Arrays.asList(
//			"Cabin Leak",
//			// "Communication", // 휴스턴과 정말 통화하고 싶은가?
//			"Engine",
//			"Hull",
//			// "Rover", // 내 생각에는 필요 없는데...
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