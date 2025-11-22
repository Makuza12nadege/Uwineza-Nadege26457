package libraryManagementSystem.Q8;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

public class Member extends Entity {
        private String memberName;
        private int memberId;          // business id (must be > 0)
        private String contactNumber;  // optional validation
        private final List<Borrow> borrows = new ArrayList<>();

        private static final Pattern PHONE = Pattern.compile("^\\+?\\d{7,15}$");

        public Member(int id, int memberId, String memberName, String contactNumber) {
            super(id);
            setMemberId(memberId);
            setMemberName(memberName);
            setContactNumber(contactNumber);
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            if (memberName == null || memberName.isBlank()) throw new IllegalArgumentException("memberName cannot be empty");
            this.memberName = memberName;
            touchUpdated();
        }

        public int getMemberId() {
            return memberId;
        }

        public final void setMemberId(int memberId) {
            if (memberId <= 0) throw new IllegalArgumentException("memberId must be > 0");
            this.memberId = memberId;
            touchUpdated();
        }

        public String getContactNumber() {
            return contactNumber;
        }

        public void setContactNumber(String contactNumber) {
            if (contactNumber != null && !contactNumber.isBlank() && !PHONE.matcher(contactNumber).matches()) {
                throw new IllegalArgumentException("contactNumber must be valid (digits, optional +, length 7-15)");
            }
            this.contactNumber = contactNumber;
            touchUpdated();
        }

        public List<Borrow> getBorrows() {
            return borrows;
        }

        public void addBorrow(Borrow b) {
            if (b == null) throw new IllegalArgumentException("borrow cannot be null");
            borrows.add(b);
            touchUpdated();
        }

        @Override
        public String toString() {
            return "Member{" + "memberName='" + memberName + '\'' + ", memberId=" + memberId +
                    ", borrows=" + borrows.size() + "} " + super.toString();
        }
    }


