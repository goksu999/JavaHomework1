package homework1;

public class CourseManager {

	public void clickTheCourseImage(Course course) {
		System.out.println(course.name + " adlý kursa giriþ yapýldý.");
	}
	
	
	//Burda birden fazla eðitmen olabileceðini düþündüm, örneðin Java kursunu baska bir eðitmen verebilirdi.
	public void selectInstructer(Course course) {
		System.out.println("Eðitmeniniz " + course.instructer);
	}
}
