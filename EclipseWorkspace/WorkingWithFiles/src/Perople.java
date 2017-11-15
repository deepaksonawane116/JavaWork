
public class Perople {
	private String name;
	private int age;
	private String jobTitle;
	
	public Perople(String name, int age, String jobTitle)
	{
		this.name = name;
		this.age = age;
		this.jobTitle = jobTitle;
	}

	
	public String toString()
	{
		String newString = null;
		
		newString = "Name: " + name + ". Age: " + age + ". Title: " + jobTitle + ".";
		
		return newString;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public void setAge(int newAge) {
		this.age = newAge;
	}
	
	public String getJobTitle() {
		return this.jobTitle;
	}
	
	public void setJobTitle(String newJobTitle) {
		this.jobTitle = newJobTitle;
	}
}
