package com.library.lab05;

public class LibraryManagementApp {
    public static void main(String[] args) {

        System.out.println("\n" + "=".repeat(70));
        System.out.println(" DESIGN PATTERNS: SINGLETON & STRATEGY");
        System.out.println("=".repeat(70));

        System.out.println("\n[STEP 1] Initializing LibrarySystem (Singleton Pattern):");
        LibrarySystem librarySystem = LibrarySystem.getInstance();

        System.out.println("Getting LibrarySystem instance again:");
        LibrarySystem sameInstance = LibrarySystem.getInstance();
        System.out.println(" ✅ Same instance? " + (librarySystem == sameInstance));

        System.out.println("\n[STEP 2] Creating Library Items:");
        PhysicalBook book1 = new PhysicalBook("Java Programming", "John Smith", "978-0134685991", 450.0, "A1-04");
        librarySystem.addItem(book1);

        System.out.println("\n" + "=".repeat(70));
        System.out.println(" [STEP 3] STRATEGY PATTERN: Creating Members");
        System.out.println("=".repeat(70));

        Member basicMember = new Member("M001", "Somsak", new BasicMembershipStrategy());
        Member studentMember = new Member("M002", "Suda", new StudentMembershipStrategy());
        Member premiumMember = new Member("M003", "Somchai", new PremiumMembershipStrategy());

        librarySystem.addMember(basicMember);
        librarySystem.addMember(studentMember);
        librarySystem.addMember(premiumMember);

        for (Member m : librarySystem.getAllMembers()) {
            m.displayMemberInfo();
        }

        System.out.println("\n" + "=".repeat(70));
        System.out.println(" [STEP 4] Borrow Transaction Demo");
        System.out.println("=".repeat(70));

        // เดโมให้เห็น loan period แตกต่าง
        System.out.println("\n--- Student Member (Suda) Borrows ---");
        book1.checkOut(studentMember); // Loan Period ต้องเป็น 21 วัน ตาม PDF :contentReference[oaicite:6]{index=6}

        System.out.println("\n" + "=".repeat(70));
        System.out.println(" [STEP 5] Late Fee Discount Demo");
        System.out.println("=".repeat(70));

        double baseFee = 100.0;
        System.out.println("\nBase Late Fee: " + baseFee + " Baht\n");

        System.out.println("Student Member (20% discount):");
        double finalFee = studentMember.calculateLateFee(baseFee);
        System.out.println(" Final: " + finalFee + " Baht\n");

        librarySystem.displayStatistics();
    }
}