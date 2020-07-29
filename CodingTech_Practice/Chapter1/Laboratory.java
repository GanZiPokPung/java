import com.sun.net.httpserver.Authenticator.Result;
// 쓸모 없는 비교 피하기
// 부정 피하기
public class Laboratory {
	
	Miscroscope microscope;
	
	Result analyze(Sample sample) {
//		if(microscope.isInorganic(sample) == true) { // Not good code!
//		if(microscope.isInorganic(sample)) {  // 부정 피하기
		if(microscope.isOrganic(sample)) {
			return analyzeOrganic(sample);
		} else {
			return Result.INORGANIC;
		}
	}
	
	private Result analyzeOrganic(Sample sample) {
//		if(microscope.isHumanoid(sample) == false) { // Not good code!
//		if(!microscope.isHumanoid(sample)) {         // 부정 피하기
		if(microscope.isHumanoid(sample)) {
			return Result.HUMANOID;
		} else {
			return Result.ALIEN;
		}
	}
}
