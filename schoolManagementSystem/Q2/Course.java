package schoolManagementSystem.Q2;

import java.time.LocalDate;

public class Course extends Student {
    private String courseName;
    private String courseCode;
    private int creditHours;

    public Course(int id, LocalDate createdDate, LocalDate updatedDate,
                  String schoolName, String address, String phoneNumber, String email,
                  String departmentName, String departmentCode,
                  String teacherName, String subject, String teacherEmail, String phone,
                  String studentName, int rollNumber, String grade, String contactNumber,
                  String courseName, String courseCode, int creditHours)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode,
                teacherName, subject, teacherEmail, phone,
                studentName, rollNumber, grade, contactNumber);
        if (courseName == null || courseName.isEmpty()) {
            throw new SchoolDataException("Course name cannot be empty");
        }
        if (courseCode == null || courseCode.isEmpty()) {
            throw new SchoolDataException("Course code cannot be empty");
        }
        if (creditHours <= 0) {
            throw new SchoolDataException("Credit hours must be greater than 0");
        }
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.creditHours = creditHours;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) throws SchoolDataException {
        if (courseName == null || courseName.isEmpty()) {
            throw new SchoolDataException("Course name cannot be empty");
        }
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) throws SchoolDataException {
        if (courseCode == null || courseCode.isEmpty()) {
            throw new SchoolDataException("Course code cannot be empty");
        }
        this.courseCode = courseCode;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) throws SchoolDataException {
        if (creditHours <= 0) {
            throw new SchoolDataException("Credit hours must be greater than 0");
        }
        this.creditHours = creditHours;
    }
}
