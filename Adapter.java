public class Adapter extends ExternalCaller implements SyllabusPublisher {

	public boolean GenerateSyllabus(SyllabusObjectGenerator syllabusObj) {
		return false;
	}

	public API SyllabusToAPI(SyllabusObjectGenerator syllabusObj) {
		return null;
	}

}
