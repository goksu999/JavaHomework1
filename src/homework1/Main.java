package homework1;

public class Main {

	public static void main(String[] args) {
		
		
		//Bu kodu yazdýktan sonra asagýdaki deðerleri almak için Course Class'ýnda Ctor olusturduk.
			
		System.out.println(" ");
		System.out.println(" ");
		Course course1 = new Course(1, "Yazýlým Geliþtirici Yetiþtirme Kampý (C# + ANGULAR)", "Engin Demiroð", "C# + ANGULAR resmi");
		Course course2 = new Course(2, "Yazýlým Geliþtirici Yetiþtirme Kampý (JAVA + REACT)", "Ali Veli", "JAVA + REACT resmi");
		
		Course[] courses = {course1, course2};
		for (Course course:courses) {
			System.out.println(course.name);
		}
		
		System.out.println(" ");
		System.out.println("****************************************************");
		System.out.println(" ");
		
		//Kategoriler olusturuldu ve içerisinde yapýcý bloklarýn calýstýgý gösterildi.
		Category category1 = new Category();
		category1.name = "Kurslarým";
		
		Category category2 = new Category();
		category2.name = "Tüm Kurslar";
		
		Category category3 = new Category();
		category3.name = "Kampa Hazýrlýk";
		
		
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
