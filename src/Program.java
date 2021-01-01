import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        var listLibrary = new ArrayList<LibraryTicket>();
        var input = new Scanner(System.in);
        var choice = 0;
        do {
            System.out.println("1: Add Library Ticket");
            System.out.println("2: Display Information");
            System.out.println("0: Exit");
            choice = input.nextInt();
            input.nextLine();
            switch (choice) {
                case 0:
                    System.exit(0);
                case 1:
                    var add = creatList(input);
                    listLibrary.add(add);
                    System.out.println("Done!");
                    break;
                case 2:
                    showList(listLibrary);
                    break;
            }
        } while (true);
    }

    private static void showList(ArrayList<LibraryTicket> listLibrary) {
        String format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                "Họ Tên", "Mã SV", "Date Of Birth", "Tên Lớp", "Mã Thẻ Mượn", "Ngày Cấp", "Ngày Trả", "Số Hiệu Sách");
        for (LibraryTicket li : listLibrary) {
            System.out.printf("%-15s%-15s%-15s%-15s%-15s%-15s%-15s%-15s\n",
                    li.getStudent().getFullName(), li.getStudent().getStudentCode(),
                    dateFormat.format(li.getStudent().getDateOfBirth()), li.getStudent().getClassName(),
                    li.getCodeVoucher(), dateFormat.format(li.getDayIssue()),
                    dateFormat.format(li.getDayReturn()), li.getNumberSignBook());
        }
    }

    private static LibraryTicket creatList(Scanner input) {
        System.out.println("Enter FullName");
        var fullName = input.nextLine();
        System.out.println("Enter Student Code");
        var studentCode = input.nextLine();
        System.out.println("Date Of Birth For Instance 20/20/2020");
        var format = "dd/MM/yyyy";
        SimpleDateFormat dateFormat = new SimpleDateFormat(format);
        Date dateOfBirth = null;
        try {
            dateOfBirth = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            System.out.println("Không Hợp Lệ ");
            e.printStackTrace();
        }
        System.out.println("Enter Your Class");
        var className = input.nextLine();
        System.out.println("Enter Your Code VouCher");
        var codeVoucher = input.nextLine();
        System.out.println("Enter Day Issue Instance 20/20/2020");
        Date dayIssue = null;
        try {
            dayIssue = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            System.out.println("Nhap Khong Dung Dinh Dang");
            e.printStackTrace();
        }
        System.out.println("Enter Day Return Instance 20/20/2020");
        Date dayReturn = null;
        try {
            dayReturn = dateFormat.parse(input.nextLine());
        } catch (ParseException e) {
            System.out.println("Nhap Khong Dung Dinhh Dang");
            e.printStackTrace();
        }
        System.out.println("Enter Number Sign Book");
        var numberSignBook = input.nextLine();
        Student student = new Student(fullName, studentCode, dateOfBirth, className);
        return new LibraryTicket(codeVoucher, dayIssue, dayReturn, numberSignBook, student);
    }
}
