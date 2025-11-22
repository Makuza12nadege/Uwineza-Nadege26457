package schoolManagementSystem.Q2;

import java.time.LocalDate;

public class Exam extends Course {
    private String examName;
    private int maxMarks;
    private LocalDate examDate;

    public Exam(int id, LocalDate createdDate, LocalDate updatedDate,
                String schoolName, String address, String phoneNumber, String email,
                String departmentName, String departmentCode,
                String teacherName, String subject, String teacherEmail, String phone,
                String studentName, int rollNumber, String grade, String contactNumber,
                String courseName, String courseCode, int creditHours,
                String examName, int maxMarks, LocalDate examDate)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber,
                courseName, courseCode, creditHours);
        if (examName == null || examName.isEmpty()) {
            throw new SchoolDataException("Exam name cannot be empty");
        }
        if (maxMarks <= 0) {
            throw new SchoolDataException("Max marks must be greater than 0");
        }
        if (examDate == null) {
            throw new SchoolDataException("Exam date cannot be null");
        }
        this.examName = examName;
        this.maxMarks = maxMarks;
        this.examDate = examDate;
    }

    public String getExamName() {
        return examName;
    }

    public void setExamName(String examName) throws SchoolDataException {
        if (examName == null || examName.isEmpty()) {
            throw new SchoolDataException("Exam name cannot be empty");
        }
        this.examName = examName;
    }

    public int getMaxMarks() {
        return maxMarks;
    }

    public void setMaxMarks(int maxMarks) throws SchoolDataException {
        if (maxMarks <= 0) {
            throw new SchoolDataException("Max marks must be greater than 0");
        }
        this.maxMarks = maxMarks;
    }

    public LocalDate getExamDate() {
        return examDate;
    }

    public void setExamDate(LocalDate examDate) throws SchoolDataException {
        if (examDate == null) {
            throw new SchoolDataException("Exam date cannot be null");
        }
        this.examDate = examDate;
    }
}
