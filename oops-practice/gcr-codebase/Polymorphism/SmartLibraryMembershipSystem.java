class LibraryMember {
    protected String memberName;
    protected String memberId;

    public LibraryMember(String memberName, String memberId) {
        this.memberName = memberName;
        this.memberId = memberId;
    }

    public void printMemberDetails() {
        System.out.println("Name: " + memberName + " | ID: " + memberId);
    }

    public double calculateFine(int overdueDays) {
        return 0;
    }
}

class StudentMember extends LibraryMember {
    public StudentMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 5.0;
    }
}

class FacultyMember extends LibraryMember {
    public FacultyMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 2.0;
    }
}

class GuestMember extends LibraryMember {
    public GuestMember(String memberName, String memberId) {
        super(memberName, memberId);
    }

    @Override
    public double calculateFine(int overdueDays) {
        return overdueDays * 10.0;
    }
}

public class SmartLibraryMembershipSystem {
    public static void printMemberDetails(LibraryMember[] members) {
        for (LibraryMember member : members) {
            member.printMemberDetails();
        }
    }

    public static LibraryMember findMemberById(LibraryMember[] members, String targetId) {
        for (LibraryMember member : members) {
            if (member.memberId.equals(targetId)) {
                return member;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LibraryMember[] members = {
                new StudentMember("Asha", "S101"),
                new FacultyMember("Ravi", "F202"),
                new GuestMember("Neha", "G303")
        };

        printMemberDetails(members);

        LibraryMember found = findMemberById(members, "F202");
        if (found != null) {
            System.out.println("Found member:");
            found.printMemberDetails();
            System.out.println("Fine for 4 overdue days: " + found.calculateFine(4));
        }
    }
}
