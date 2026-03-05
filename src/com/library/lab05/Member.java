package com.library.lab05;

import java.util.ArrayList;
import java.util.List;

public class Member {
    private String memberId;
    private String name;
    private List<LibraryItem> borrowedItems;

    private MembershipStrategy membershipStrategy;

    public Member(String memberId, String name, MembershipStrategy membershipStrategy) {
        this.memberId = memberId;
        this.name = name;
        this.membershipStrategy = membershipStrategy;
        this.borrowedItems = new ArrayList<>();
    }

    public String getMemberId() { return memberId; }
    public String getName() { return name; }

    public int getBorrowedCount() { return borrowedItems.size(); }

    public boolean canBorrow() {
        if (membershipStrategy.hasUnlimitedBorrowing()) return true;
        return borrowedItems.size() < membershipStrategy.getBorrowLimit();
    }

    public void addBorrowedItem(LibraryItem item) { borrowedItems.add(item); }
    public void removeBorrowedItem(LibraryItem item) { borrowedItems.remove(item); }

    public int getLoanPeriodDays() { return membershipStrategy.getLoanPeriodDays(); }

    public double calculateLateFee(double baseFee) {
        return membershipStrategy.applyLateFeeDiscount(baseFee);
    }

    public void setMembershipStrategy(MembershipStrategy newStrategy) {
        this.membershipStrategy = newStrategy;
    }

    public void displayMemberInfo() {
        System.out.println("\n--- MEMBER INFORMATION ---");
        System.out.println(" ID: " + memberId);
        System.out.println(" Name: " + name);
        System.out.println(" Membership Type: " + membershipStrategy.getMembershipType());
        System.out.println(" Membership Cost: " + membershipStrategy.getMembershipCost() + " Baht");
        System.out.println(" Borrow Limit: " + (membershipStrategy.hasUnlimitedBorrowing() ? "Unlimited" : membershipStrategy.getBorrowLimit()));
        System.out.println(" Currently Borrowed: " + borrowedItems.size());
        System.out.println(" Loan Period: " + membershipStrategy.getLoanPeriodDays() + " days");
    }
}