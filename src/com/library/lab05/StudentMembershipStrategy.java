package com.library.lab05;

public class StudentMembershipStrategy implements MembershipStrategy {
    private static final int BORROW_LIMIT = 5;
    private static final int LOAN_PERIOD = 21;
    private static final double DISCOUNT = 0.20;
    private static final double MEMBERSHIP_COST = 49.0;

    @Override public int getBorrowLimit() { return BORROW_LIMIT; }
    @Override public int getLoanPeriodDays() { return LOAN_PERIOD; }

    @Override
    public double applyLateFeeDiscount(double baseFee) {
        double discountAmount = baseFee * DISCOUNT;
        double finalFee = baseFee - discountAmount;

        System.out.println(" 🎓 [Student Discount Applied]");
        System.out.println(" Original Fee: " + baseFee + " Baht");
        System.out.println(" Student Discount (20%): -" + discountAmount + " Baht");
        System.out.println(" Final Fee: " + finalFee + " Baht");

        return finalFee;
    }

    @Override public String getMembershipType() { return "Student Member"; }
    @Override public double getMembershipCost() { return MEMBERSHIP_COST; }
    @Override public boolean hasUnlimitedBorrowing() { return false; }
}