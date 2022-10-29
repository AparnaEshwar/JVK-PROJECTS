package ClassAndObjects;

public class WithoutStaticMethod {
	String name;
	int age;
	int clas;
	String Section;

	public WithoutStaticMethod() {
		super();
		System.out.println(" ");
	}

	/**
	 * @param name
	 * @param age
	 * @param clas
	 * @param section
	 */
	public WithoutStaticMethod(String name, int age, int clas, String section) {
		super();
		this.name = name;
		this.age = age;
		this.clas = clas;
		Section = section;
	}

	public static void main(String[] args) {
		WithoutStaticMethod ws1 = new WithoutStaticMethod();
		System.out.println(ws1.name);
		WithoutStaticMethod ws2 = new WithoutStaticMethod("Swastik", 8, 3, "B");
		System.out.print(ws2.name + " " + ws2.age + " " + ws2.clas + " " + ws2.Section);

	}

}
