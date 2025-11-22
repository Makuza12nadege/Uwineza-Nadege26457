package schoolManagementSystem.Q2;

import java.time.LocalDate;

public final class StudentRecord extends Fee {
    private double averageMarks;

    public StudentRecord(int id, LocalDate createdDate, LocalDate updatedDate,
                         String schoolName, String address, String phoneNumber, String email,
                         String departmentName, String departmentCode,
                         String teacherName, String subject, String teacherEmail, String phone,
                         String studentName, int rollNumber, String grade, String contactNumber,
                         String courseName, String courseCode, int creditHours,
                         String examName, int maxMarks, LocalDate examDate,
                         int obtainedMarks, String remarks,
                         double tuitionFee, double examFee)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours,
                examName, maxMarks, examDate,
                obtainedMarks, remarks,
                tuitionFee, examFee, tuitionFee + examFee);
        this.averageMarks = calculateAverageMarks();
    }

    public double calculateAverageMarks() {
        return (getObtainedMarks() * 100.0) / getMaxMarks();
    }

    public double getAverageMarks() {
        return averageMarks;
    }
}
