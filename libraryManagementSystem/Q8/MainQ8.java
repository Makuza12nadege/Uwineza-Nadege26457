package libraryManagementSystem.Q8;

import libraryManagementSystem.Q8.*;

import java.util.Scanner;
import java.time.LocalDate;

public class MainQ8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== LIBRARY SYSTEM INPUT =====");

        // ---- Library ----
        System.out.print("Enter Library Name: ");
        String libName = sc.nextLine();

        System.out.print("Enter Library Location: ");
        String location = sc.nextLine();

        System.out.print("Enter Library Phone: ");
        String phone = sc.nextLine();

        Library library = new Library(1, libName, location, phone);

        // ---- Section ----
        System.out.print("Enter Section Name: ");
        String sectionName = sc.nextLine();

        System.out.print("Enter Section Code: ");
        String sectionCode = sc.nextLine();

        Section section = new Section(2, sectionName, sectionCode);
        library.addSection(section);

        // ---- Book ----
        System.out.print("Enter Book Title: ");
        String title = sc.nextLine();

        System.out.print("Enter Book Author: ");
        String author = sc.nextLine();

        System.out.print("Enter Book ISBN (>=10 chars): ");
        String isbn = sc.nextLine();

        Book book = new Book(3, title, author, isbn);
        section.addBook(book);

        // ---- Member ----
        System.out.print("Enter Member Name: ");
        String memberName = sc.nextLine();

        System.out.print("Enter Member ID (number): ");
        int memberId = sc.nextInt();
        sc.nextLine();  // clear buffer

        System.out.print("Enter Member Contact: ");
        String contact = sc.nextLine();

        Member member = new Member(4, memberId, memberName, contact);

        // ---- Borrow ----
        Borrow borrow = new Borrow(
                5,
                LocalDate.now().minusDays(10),
                LocalDate.now(),
                book,
                member
        );

        // ---- Fine ----
        System.out.print("Enter Fine Amount per Day: ");
        double fineAmount = sc.nextDouble();

        System.out.print("Enter Days Late: ");
        int daysLate = sc.nextInt();

        Fine fine = new Fine(6, fineAmount, daysLate);
        borrow.setFine(fine);

        // ---- LibraryRecord ----
        LibraryRecord record = new LibraryRecord(7, 1);
        double totalFine = record.calculateFine(fine);

        // ---- Output ----
        System.out.println("\n===== OUTPUT =====");
        System.out.println("Library: " + library.getLibraryName());
        System.out.println("Section: " + section.getSectionName());
        System.out.println("Book: " + book.getTitle());
        System.out.println("Member: " + member.getMemberName());
        System.out.println("Days Late: " + daysLate);
        System.out.println("Fine per Day: " + fineAmount);
        System.out.println("TOTAL FINE: " + totalFine);
    }
}
