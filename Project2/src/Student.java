
public class Student implements Comparable<Student>
{
	private int id;
	private String name;
	private String surname;
	
	public Student(int id, String name, String surname)
	{
		this.setId(id);
		this.setName(name);
		this.setSurname(surname);
	}

	

	@Override
	public int compareTo(Student s)
	{
		
		//if we make name a comparator field than we will sort based on name.
	
		int comparedId = ((Student) s).getId();
		
		return this.id - comparedId;
	}
	boolean checkAscending(Student s)
	{
			return (compareTo(s) <= 0);	
	}
	
	boolean checkDesc(Student s)
	{
			return (compareTo(s) > 0);	
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
