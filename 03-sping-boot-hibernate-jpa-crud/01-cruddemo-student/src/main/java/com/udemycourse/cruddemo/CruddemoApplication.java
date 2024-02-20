package com.udemycourse.cruddemo;

// import java.beans.BeanProperty;
// import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
// import org.springframework.context.annotation.Bean;
// import com.udemycourse.cruddemo.dao.StudentDAO;
// import com.udemycourse.cruddemo.entity.Student;

@SpringBootApplication
public class CruddemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CruddemoApplication.class, args);
	}
 

	// @Bean
	// public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		
	// 	return runner -> {
	// 		//createStudent(studentDAO);
	// 		//createMultipleStudents(studentDAO);
	// 		//readStudent(studentDAO);
	// 		findStudent(studentDAO);
	// 	};
	// }

	// private void findStudent(StudentDAO studentDAO){

	// 	//delete by id
	// 	// studentDAO.delete(5);

	// 	//find stident by first name
	// 	// Student myStudent = studentDAO.findByName("Paul");
	// 	// System.out.println("Found the student : " + myStudent);

	// 	Student myStudent = studentDAO.updateFirstName(1 , "Pali");
	// 	System.out.println("Updated the student name : " + myStudent);

	// 	//display list of students
	// 	System.out.println("List of students is : ");
	// 	for (Student s : studentDAO.findAll()) {
	// 		System.out.println("Student " + s.getId() +" = " + s.getFirstName() + " " + s.getLastName());
	// 	}
	
	// }

	// private void readStudent(StudentDAO studentDAO) {
		
	// 	//create a student object 
	// 	System.out.println("Creating new student object ...");
	// 	Student tempStudent = new Student("Daffy" , "Duck" , "daffy@gmail.com");

	// 	//save the student
	// 	System.out.println("Saving the student . . . ");
	// 	studentDAO.save(tempStudent);

	// 	//display id of the student
	// 	int theId = tempStudent.getId();
	// 	System.out.println("Saved student . Genrated id : " + theId);

	// 	//retrieve srudent on id : primary key 
	// 	System.out.println("Retrieving student with id : " + theId);
	// 	Student myStudent = studentDAO.findById(theId);
		
	// 	//display the student
	// 	System.out.println("Found the student : " + myStudent);

	// }

	// private void createMultipleStudents(StudentDAO studentDAO) {

	// 	//create multiple students
	// 	System.out.println("Creating  3 student object . . . ");
	// 	Student tempStudent1 = new Student("Paul" , "Doe" , "pauldoe@gmail.com");
	// 	Student tempStudent2 = new Student("Mary" , "Public" , "marry@gmail.com");
	// 	Student tempStudent3 = new Student("Bonita" , "Applebum" , "bonita@gmail.com");

	// 	//save the student objects
	// 	System.out.println("Saving the students . . . ");
	// 	studentDAO.save(tempStudent1);
	// 	studentDAO.save(tempStudent2);
	// 	studentDAO.save(tempStudent3);
	// }

	// private void createStudent(StudentDAO studentDAO) {

	// 	//create the student object 
	// 	System.out.println("Creating new student object . . . ");
	// 	Student tempStudent = new Student("John" , "Doe" , "johndoe@gmail.com");

	// 	//save the student object 
	// 	System.out.println("Saving the student . . . ");
	// 	studentDAO.save(tempStudent);

	// 	//display the id of saved student
	// 	System.out.println("Saved student. Generated id : " + tempStudent.getId());
	// }


}
