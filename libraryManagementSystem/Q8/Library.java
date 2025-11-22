package libraryManagementSystem.Q8;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

    public class Library extends Entity {
        private String libraryName;
        private String location;
        private String phoneNumber;
        private final List<Section> sections = new ArrayList<>();

        private static final Pattern PHONE = Pattern.compile("^\\+?\\d{7,15}$");

        public Library(int id, String libraryName, String location, String phoneNumber) {
            super(id);
            setLibraryName(libraryName);
            setLocation(location);
            setPhoneNumber(phoneNumber);
        }

        public String getLibraryName() {
            return libraryName;
        }

        public void setLibraryName(String libraryName) {
            if (libraryName == null || libraryName.isBlank())
                throw new IllegalArgumentException("libraryName cannot be empty");
            this.libraryName = libraryName;
            touchUpdated();
        }

        public String getLocation() {
            return location;
        }

        public void setLocation(String location) {
            if (location == null || location.isBlank())
                throw new IllegalArgumentException("location cannot be empty");
            this.location = location;
            touchUpdated();
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            if (phoneNumber == null || !PHONE.matcher(phoneNumber).matches())
                throw new IllegalArgumentException("phoneNumber must be valid (digits, optional leading +, length 7-15)");
            this.phoneNumber = phoneNumber;
            touchUpdated();
        }

        public List<Section> getSections() {
            return sections;
        }

        public void addSection(Section s) {
            if (s == null) throw new IllegalArgumentException("section cannot be null");
            sections.add(s);
            touchUpdated();
        }

        public void removeSection(Section s) {
            sections.remove(s);
            touchUpdated();
        }

        @Override
        public String toString() {
            return "Library{" + "name='" + libraryName + '\'' + ", location='" + location + '\'' +
                    ", phone='" + phoneNumber + '\'' + ", sections=" + sections.size() + "} " + super.toString();
        }
    }

