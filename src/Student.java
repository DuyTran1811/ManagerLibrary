import java.util.Date;

public class Student {
    private String fullName;        // Họ Tên
    private String studentCode;     // Mã sinh viên
    private Date dateOfBirth;       // Ngày tháng năm sinh
    private String className;       // Tên lớp

    public Student() {
    }

    public Student(String fullName, String studentCode,
                   Date dateOfBirth, String className) {
        this.fullName = fullName;
        this.studentCode = studentCode;
        this.dateOfBirth = dateOfBirth;
        this.className = className;
    }

    public final String getFullName() {
        return fullName;
    }

    public final String getStudentCode() {
        return studentCode;
    }

    public final Date getDateOfBirth() {
        return dateOfBirth;
    }

    public final String getClassName() {
        return className;
    }
}
