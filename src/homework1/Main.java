package homework1;

public class Main {

	public static void main(String[] args) {
		
		
		//Bu kodu yazd�ktan sonra asag�daki de�erleri almak i�in Course Class'�nda Ctor olusturduk.
			
		System.out.println(" ");
		System.out.println(" ");
		Course course1 = new Course(1, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (C# + ANGULAR)", "Engin Demiro�", "C# + ANGULAR resmi");
		Course course2 = new Course(2, "Yaz�l�m Geli�tirici Yeti�tirme Kamp� (JAVA + REACT)", "Ali Veli", "JAVA + REACT resmi");
		
		Course[] courses = {course1, course2};
		for (Course course:courses) {
			System.out.println(course.name);
		}
		
		System.out.println(" ");
		System.out.println("****************************************************");
		System.out.println(" ");
		
		//Kategoriler olusturuldu ve i�erisinde yap�c� bloklar�n cal�st�g� g�sterildi.
		Category category1 = new Category();
		category1.name = "Kurslar�m";
		
		Category category2 = new Category();
		category2.name = "T�m Kurslar";
		
		Category category3 = new Category();
		category3.name = "Kampa Haz�rl�k";
		
		
		CourseManager courseManager = new CourseManager();
		courseManager.clickTheCourseImage(course1);
		courseManager.clickTheCourseImage(course2);
		
		System.out.println(" ");
		System.out.println("****************************************************");
		System.out.println(" ");
		
		courseManager.selectInstructer(course1);
		courseManager.selectInstructer(course2);

	}

}
