package com.library.lab05;

public class PremiumMembershipStrategy implements MembershipStrategy {
    private static final int BORROW_LIMIT = Integer.MAX_VALUE;
    private static final int LOAN_PERIOD = 30;
    private static final double DISCOUNT = 1.0; // 100%
    private static final double MEMBERSHIP_COST = 299.0;

    @Override public int getBorrowLimit() { return BORROW_LIMIT; }
    @Override public int getLoanPeriodDays() { return LOAN_PERIOD; }

    @Override
    public double applyLateFeeDiscount(double baseFee) {
        System.out.println(" 👑 [Premium Member Privilege]");
        System.out.println(" Original Fee: " + baseFee + " Baht");
        System.out.println(" Premium Discount (100%): -" + baseFee + " Baht");
        System.out.println(" Final Fee: 0.0 Baht (FREE!)");
        return 0.0;
    }

    @Override public String getMembershipType() { return "Premium Member"; }
    @Override public double getMembershipCost() { return MEMBERSHIP_COST; }
    @Override public boolean hasUnlimitedBorrowing() { return true; }
}