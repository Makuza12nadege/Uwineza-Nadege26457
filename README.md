This repository contains 10 Java Object-Oriented Programming (OOP) projects, demonstrating advanced concepts such as inheritance, encapsulation, constructor validation, user input handling, and final class methods. Each project is a self-contained system designed to simulate a real-world scenario, with full class hierarchies, attribute validation, and computation logic.
 Projects Included
1. Hospital Management System
Class Hierarchy: Entity → Hospital → Department → Doctor → Nurse → Patient → Admission → Treatment → Bill → HospitalRecord
Key Features:

Manage hospitals, departments, medical staff, patients, admissions, treatments, and billing.

Validate attributes like phone numbers, emails, dates, age, gender, fees.

HospitalRecord (final) calculates total bill:
generateBill() = roomCharges + treatmentCost + doctorFee + medicineCost.

Objective: Demonstrate inheritance, encapsulation, constructors with validation, Scanner input, and final method computation.

2. School Management System

Class Hierarchy: Entity → School → Department → Teacher → Student → Course → Exam → Result → Fee → StudentRecord

Features:

Manage schools, departments, teachers, students, courses, exams, results, and fees.

Validate emails, phone numbers, codes, marks, and tuition fees.

StudentRecord (final) calculates average marks:
calculateAverageMarks() = (obtainedMarks / maxMarks) * 100.

3. Employee Payroll System

Class Hierarchy: Entity → Company → Department → Manager → Employee → Attendance → Allowance → Deduction → Salary → PayrollRecord

Features:

Manage company staff, attendance, allowances, deductions, and salaries.

Validates phone numbers, emails, IDs, attendance, and salary fields.

PayrollRecord (final) calculates net salary:
calculateNetSalary() = basicSalary + allowances − deductions.

4. Hotel Reservation System

Class Hierarchy: Entity → Hotel → Room → Customer → Booking → Service → Payment → Bill → Feedback → ReservationRecord

Features:

Manage hotels, rooms, bookings, services, payments, and feedback.

Validates room prices, emails, phone numbers, ratings, and billing.

ReservationRecord (final) calculates bill:
generateBill() = roomCharge + serviceCharge.

5. Vehicle Rental System

Class Hierarchy: Entity → Company → Branch → Vehicle → Customer → Rental → Charge → Payment → Invoice → RentalRecord

Features:

Manage vehicle rental companies, branches, vehicles, customers, rentals, charges, and invoices.

Validates rental days, charges, IDs, and customer licenses.

RentalRecord (final) calculates total charge:
calculateTotalCharge() = rentalCharge + penaltyCharge.

6. Banking System

Class Hierarchy: Entity → Bank → Account → Customer → Transaction → Deposit → Withdrawal → Loan → Payment → AccountRecord

Features:

Manage banks, accounts, transactions, loans, deposits, withdrawals, and payments.

Validates account balances, transaction amounts, and interest calculations.

AccountRecord (final) calculates interest:
calculateInterest() = (loanAmount × interestRate × duration) / 100.

7. Real Estate Management System

Class Hierarchy: Entity → Agency → Agent → Property → Seller → Buyer → Agreement → Payment → Commission → RealEstateRecord

Features:

Manage agencies, agents, properties, sellers, buyers, agreements, payments, and commissions.

Validates phone numbers, emails, prices, and commission rates.

RealEstateRecord (final) calculates commission:
calculateCommission() = (price × commissionRate) / 100.

8. Library Management System

Class Hierarchy: Entity → Library → Section → Book → Member → Borrow → Fine → Payment → Record → LibraryRecord

Features:

Manage libraries, sections, books, members, borrowings, fines, and payments.

Validates ISBN, phone numbers, fines, and member IDs.

LibraryRecord (final) calculates fines:
calculateFine() = fineAmount × daysLate.

9. Airline Ticketing System

Class Hierarchy: Entity → Airline → Flight → Passenger → Seat → Ticket → Baggage → Payment → Invoice → TicketRecord

Features:

Manage airlines, flights, passengers, seats, tickets, baggage, payments, and invoices.

Validates flight details, seat types, ticket prices, and baggage fees.

TicketRecord (final) calculates invoice:
generateInvoice() = price + baggageFee.

10. Online Shopping System

Class Hierarchy: Entity → Store → Category → Product → Customer → Order → Payment → Shipping → Invoice → OrderRecord

Features:

Manage stores, categories, products, customers, orders, payments, shipping, and invoices.

Validates product prices, shipping costs, emails, and order IDs.

OrderRecord (final) calculates total amount:
calculateTotalAmount() = price + shippingCost.
