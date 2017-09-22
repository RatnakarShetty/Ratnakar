
class Student implements Comparable {

	Integer id;
	String name;
	Double cgpa; // In Double , compareTo(Comparable interface) and compare(Comparator interface)
					// methods are overridden

	Student(Integer id, String name, double cgpa) {
		this.id = id;
		this.name = name;
		this.cgpa = cgpa;
	}

	public String toString() {
		return "\n " + id + "\t" + name + "\t" + cgpa;
	}

	public int compareTo(Object obj) {
		return this.id.compareTo(((Student) obj).id);
	}
}

public class SortDemo1 {

	public static void main(String[] args) {
		
		

		Student[] students = { new Student(new Integer("A100"),"Mahesh", 7.6)};

		System.out.println("Before sorting");
		for (Student s : students)
			System.out.println(s);

	}

}
