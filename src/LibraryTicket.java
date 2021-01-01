import java.util.Date;

public class LibraryTicket {
    private String codeVoucher;      // Mã thẻ
    private Date dayIssue;           // Ngày cấp
    private Date dayReturn;          // Ngày trả
    private String numberSignBook;   // Số hiệu sách
    private Student student;         // Thông tin Sinh vien

    public LibraryTicket() {
    }

    public LibraryTicket(String codeVoucher, Date dayIssue,
                         Date dayReturn, String numberSignBook, Student student) {
        this.codeVoucher = codeVoucher;
        this.dayIssue = dayIssue;
        this.dayReturn = dayReturn;
        this.numberSignBook = numberSignBook;
        this.student = student;
    }

    public String getCodeVoucher() {
        return codeVoucher;
    }

    public Date getDayIssue() {
        return dayIssue;
    }

    public Date getDayReturn() {
        return dayReturn;
    }

    public String getNumberSignBook() {
        return numberSignBook;
    }

    public Student getStudent() {
        return student;
    }
}
