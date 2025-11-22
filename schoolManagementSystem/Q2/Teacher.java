package schoolManagementSystem.Q2;

import java.time.LocalDate;

public class Teacher extends Department {
    private String teacherName;
    private String subject;
    private String teacherEmail;
    private String phone;

    public Teacher(int id, LocalDate createdDate, LocalDate updatedDate,
                   String schoolName, String address, String phoneNumber, String email,
                   String departmentName, String departmentCode,
                   String teacherName, String subject, String teacherEmail, String phone)
            throws SchoolDataException {
        super(id, createdDate, updatedDate, schoolName, address, phoneNumber, email,
                departmentName, departmentCode);
        if (teacherName == null || teacherName.isEmpty()) {
            throw new SchoolDataException("Teacher name cannot be empty");
        }
        if (subject == null || subject.isEmpty()) {
            throw new SchoolDataException("Subject cannot be empty");
        }
        if (teacherEmail == null || !teacherEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new SchoolDataException("Invalid teacher email format");
        }
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new SchoolDataException("Phone must be 10 digits");
        }
        this.teacherName = teacherName;
        this.subject = subject;
        this.teacherEmail = teacherEmail;
        this.phone = phone;
    }

    public String getTeacherName() {
        return teacherName;
    }

    public void setTeacherName(String teacherName) throws SchoolDataException {
        if (teacherName == null || teacherName.isEmpty()) {
            throw new SchoolDataException("Teacher name cannot be empty");
        }
        this.teacherName = teacherName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) throws SchoolDataException {
        if (subject == null || subject.isEmpty()) {
            throw new SchoolDataException("Subject cannot be empty");
        }
        this.subject = subject;
    }

    public String getTeacherEmail() {
        return teacherEmail;
    }

    public void setTeacherEmail(String teacherEmail) throws SchoolDataException {
        if (teacherEmail == null || !teacherEmail.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$")) {
            throw new SchoolDataException("Invalid teacher email format");
        }
        this.teacherEmail = teacherEmail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) throws SchoolDataException {
        if (phone == null || !phone.matches("\\d{10}")) {
            throw new SchoolDataException("Phone must be 10 digits");
        }
        this.phone = phone;
    }
}
