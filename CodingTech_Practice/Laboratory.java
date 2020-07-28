import com.sun.net.httpserver.Authenticator.Result;
// ���� ���� �� ���ϱ�
// ���� ���ϱ�
public class Laboratory {
	
	Miscroscope microscope;
	
	Result analyze(Sample sample) {
//		if(microscope.isInorganic(sample) == true) { // Not good code!
//		if(microscope.isInorganic(sample)) {  // ���� ���ϱ�
		if(microscope.isOrganic(sample)) {
			return analyzeOrganic(sample);
		} else {
			return Result.INORGANIC;
		}
	}
	
	private Result analyzeOrganic(Sample sample) {
//		if(microscope.isHumanoid(sample) == false) { // Not good code!
//		if(!microscope.isHumanoid(sample)) {         // ���� ���ϱ�
		if(microscope.isHumanoid(sample)) {
			return Result.HUMANOID;
		} else {
			return Result.ALIEN;
		}
	}
}
