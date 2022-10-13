import java.io.*;


public class Assignment7{
	public static void main() {
	
	// creates a professor instance when professor is logged in
	Profressor prof = new ProfessorImplementation();
	
	prof.CreateSyllabus();
	// Once professor performs create syllabus related syllabus object is created by builder
	
	SyllabusObjectGenerator syllObj = new SCAISyllabus();
	
	// this will build the syllabus object with SCAI school template
	
	// once the object is filled with all the data adapter will convert this object into pdf and LMS API call
	
	Adapter syll = new Adapter();
	
	//Syllabus to APi converts the object to pdf and forms an API request
	
	API api = syll.SyllabusToAPI(syllObj);
	
	
	ExternalCaller ext = new ExternalCaller();
	
	// The external caller makes the call to LMS with the api

	ext.CallToCanvas(api);
	
	
	
	
	

	}
}