package updatedNewSchool;

import java.text.DecimalFormat;

public class Main {

	public static void main(String[] args) {

//Room:
		Room[] roomList = new Room[3];
		roomList[0] = new Room(1, "Room A", "Location A");
		roomList[1] = new Room(2, "Room B", "Location B");
		roomList[2] = new Room(3, "Room C", "Location C");
//Year:
		Year[] yearList = new Year[2];
		yearList[0] = new Year(2022);
		yearList[1] = new Year(2023);
//Semester:
		Semester[] semesterList = new Semester[2];
		semesterList[0] = new Semester(1, "Semester 1");
		semesterList[1] = new Semester(2, "Semester 2");
//Teacher:
		Teacher[] teacherList = new Teacher[3];
		teacherList[0] = new Teacher(1, "Teacher A");
		teacherList[1] = new Teacher(2, "Teacher B");
		teacherList[2] = new Teacher(3, "Teacher C");
//Subject:
		Subject[] subjectList = new Subject[3];
		subjectList[0] = new Subject(1, "Maths");
		subjectList[1] = new Subject(2, "Physi");
		subjectList[2] = new Subject(3, "Chemi");
//Exam:
		Exam[] examList = new Exam[6];
		examList[0] = new Exam(1, "15min");
		examList[1] = new Exam(1, "15min no.1");
		examList[2] = new Exam(1, "15min no.2");
		examList[3] = new Exam(1, "45min");
		examList[4] = new Exam(1, "middle");
		examList[5] = new Exam(1, "final");
//Class:
		Class[] classList = new Class[6];
		classList[0] = new Class(1, "Class A", roomList[0], teacherList[0], yearList[0]);
		classList[1] = new Class(2, "Class B", roomList[1], teacherList[1], yearList[0]);
		classList[2] = new Class(3, "Class C", roomList[2], teacherList[2], yearList[0]);

		classList[3] = new Class(4, "Class A+", roomList[2], teacherList[2], yearList[1]);
		classList[4] = new Class(5, "Class B+", roomList[0], teacherList[0], yearList[1]);
		classList[5] = new Class(6, "Class C+", roomList[1], teacherList[1], yearList[1]);
//Student:
		Student[] studentList = new Student[6];
		studentList[0] = new Student(1, 1, "Student A", classList[0]);
		studentList[1] = new Student(2, 2, "Student B", classList[1]);
		studentList[2] = new Student(3, 3, "Student c", classList[2]);

		studentList[3] = new Student(4, 1, "Student A", classList[3]);
		studentList[4] = new Student(5, 2, "Student B", classList[4]);
		studentList[5] = new Student(6, 3, "Student c", classList[5]);

//TeacherSubject:
		TeacherSubject[] teacherSubjectList = new TeacherSubject[3];
		teacherSubjectList[0] = new TeacherSubject(teacherList[0], subjectList[0]);
		teacherSubjectList[1] = new TeacherSubject(teacherList[1], subjectList[1]);
		teacherSubjectList[2] = new TeacherSubject(teacherList[1], subjectList[2]);
//Timesheet:
		Timesheet[] timesheetList = new Timesheet[3];
		timesheetList[0] = new Timesheet(1, teacherList[0], 22, 12, 2022, true);
		timesheetList[1] = new Timesheet(2, teacherList[1], 22, 12, 2022, false);
		timesheetList[2] = new Timesheet(3, teacherList[0], 23, 12, 2022, true);

//ExamSemesterSubject:
		ExamSemesterSubject[] examSemesterSubjectList = new ExamSemesterSubject[53];

		// year1,semester1
		examSemesterSubjectList[0] = new ExamSemesterSubject(1, examList[0], subjectList[0], semesterList[0],
				yearList[0], 1, 1, 2);
		examSemesterSubjectList[1] = new ExamSemesterSubject(2, examList[3], subjectList[0], semesterList[0],
				yearList[0], 2, 1, 2);
		examSemesterSubjectList[2] = new ExamSemesterSubject(3, examList[4], subjectList[0], semesterList[0],
				yearList[0], 3, 1, 2);
		examSemesterSubjectList[3] = new ExamSemesterSubject(4, examList[5], subjectList[0], semesterList[0],
				yearList[0], 5, 1, 2);

		examSemesterSubjectList[4] = new ExamSemesterSubject(5, examList[1], subjectList[1], semesterList[0],
				yearList[0], 1, 1, 1);
		examSemesterSubjectList[5] = new ExamSemesterSubject(6, examList[2], subjectList[1], semesterList[0],
				yearList[0], 1, 1, 1);
		examSemesterSubjectList[6] = new ExamSemesterSubject(7, examList[3], subjectList[1], semesterList[0],
				yearList[0], 1.5, 1, 1);
		examSemesterSubjectList[7] = new ExamSemesterSubject(8, examList[4], subjectList[1], semesterList[0],
				yearList[0], 2, 1, 1);
		examSemesterSubjectList[8] = new ExamSemesterSubject(9, examList[5], subjectList[1], semesterList[0],
				yearList[0], 3, 1, 1);

		examSemesterSubjectList[9] = new ExamSemesterSubject(10, examList[1], subjectList[2], semesterList[0],
				yearList[0], 1, 1, 1);
		examSemesterSubjectList[10] = new ExamSemesterSubject(11, examList[2], subjectList[2], semesterList[0],
				yearList[0], 1, 1, 1);
		examSemesterSubjectList[11] = new ExamSemesterSubject(12, examList[3], subjectList[2], semesterList[0],
				yearList[0], 1.5, 1, 1);
		examSemesterSubjectList[12] = new ExamSemesterSubject(13, examList[4], subjectList[2], semesterList[0],
				yearList[0], 2, 1, 1);
		examSemesterSubjectList[13] = new ExamSemesterSubject(14, examList[5], subjectList[2], semesterList[0],
				yearList[0], 3, 1, 1);

		// year1,semester2
		examSemesterSubjectList[14] = new ExamSemesterSubject(15, examList[0], subjectList[0], semesterList[1],
				yearList[0], 1, 2, 2);
		examSemesterSubjectList[15] = new ExamSemesterSubject(16, examList[3], subjectList[0], semesterList[1],
				yearList[0], 1.5, 2, 2);
		examSemesterSubjectList[16] = new ExamSemesterSubject(17, examList[4], subjectList[0], semesterList[1],
				yearList[0], 2, 2, 2);
		examSemesterSubjectList[17] = new ExamSemesterSubject(18, examList[5], subjectList[0], semesterList[1],
				yearList[0], 3, 2, 2);

		examSemesterSubjectList[18] = new ExamSemesterSubject(19, examList[1], subjectList[1], semesterList[1],
				yearList[0], 1, 2, 1);
		examSemesterSubjectList[19] = new ExamSemesterSubject(20, examList[2], subjectList[1], semesterList[1],
				yearList[0], 1, 2, 1);
		examSemesterSubjectList[20] = new ExamSemesterSubject(21, examList[3], subjectList[1], semesterList[1],
				yearList[0], 1.5, 2, 1);
		examSemesterSubjectList[21] = new ExamSemesterSubject(22, examList[4], subjectList[1], semesterList[1],
				yearList[0], 2, 2, 1);
		examSemesterSubjectList[22] = new ExamSemesterSubject(23, examList[5], subjectList[1], semesterList[1],
				yearList[0], 3, 2, 1);

		examSemesterSubjectList[23] = new ExamSemesterSubject(24, examList[1], subjectList[2], semesterList[1],
				yearList[0], 1, 2, 1);
		examSemesterSubjectList[24] = new ExamSemesterSubject(25, examList[2], subjectList[2], semesterList[1],
				yearList[0], 1, 2, 1);
		examSemesterSubjectList[25] = new ExamSemesterSubject(26, examList[3], subjectList[2], semesterList[1],
				yearList[0], 1.5, 2, 1);
		examSemesterSubjectList[26] = new ExamSemesterSubject(27, examList[4], subjectList[2], semesterList[1],
				yearList[0], 2, 2, 1);
		examSemesterSubjectList[27] = new ExamSemesterSubject(28, examList[5], subjectList[2], semesterList[1],
				yearList[0], 3, 2, 1);

		// year2,semester1
		examSemesterSubjectList[28] = new ExamSemesterSubject(29, examList[0], subjectList[0], semesterList[0],
				yearList[1], 1, 1, 2);
		examSemesterSubjectList[29] = new ExamSemesterSubject(30, examList[3], subjectList[0], semesterList[0],
				yearList[1], 1, 1, 2);
		examSemesterSubjectList[30] = new ExamSemesterSubject(31, examList[4], subjectList[0], semesterList[0],
				yearList[1], 3, 1, 2);
		examSemesterSubjectList[31] = new ExamSemesterSubject(32, examList[5], subjectList[0], semesterList[0],
				yearList[1], 5, 1, 2);

		examSemesterSubjectList[32] = new ExamSemesterSubject(33, examList[0], subjectList[1], semesterList[0],
				yearList[1], 1, 1, 1.5);
		examSemesterSubjectList[33] = new ExamSemesterSubject(34, examList[3], subjectList[1], semesterList[0],
				yearList[1], 1, 1, 1.5);
		examSemesterSubjectList[34] = new ExamSemesterSubject(35, examList[4], subjectList[1], semesterList[0],
				yearList[1], 2, 1, 1.5);
		examSemesterSubjectList[35] = new ExamSemesterSubject(36, examList[5], subjectList[1], semesterList[0],
				yearList[1], 3, 1, 1.5);

		examSemesterSubjectList[36] = new ExamSemesterSubject(37, examList[1], subjectList[2], semesterList[0],
				yearList[1], 1, 1, 1);
		examSemesterSubjectList[37] = new ExamSemesterSubject(38, examList[2], subjectList[2], semesterList[0],
				yearList[1], 1, 1, 1);
		examSemesterSubjectList[38] = new ExamSemesterSubject(39, examList[3], subjectList[2], semesterList[0],
				yearList[1], 1.5, 1, 1);
		examSemesterSubjectList[39] = new ExamSemesterSubject(40, examList[4], subjectList[2], semesterList[0],
				yearList[1], 2, 1, 1);
		examSemesterSubjectList[40] = new ExamSemesterSubject(41, examList[5], subjectList[2], semesterList[0],
				yearList[1], 3, 1, 1);

		// year2,semester2
		examSemesterSubjectList[41] = new ExamSemesterSubject(42, examList[0], subjectList[0], semesterList[1],
				yearList[1], 1, 3, 2);
		examSemesterSubjectList[42] = new ExamSemesterSubject(43, examList[3], subjectList[0], semesterList[1],
				yearList[1], 1, 3, 2);
		examSemesterSubjectList[43] = new ExamSemesterSubject(44, examList[4], subjectList[0], semesterList[1],
				yearList[1], 2, 3, 2);
		examSemesterSubjectList[44] = new ExamSemesterSubject(45, examList[5], subjectList[0], semesterList[1],
				yearList[1], 3, 3, 2);

		examSemesterSubjectList[45] = new ExamSemesterSubject(46, examList[0], subjectList[1], semesterList[1],
				yearList[1], 1, 3, 1.5);
		examSemesterSubjectList[46] = new ExamSemesterSubject(47, examList[3], subjectList[1], semesterList[1],
				yearList[1], 1, 3, 1.5);
		examSemesterSubjectList[47] = new ExamSemesterSubject(48, examList[4], subjectList[1], semesterList[1],
				yearList[1], 2, 3, 1.5);
		examSemesterSubjectList[48] = new ExamSemesterSubject(49, examList[5], subjectList[1], semesterList[1],
				yearList[1], 3, 3, 1.5);

		examSemesterSubjectList[49] = new ExamSemesterSubject(50, examList[0], subjectList[2], semesterList[1],
				yearList[1], 1, 3, 1);
		examSemesterSubjectList[50] = new ExamSemesterSubject(51, examList[3], subjectList[2], semesterList[1],
				yearList[1], 1, 3, 1);
		examSemesterSubjectList[51] = new ExamSemesterSubject(52, examList[4], subjectList[2], semesterList[1],
				yearList[1], 2, 3, 1);
		examSemesterSubjectList[52] = new ExamSemesterSubject(53, examList[5], subjectList[2], semesterList[1],
				yearList[1], 3, 3, 1);

//Pointsheet:
		Pointsheet[] pointsheetList = new Pointsheet[53];

		// year1,semester1
		pointsheetList[0] = new Pointsheet(1, studentList[0], examSemesterSubjectList[0], 0.5);
		pointsheetList[1] = new Pointsheet(2, studentList[0], examSemesterSubjectList[1], 0);
		pointsheetList[2] = new Pointsheet(3, studentList[0], examSemesterSubjectList[2], 9);
		pointsheetList[3] = new Pointsheet(4, studentList[0], examSemesterSubjectList[3], 0);

		pointsheetList[4] = new Pointsheet(5, studentList[0], examSemesterSubjectList[4], 7);
		pointsheetList[5] = new Pointsheet(6, studentList[0], examSemesterSubjectList[5], 8);
		pointsheetList[6] = new Pointsheet(7, studentList[0], examSemesterSubjectList[6], 9);
		pointsheetList[7] = new Pointsheet(8, studentList[0], examSemesterSubjectList[7], 7);
		pointsheetList[8] = new Pointsheet(9, studentList[0], examSemesterSubjectList[8], 6);

		pointsheetList[9] = new Pointsheet(10, studentList[0], examSemesterSubjectList[9], 7);
		pointsheetList[10] = new Pointsheet(11, studentList[0], examSemesterSubjectList[10], 8);
		pointsheetList[11] = new Pointsheet(12, studentList[0], examSemesterSubjectList[11], 9);
		pointsheetList[12] = new Pointsheet(13, studentList[0], examSemesterSubjectList[12], 10);
		pointsheetList[13] = new Pointsheet(14, studentList[0], examSemesterSubjectList[13], 10);

		// year1,semester2

		pointsheetList[14] = new Pointsheet(15, studentList[0], examSemesterSubjectList[14], 7);
		pointsheetList[15] = new Pointsheet(16, studentList[0], examSemesterSubjectList[15], 6);
		pointsheetList[16] = new Pointsheet(17, studentList[0], examSemesterSubjectList[16], 8);
		pointsheetList[17] = new Pointsheet(18, studentList[0], examSemesterSubjectList[17], 0);

		pointsheetList[18] = new Pointsheet(19, studentList[0], examSemesterSubjectList[18], 8);
		pointsheetList[19] = new Pointsheet(20, studentList[0], examSemesterSubjectList[19], 9);
		pointsheetList[20] = new Pointsheet(21, studentList[0], examSemesterSubjectList[20], 10);
		pointsheetList[21] = new Pointsheet(22, studentList[0], examSemesterSubjectList[21], 5);
		pointsheetList[22] = new Pointsheet(23, studentList[0], examSemesterSubjectList[22], 8);

		pointsheetList[23] = new Pointsheet(24, studentList[0], examSemesterSubjectList[23], 9);
		pointsheetList[24] = new Pointsheet(25, studentList[0], examSemesterSubjectList[24], 6);
		pointsheetList[25] = new Pointsheet(26, studentList[0], examSemesterSubjectList[25], 8);
		pointsheetList[26] = new Pointsheet(27, studentList[0], examSemesterSubjectList[26], 8);
		pointsheetList[27] = new Pointsheet(28, studentList[0], examSemesterSubjectList[27], 7);

		// year2,semester1
		pointsheetList[28] = new Pointsheet(29, studentList[3], examSemesterSubjectList[28], 5);
		pointsheetList[29] = new Pointsheet(30, studentList[3], examSemesterSubjectList[29], 6);
		pointsheetList[30] = new Pointsheet(31, studentList[3], examSemesterSubjectList[30], 8);
		pointsheetList[31] = new Pointsheet(32, studentList[3], examSemesterSubjectList[31], 9);

		pointsheetList[32] = new Pointsheet(33, studentList[3], examSemesterSubjectList[32], 6);
		pointsheetList[33] = new Pointsheet(34, studentList[3], examSemesterSubjectList[33], 7);
		pointsheetList[34] = new Pointsheet(35, studentList[3], examSemesterSubjectList[34], 8);
		pointsheetList[35] = new Pointsheet(36, studentList[3], examSemesterSubjectList[35], 10);

		pointsheetList[36] = new Pointsheet(37, studentList[3], examSemesterSubjectList[36], 8);
		pointsheetList[37] = new Pointsheet(38, studentList[3], examSemesterSubjectList[37], 9);
		pointsheetList[38] = new Pointsheet(39, studentList[3], examSemesterSubjectList[38], 10);
		pointsheetList[39] = new Pointsheet(40, studentList[3], examSemesterSubjectList[39], 8);
		pointsheetList[40] = new Pointsheet(41, studentList[3], examSemesterSubjectList[40], 6);

		// year2,semester2

		pointsheetList[41] = new Pointsheet(42, studentList[3], examSemesterSubjectList[41], 7);
		pointsheetList[42] = new Pointsheet(43, studentList[3], examSemesterSubjectList[42], 8);
		pointsheetList[43] = new Pointsheet(44, studentList[3], examSemesterSubjectList[43], 10);
		pointsheetList[44] = new Pointsheet(45, studentList[3], examSemesterSubjectList[44], 9);

		pointsheetList[45] = new Pointsheet(46, studentList[3], examSemesterSubjectList[45], 7);
		pointsheetList[46] = new Pointsheet(47, studentList[3], examSemesterSubjectList[46], 10);
		pointsheetList[47] = new Pointsheet(48, studentList[3], examSemesterSubjectList[47], 8);
		pointsheetList[48] = new Pointsheet(49, studentList[3], examSemesterSubjectList[48], 9);

		pointsheetList[49] = new Pointsheet(50, studentList[3], examSemesterSubjectList[49], 7);
		pointsheetList[50] = new Pointsheet(51, studentList[3], examSemesterSubjectList[50], 10);
		pointsheetList[51] = new Pointsheet(52, studentList[3], examSemesterSubjectList[51], 9);
		pointsheetList[52] = new Pointsheet(53, studentList[3], examSemesterSubjectList[52], 9.5);

		int studentCode = 1;
		int startingYear = 2022;

		System.out.println("POINT SHEET");
		System.out.println("Student: " + studentName(studentCode, startingYear, studentList));
		System.out.println("School Year: " + startingYear + "-" + (startingYear + 1));
		System.out.println("Class: " + studentClass(studentCode, startingYear, studentList));
		System.out.println("Primary Teacher: " + studentTeacher(studentCode, startingYear, studentList));
		System.out.println(
				"|| Subject ||                               Semester 1                            ||     ||                                Semester 2                           ||     || Average     ||");
		System.out.println(
				"||---------||---------------------------------------------------------------------||     ||---------------------------------------------------------------------||     ||-------------||");
		System.out.println(
				"||         || 15'         | 15'         | 45'         | Mid         | Final       ||     || 15'         | 15'         | 45'         | Mid         | Final       ||     || Average     ||");

		DecimalFormat commaFormat;
		commaFormat = new DecimalFormat("00.00");
		for (String i : getSubjectArray(startingYear, pointsheetList, subjectList)) {
			printPointPerSubject(studentCode, startingYear, i, pointsheetList, subjectList, examList);
		}

		System.out.println(
				"========================================================================================================================================================================================");
		System.out.println("Average point: " + commaFormat
				.format(getAveragePointPerYear(studentCode, startingYear, examList, pointsheetList, subjectList)));

		if (isFailed(studentCode, startingYear, pointsheetList, subjectList, examList)) {
			System.out.println("Grade: Failed");
		} else {
			System.out.println("Grade: " + grade(getAveragePointPerYear(studentCode, startingYear, examList, pointsheetList, subjectList)));
		}

	}

	public static String grade(double point) {
		String grade = "";
		if (point < 5) {
			grade = "Failed";
		} else if (point < 6) {
			grade = "Not bad";
		} else if (point < 7) {
			grade = "Average";
		} else if (point < 8) {
			grade = "Normal";
		} else if (point < 9) {
			grade = "Good";
		} else {
			grade = "Excellent";
		}
		return grade;
	}

	public static boolean isFailed(int studentCode, int year, Pointsheet pointsheetList[], Subject subjectList[],
			Exam examList[]) {
		boolean isFailed = false;
		for (Pointsheet i : pointsheetList) {
			if (i.getStudent().getCode() == studentCode && i.getExamSemesterSubject().getYear().getYear() == year) {
				for (String subject : getSubjectArray(year, pointsheetList, subjectList)) {
					if (getAveragePointPerSubject(studentCode, year, subject, examList, pointsheetList) < 5) {
						isFailed = true;
					}
				}
			}
		}
		return isFailed;
	}

	public static void printPointPerSubject(int studentCode, int year, String subject, Pointsheet pointsheetList[],
			Subject subjectList[], Exam examList[]) {
		DecimalFormat commaFormat;
		commaFormat = new DecimalFormat("00.00");
		System.out.print("||  " + subject + "  ");
		printPointPerSemester(studentCode, year, subject, "Semester 1", pointsheetList, subjectList, examList);
		System.out.print("||" + commaFormat.format(getMultiPerSemester(year, "Semester 1", subject, pointsheetList)));
		printPointPerSemester(studentCode, year, subject, "Semester 2", pointsheetList, subjectList, examList);
		System.out.print("||" + commaFormat.format(getMultiPerSemester(year, "Semester 2", subject, pointsheetList)));
		System.out.println("||"
				+ commaFormat.format(getAveragePointPerSubject(studentCode, year, subject, examList,pointsheetList))
				+ " (" + commaFormat.format(getMultiPerSubject(year, subject, pointsheetList)) + ")" + "||");

	}

	public static void printPointPerSemester(int studentCode, int year, String subject, String semester,
			Pointsheet pointsheetList[], Subject subjectList[], Exam examList[]) {
		DecimalFormat commaFormat;
		commaFormat = new DecimalFormat("00.00");
		if (getExamArray(year, subject, semester, pointsheetList, examList).length == 4) {
			System.out.print("||"
					+ commaFormat.format(getPointPerExam(studentCode, year, subject, semester, "15min", pointsheetList))
					+ " ("
					+ commaFormat
							.format(getMultiPerExam(year, subject, semester, "15min", pointsheetList))
					+ ")" + "|             |"
					+ commaFormat.format(getPointPerExam(studentCode, year, subject, semester, "45min", pointsheetList))
					+ " ("
					+ commaFormat
							.format(getMultiPerExam(year, subject, semester, "45min", pointsheetList))
					+ ")" + "|"
					+ commaFormat
							.format(getPointPerExam(studentCode, year, subject, semester, "middle", pointsheetList))
					+ " ("
					+ commaFormat
							.format(getMultiPerExam(year, subject, semester, "middle", pointsheetList))
					+ ")" + "|"
					+ commaFormat.format(getPointPerExam(studentCode, year, subject, semester, "final", pointsheetList))
					+ " (" + commaFormat.format(
							getMultiPerExam(year, subject, semester, "final", pointsheetList))
					+ ")");
		} else if (getExamArray(year, subject, semester, pointsheetList, examList).length == 5) {
			System.out.print("||"
					+ commaFormat
							.format(getPointPerExam(studentCode, year, subject, semester, "15min no.1", pointsheetList))
					+ " ("
					+ commaFormat.format(
							getMultiPerExam(year, subject, semester, "15min no.1", pointsheetList))
					+ ")" + "|"
					+ commaFormat
							.format(getPointPerExam(studentCode, year, subject, semester, "15min no.2", pointsheetList))
					+ " ("
					+ commaFormat.format(
							getMultiPerExam(year, subject, semester, "15min no.2", pointsheetList))
					+ ")" + "|"
					+ commaFormat.format(getPointPerExam(studentCode, year, subject, semester, "45min", pointsheetList))
					+ " ("
					+ commaFormat
							.format(getMultiPerExam(year, subject, semester, "45min", pointsheetList))
					+ ")" + "|"
					+ commaFormat
							.format(getPointPerExam(studentCode, year, subject, semester, "middle", pointsheetList))
					+ " ("
					+ commaFormat
							.format(getMultiPerExam(year, subject, semester, "middle", pointsheetList))
					+ ")" + "|"
					+ commaFormat.format(getPointPerExam(studentCode, year, subject, semester, "final", pointsheetList))
					+ " (" + commaFormat.format(
							getMultiPerExam(year, subject, semester, "final", pointsheetList))
					+ ")");
		}
	}

	public static double getAveragePointPerYear(int studentCode, int year, Exam examList[], Pointsheet pointsheetList[], Subject subjectList[]) {
		double averagePoint = 0;
		double totalPoint = 0;
		double totalMulti = 0;

		for (Pointsheet i : pointsheetList) {
			if (i.getStudent().getCode() == studentCode && i.getExamSemesterSubject().getYear().getYear() == year) {
				for (String subject : getSubjectArray(year, pointsheetList, subjectList)) {
					totalPoint += getAveragePointPerSubject(studentCode, year, subject, examList, pointsheetList)
							* getMultiPerSubject(year, subject, pointsheetList);
					totalMulti += getMultiPerSubject(year, subject, pointsheetList);
				}
			}
		}
		averagePoint = totalPoint / totalMulti;
		return (double) Math.round(averagePoint * 100) / 100;
	}

	public static double getAveragePointPerSubject(int studentCode, int year, String subject, Exam examList[], Pointsheet pointsheetList[]) {
		double averagePoint = 0;
		double totalPoint = 0;
		double totalMulti = 0;

		for (Pointsheet i : pointsheetList) {
			if (i.getStudent().getCode() == studentCode && i.getExamSemesterSubject().getYear().getYear() == year) {
				if (i.getExamSemesterSubject().getSubject().getName().equals(subject)) {
					String[] semesterArray = new String[] { "Semester 1", "Semester 2" };
					for (String semester : semesterArray) {
						for (String exam : getExamArray(year, subject, semester, pointsheetList, examList)) {
							totalPoint += getPointPerExam(studentCode, year, subject, semester, exam, pointsheetList)
									* getMultiPerExam(year, subject, semester, exam, pointsheetList)
									* getMultiPerSemester(year, semester, subject, pointsheetList);
							totalMulti += getMultiPerExam(year, subject, semester, exam, pointsheetList)
									* getMultiPerSemester(year, semester, subject, pointsheetList);
						}
					}
				}
			}
		}
		averagePoint = totalPoint / totalMulti;
		return (double) Math.round(averagePoint * 100) / 100;

	}

	public static double getMultiPerSubject(int year, String subject, Pointsheet pointsheetList[]) {
		double multi = 1;
		for (Pointsheet i : pointsheetList) {
			if (i.getExamSemesterSubject().getYear().getYear() == year && i.getExamSemesterSubject().getSubject().getName().equals(subject)) {
				multi = i.getExamSemesterSubject().getMultiPerSubject();
				break;
			}
		}
		return multi;
	}

	public static double getMultiPerSemester(int year, String semester, String subject, Pointsheet pointsheetList[]) {
		double multi = 0;
		for (Pointsheet i : pointsheetList) {
			if (i.getExamSemesterSubject().getYear().getYear() == year && i.getExamSemesterSubject().getSemester().getName().equals(semester)
					&& i.getExamSemesterSubject().getSubject().getName().equals(subject)) {
				multi = i.getExamSemesterSubject().getMultiPerSemester();
				break;
			}

		}
		return multi;
	}

	public static double getMultiPerExam(int year, String subject, String semester, String exam, Pointsheet pointsheetList[]) {
		double multi = 0;
		for (Pointsheet i : pointsheetList) {
			if (i.getExamSemesterSubject().getYear().getYear() == year && i.getExamSemesterSubject().getSubject().getName().equals(subject)) {
				if (i.getExamSemesterSubject().getSemester().getName().equals(semester) && i.getExamSemesterSubject().getExam().getName().equals(exam)) {
					multi = i.getExamSemesterSubject().getMultiPerExam();
					break;
				}
			}
		}
		return multi;
	}

	public static double getPointPerExam(int studentCode, int year, String subject, String semester, String exam,
			Pointsheet pointsheetList[]) {
		double point = -1;
		for (Pointsheet i : pointsheetList) {
			if (i.getStudent().getCode() == studentCode && i.getExamSemesterSubject().getYear().getYear() == year) {
				if (i.getExamSemesterSubject().getSubject().getName().equals(subject) && i.getExamSemesterSubject().getSemester().getName().equals(semester)) {
					if (i.getExamSemesterSubject().getExam().getName().equals(exam)) {
						point = (double) Math.round(i.getPoint() * 100) / 100;
						break;
					}
				}
			}
		}
		return point;
	}

	public static String[] getExamArray(int year, String subject, String semester, Pointsheet pointsheetList[],
			Exam examList[]) {
		int count = 0;
		for (Exam exam : examList) {
			for (Pointsheet i : pointsheetList) {
				if (i.getExamSemesterSubject().getYear().getYear() == year && exam.getName().equals(i.getExamSemesterSubject().getExam().getName())) {
					if (i.getExamSemesterSubject().getSemester().getName().equals(semester) && i.getExamSemesterSubject().getSubject().getName().equals(subject)) {
						count += 1;
						break;
					}
				}
			}
		}

		int item = 0;
		String[] examArray = new String[count];
		for (Exam exam : examList) {
			for (Pointsheet i : pointsheetList) {
				if (i.getExamSemesterSubject().getYear().getYear() == year && exam.getName().equals(i.getExamSemesterSubject().getExam().getName())) {
					if (i.getExamSemesterSubject().getSemester().getName().equals(semester) && i.getExamSemesterSubject().getSubject().getName().equals(subject)) {
						examArray[item] = exam.getName();
						item += 1;
						break;
					}
				}
			}
		}
		return examArray;

	}

	public static String[] getSubjectArray(int year, Pointsheet pointsheetList[], Subject subjectList[]) {
		int count = 0;
		for (Subject subject : subjectList) {
			for (Pointsheet i : pointsheetList) {
				if (i.getExamSemesterSubject().getYear().getYear() == year && subject.getName().equals(i.getExamSemesterSubject().getSubject().getName())) {
					count += 1;
					break;
				}
			}
		}

		int item = 0;
		String[] subjectArray = new String[count];
		for (Subject subject : subjectList) {
			for (Pointsheet i : pointsheetList) {
				if (i.getExamSemesterSubject().getYear().getYear() == year && subject.getName().equals(i.getExamSemesterSubject().getSubject().getName())) {
					subjectArray[item] = subject.getName();
					item += 1;
					break;
				}
			}
		}
		return subjectArray;

	}

	public static String studentName(int studentCode, int year, Student studentList[]) {
		String studentName = "";
		for (Student i : studentList) {
			if (i.getCode() == studentCode && i.getClasses().getYear().getYear() == year) {
				studentName = i.getName();
				break;
			}
		}
		return studentName;

	}

	public static String studentClass(int studentCode, int year, Student studentList[]) {
		String studentClass = "";
		for (Student i : studentList) {
			if (i.getCode() == studentCode && i.getClasses().getYear().getYear() == year) {
				studentClass = i.getClasses().getName();
				break;
			}
		}
		return studentClass;

	}

	public static String studentTeacher(int studentCode, int year, Student studentList[]) {
		String studentTeacher = "";
		for (Student i : studentList) {
			if (i.getCode() == studentCode && i.getClasses().getYear().getYear() == year) {
				studentTeacher = i.getClasses().getTeacher().getName();
				break;
			}
		}
		return studentTeacher;

	}
}
