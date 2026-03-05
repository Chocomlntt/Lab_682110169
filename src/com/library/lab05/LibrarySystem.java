package com.library.lab05;

import java.util.ArrayList;
import java.util.List;

public class LibrarySystem {
    private static LibrarySystem instance;

    private List<LibraryItem> allItems;
    private List<Member> allMembers;

    private String libraryName;
    private String libraryLocation;

    private LibrarySystem() {
        this.allItems = new ArrayList<>();
        this.allMembers = new ArrayList<>();
        this.libraryName = "City Central Library";
        this.libraryLocation = "123 Main Street, Downtown";
    }

    public static synchronized LibrarySystem getInstance() {
        if (instance == null) {
            instance = new LibrarySystem();
            System.out.println("📚 [Singleton] LibrarySystem initialized (First time)");
        }
        return instance;
    }

    public void addItem(LibraryItem item) {
        allItems.add(item);
        System.out.println(" ✅ Item added to system: " + item.getTitle());
    }

    public void addMember(Member member) {
        allMembers.add(member);
        System.out.println(" ✅ Member registered: " + member.getName());
    }

    public List<LibraryItem> getAllItems() { return new ArrayList<>(allItems); }
    public List<Member> getAllMembers() { return new ArrayList<>(allMembers); }

    public Member findMemberById(String memberId) {
        return allMembers.stream()
                .filter(m -> m.getMemberId().equals(memberId))
                .findFirst()
                .orElse(null);
    }

    public void displayStatistics() {
        long available = allItems.stream().filter(LibraryItem::isAvailable).count();
        long borrowed = allItems.size() - available;

        System.out.println("\n" + "=".repeat(60));
        System.out.println(" 📚 LIBRARY SYSTEM STATISTICS (Singleton Instance)");
        System.out.println("=".repeat(60));
        System.out.println("\nLibrary: " + libraryName);
        System.out.println("Location: " + libraryLocation);
        System.out.println("\n📊 STATISTICS:");
        System.out.println(" Total Items: " + allItems.size());
        System.out.println(" Available Items: " + available);
        System.out.println(" Borrowed Items: " + borrowed);
        System.out.println(" Total Members: " + allMembers.size());
    }
}
