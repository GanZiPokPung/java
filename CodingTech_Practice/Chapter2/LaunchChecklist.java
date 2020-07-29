package Chapter2;

//class LaunchChecklist {
//	List<String> checks = Array.asList("Cabin Pressure", 
//			"Communication", 
//			"Engine");
//	
//	Status prepareForTakeOff(Commander commander) {
//		for(int i = 0; i < checks.size(); ++i) {
//			boolean shouldAbortTakeoff = commander.isFailing(checks.get(i));
//			if(shouldAbortTakeoff) {
//				return Status.ABORT_TAKE_OFF;
//			}
//		}
//		return Status.READY_FOR_TAKE_OFF;
//	}
//}

class LaunchChecklist {
	List<String> checks = Array.asList("Cabin Pressure", 
			"Communication", 
			"Engine");
	
	Status prepareForTakeOff(Commander commander) {
		for(String check : checks)) {
			boolean shouldAbortTakeoff = commander.isFailing(check);
			if(shouldAbortTakeoff) {
				return Status.ABORT_TAKE_OFF;
			}
		}
		return Status.READY_FOR_TAKE_OFF;
	}
}
