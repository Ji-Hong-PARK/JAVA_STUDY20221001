package Ch36ClassDiagram;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person{
	


	private Long studentId;
	private String major;
	private List<Lecture> subjectList;
	
	public Student
	(
			String name, 
			int age, 
			String address,
			Long Id,
			String major
	) 
	{
		super(name, age, address);	
		this.studentId=Id;
		this.major=major;
		this.subjectList=new ArrayList();
	} 

	public void study() {}
	
	public void addSubject(Lecture lec) {
		subjectList.add(lec);	//subjectList Lecture 추가	
		lec.addStudent(this);	//Lecture에 student 추가
		
	}

	@Override
	public String toString() {
		return "[studentId=" + studentId + "]";
	}



	

	
	
	
	
	
	
}
