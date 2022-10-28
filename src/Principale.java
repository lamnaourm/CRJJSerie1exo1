
public class Principale {

	public static void main(String[] args) {
		
		Person p = new Person();
		p.sayHello();
		
		Student s = new Student();
		s.setAge(15);
		s.DisplayAge();
		s.GoToClasses();
		
		Teacher t = new Teacher();
		t.setAge(40);
		t.sayHello();
	}

}
