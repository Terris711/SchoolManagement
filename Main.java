package Day6;

import java.security.Identity;

import Day5.Result;
import Day5.TimeTable;

public class Main {
	public static void main(String[] args) {
		// Define classes
		Class class1 = new Class(1, "Back-end");
		Class class2 = new Class(2, "Front-end");

		// Define rooms
		Room room1 = new Room(1, "420.1");
		Room room2 = new Room(1, "420.2");

		// Define salary rate
		Salary level1 = new Salary(45.13);
		Salary level2 = new Salary(35.27);

		// Define attendant
		Attendant attendant = new Attendant(1, 20);
		Attendant leave = new Attendant(2, 7);

		// Define exams
		Exam practical = new Exam(1, "Practicals", 10);
		Exam Assignment1 = new Exam(2, "Assignment1", 15);
		Exam Assignment2 = new Exam(3, "Assignment2", 35);
		Exam Final = new Exam(4, "Final", 40);

		// Define semester
		Semester sem1 = new Semester(1, 1);
		Semester sem2 = new Semester(2, 2);

		// Define subjects
		Subject math = new Subject(1, "Math");
		Subject english = new Subject(2, "English");
		Subject chemistry = new Subject(3, "Chemistry");

		// Define result exammple
		// Semester 1
		Result mathResult1 = new Result(1, 90);
		mathResult1.setSubjectID(math.getId());
		mathResult1.setSemesterID(sem1.getId());
		Result engResult1 = new Result(2, 87);
		engResult1.setSubjectID(english.getId());
		engResult1.setSemesterID(sem1.getId());
		Result chemResult1 = new Result(3, 34);
		chemResult1.setSubjectID(chemistry.getId());
		chemResult1.setSemesterID(sem1.getId());

		// Semester 2
		Result mathResult2 = new Result(4, 91);
		mathResult2.setSubjectID(math.getId());
		mathResult2.setSemesterID(sem2.getId());
		Result engResult2 = new Result(5, 73);
		engResult2.setSubjectID(english.getId());
		engResult2.setSemesterID(sem2.getId());
		Result chemResult2 = new Result(6, 44);
		chemResult2.setSubjectID(chemistry.getId());
		chemResult2.setSemesterID(sem2.getId());

		// Define students
		Student student1 = new Student(1, "abc@gmai.com", "Anna");
//		Student student2 = new Student(2, "def@gmai.com", "Beroca");
//		Student student3 = new Student(3, "hua@gmai.com", "Tracy");

		// Define teachers
		Teacher teacher1 = new Teacher(1, "lisa@gmail.com", "Mrs Dung");
		Teacher teacher2 = new Teacher(2, "leon@gmail.com", "Alexa");

		// ----------------- CUSTOM ---------------------
		// Assign class for student
		student1.setClassID(class1.getId());
//		student2.setId(class1.getId());
//		student3.setId(class2.getId());

		// Assign room for class
		class1.setRoomID(room1.getId());
//		class2.setRoomID(room2.getId());
		// Assign which primary teacher for a class
		class1.setTeacherID(teacher1.getId());
//		class2.setTeacherID(teacher2.getId());
		// Assign teacher and class for subjects
		math.setTeacherID(teacher1.getId());
		english.setTeacherID(teacher2.getId());
		chemistry.setTeacherID(teacher1.getId());

		// Summarize
		Class[] classes = { class1, class2 };
		Room[] rooms = { room1, room2 };
		Salary[] salaries = { level1, level2 };
		Attendant[] attendants = { attendant };
		Attendant[] leaves = { leave };
		Exam[] exams = { practical, Assignment1, Assignment2, Final };
		Semester[] sems = { sem1, sem2 };
		Student[] students = { student1 };
		Teacher[] teachers = { teacher1, teacher2 };
		Subject[] subjects = { math, english, chemistry };
		Result[] results = { mathResult1, engResult1, chemResult1, mathResult2, engResult2, chemResult2 };

		// Display POINTSHEET
		displayPointSheet("Anna", students, classes, teachers, subjects, results);
	}

	public static void displayPointSheet(String studentName, Student[] students, Class[] classes, Teacher[] teachers,
			Subject[] subjects, Result[] results) {
		System.out.println("-------------------POINT SHEET---------------");
		getStudentName(studentName, students);
		System.out.println("School Year: 2022-2023");
		getClassName(studentName, students, classes);
		getTeacherName(studentName, students, classes, teachers);
		System.out.println("--------------------------------------------");
		System.out.println("Semester 1: ");
		System.out.println("Math: " + getScore(1, 1, studentName, students, classes, subjects, results)); // Math
		System.out.println("EngLish: " + getScore(1, 2, studentName, students, classes, subjects, results)); // English
		System.out.println("Chemistry: " + getScore(1, 3, studentName, students, classes, subjects, results)); // Chemistry
		System.out.println("--------------------------------------------");
		System.out.println("Semester 2: ");
		System.out.println("Math: " + getScore(2, 1, studentName, students, classes, subjects, results)); // Math
		System.out.println("EngLish: " + getScore(2, 2, studentName, students, classes, subjects, results)); // English
		System.out.println("Chemistry: " + getScore(2, 3, studentName, students, classes, subjects, results)); // Chemistry
		System.out.println("--------------------------------------------");
		System.out.println("GPA: " + getGPA(studentName, students, classes, subjects, results));
		displayGrade(studentName, students, classes, subjects, results);
	}

	public static int getStudentIDFromStudentClass(String studentName, Student[] students) {
		for (Student student : students) {
			if (student.getFullName().equals(studentName)) {
				return student.getId();
			}
		}
		return 0;
	}

	public static void getStudentName(String studentName, Student[] students) {
		int id = getStudentIDFromStudentClass(studentName, students);
		for (Student student : students) {
			if (id == student.getId()) {
				System.out.println("Student Name: " + student.getFullName());
			}
		}
	}

	public static int getClassIDFromStudent(String studentName, Student[] students) {
		for (Student student : students) {
			if (student.getFullName().equals(studentName)) {
				return student.getClassID();
			}
		}
		return 0;
	}

	public static int getTeacherIDFromClass(String studentName, Student[] students, Class[] classes) {
		int classid = getClassIDFromStudent(studentName, students);
		for (Class classx : classes) {
			if (classid == classx.getId()) {
				return classx.getTeacherID();
			}
		}
		return 0;
	}

	public static void getClassName(String studentName, Student[] students, Class[] classes) {
		int classid = getClassIDFromStudent(studentName, students);
		for (Class classx : classes) {
			if (classid == classx.getId()) {
				System.out.println("Class Name: " + classx.getName());
			}
		}
	}

	public static void getTeacherName(String studentName, Student[] students, Class[] classes, Teacher[] teachers) {
		int teacherid = getTeacherIDFromClass(studentName, students, classes);

		for (Teacher teacher : teachers) {
			if (teacherid == teacher.getId()) {
				System.out.println("Primary teacher: " + teacher.getFullName());
			}
		}
	}

	public static String getName(int subjectid, Subject[] subjects) {
		String subName = "a";
		for (Subject subject : subjects) {
			if (subjectid == subject.getId()) {
				return subName = subject.getName();
			}
		}
		return subName;
	}

	public static double getScore(int semNum, int subjectid, String studentName, Student[] students, Class[] classes,
			Subject[] subjects, Result[] results) {
		String subName = getName(subjectid, subjects);
		for (Result result : results) {
			if (subjectid == result.getSubjectID() && semNum == result.getSemesterID()) {
				return result.getScore();
			}
		}
		return 0;
	}

	public static double getGPA(String studentName, Student[] students, Class[] classes, Subject[] subjects, Result[] results) {
		double gpaMath = (getScore(1, 1, studentName, students, classes, subjects, results)
				+ getScore(2, 1, studentName, students, classes, subjects, results) * 2) / 3;
		double gpaEng = (getScore(1, 2, studentName, students, classes, subjects, results)
				+ getScore(2, 2, studentName, students, classes, subjects, results) * 2) / 3;
		double gpaChem = (getScore(1, 3, studentName, students, classes, subjects, results)
				+ getScore(2, 3, studentName, students, classes, subjects, results) * 2) / 3;
		double gpa = Math.round(((gpaMath + gpaChem + gpaEng) / 3)*100)/100;
		return gpa;
	}
	
	public static void displayGrade(String studentName, Student[] students, Class[] classes, Subject[] subjects, Result[] results) {
		double GPA = getGPA(studentName, students, classes, subjects, results);
		char grade = rank(GPA);
		printGrade(grade);
		
	}
	
	public static char rank(double GPA) {
		char Grade;

		if (GPA < 50.0) {
			Grade = 'F';
		} else if (GPA >= 50.0 && GPA < 60.0) {
			Grade = 'D';
		} else if (GPA >= 60.0 && GPA < 70.0) {
			Grade = 'C';
		} else if (GPA >= 70.0 && GPA < 80.0) {
			Grade = 'B';
		} else if (GPA >= 80.0 && GPA < 90.0) {
			Grade = 'A';
		} else {
			Grade = 'S';
		}

		return Grade;
	}

	public static void printGrade(char Grade) {
		switch (Grade) {
		case 'S':
			System.out.println("Grade S. Excellent Student!");
			break;
		case 'A':
			System.out.println("Grade A. Good Student!");
			break;
		case 'B':
			System.out.println("Grade B. Normal Student!");
			break;
		case 'C':
			System.out.println("Grade C. Average Student!");
			break;
		case 'D':
			System.out.println("Grade D. Not bad Student!");
			break;
		case 'F':
			System.out.println("Grade F. Fail Student!");
			break;
		default:
			System.out.println("Legend");
			break;
		}
	}
	
	
	

}
