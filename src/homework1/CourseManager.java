package homework1;

public class CourseManager {

	public void clickTheCourseImage(Course course) {
		System.out.println(course.name + " adl� kursa giri� yap�ld�.");
	}
	
	
	//Burda birden fazla e�itmen olabilece�ini d���nd�m, �rne�in Java kursunu baska bir e�itmen verebilirdi.
	public void selectInstructer(Course course) {
		System.out.println("E�itmeniniz " + course.instructer);
	}
}
