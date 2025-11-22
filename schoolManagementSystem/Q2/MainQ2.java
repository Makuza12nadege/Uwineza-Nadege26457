package schoolManagementSystem.Q2;

import java.time.LocalDate;
import java.util.Scanner;

public class MainQ2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter Entity ID: ");
            int id = Integer.parseInt(scanner.nextLine());
            LocalDate today = LocalDate.now();

            System.out.print("Enter School Name: ");
            String schoolName = scanner.nextLine();
            System.out.print("Enter School Address: ");
            String schoolAddress = scanner.nextLine();
            System.out.print("Enter School Phone (10 digits): ");
            String schoolPhone = scanner.nextLine();
            System.out.print("Enter School Email: ");
            String schoolEmail = scanner.nextLine();

            System.out.print("Enter Department Name: ");
            String departmentName = scanner.nextLine();
            System.out.print("Enter Department Code (>=3 alphanumeric): ");
            String departmentCode = scanner.nextLine();

            System.out.print("Enter Teacher Name: ");
            String teacherName = scanner.nextLine();
            System.out.print("Enter Subject: ");
            String subject = scanner.nextLine();
            System.out.print("Enter Teacher Email: ");
            String teacherEmail = scanner.nextLine();
            System.out.print("Enter Teacher Phone (10 digits): ");
            String teacherPhone = scanner.nextLine();

            System.out.print("Enter Student Name: ");
            String studentName = scanner.nextLine();
            System.out.print("Enter Roll Number (>0): ");
            int rollNumber = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Grade: ");
            String grade = scanner.nextLine();
            System.out.print("Enter Student Contact (10 digits): ");
            String studentContact = scanner.nextLine();

            System.out.print("Enter Course Name: ");
            String courseName = scanner.nextLine();
            System.out.print("Enter Course Code: ");
            String courseCode = scanner.nextLine();
            System.out.print("Enter Credit Hours (>0): ");
            int creditHours = Integer.parseInt(scanner.nextLine());

            System.out.print("Enter Exam Name: ");
            String examName = scanner.nextLine();
            System.out.print("Enter Max Marks (>0): ");
            int maxMarks = Integer.parseInt(scanner.nextLine());
            LocalDate examDate = today;

            System.out.print("Enter Obtained Marks (>=0): ");
            int obtainedMarks = Integer.parseInt(scanner.nextLine());
            System.out.print("Enter Remarks: ");
            String remarks = scanner.nextLine();

            System.out.print("Enter Tuition Fee (>0): ");
            double tuitionFee = Double.parseDouble(scanner.nextLine());
            System.out.print("Enter Exam Fee (>0): ");
            double examFee = Double.parseDouble(scanner.nextLine());

            StudentRecord record = new StudentRecord(
                    id, today, today,
                    schoolName, schoolAddress, schoolPhone, schoolEmail,
                    departmentName, departmentCode,
                    teacherName, subject, teacherEmail, teacherPhone,
                    studentName, rollNumber, grade, studentContact,
                    courseName, courseCode, creditHours,
                    examName, maxMarks, examDate,
                    obtainedMarks, remarks,
                    tuitionFee, examFee
            );

            double average = record.getAverageMarks();

            System.out.println("\n--- Student Record ---");
            System.out.println("School: " + schoolName + ", Address: " + schoolAddress + ", Phone: " + schoolPhone + ", Email: " + schoolEmail);
            System.out.println("Department: " + departmentName + " (" + departmentCode + ")");
            System.out.println("Teacher: " + teacherName + ", Subject: " + subject + ", Email: " + teacherEmail + ", Phone: " + teacherPhone);
            System.out.println("Student: " + studentName + ", Roll: " + rollNumber + ", Grade: " + grade + ", Contact: " + studentContact);
            System.out.println("Course: " + courseName + " (" + courseCode + "), Credit Hours: " + creditHours);
            System.out.println("Exam: " + examName + ", Max Marks: " + maxMarks + ", Exam Date: " + examDate);
            System.out.println("Obtained Marks: " + obtainedMarks + ", Remarks: " + remarks);
            System.out.println("Tuition Fee: " + tuitionFee + ", Exam Fee: " + examFee + ", Total Fee: " + (tuitionFee + examFee));
            System.out.println("Average Marks (%): " + average);

        } catch (SchoolDataException e) {
            System.out.println("Validation error: " + e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("Invalid number format. Please enter numeric values where required.");
        } finally {
            scanner.close();
        }
    }
}
