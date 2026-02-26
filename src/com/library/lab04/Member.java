package com.library.lab04;

public class Member {
    private String memberID;
    private String memberName;
    private int bookLimit=0;

    public Member(String memberID, String memberName) {
        this.memberID=memberID;
        this.memberName=memberName;
    }

    public String getMemberID() {
        return memberID;
    }

    public void setMemberID(String memberID) {
        this.memberID = memberID;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public int getBookLimit() {
        return bookLimit;
    }

    public void setBookLimit(int bookLimit) {
        this.bookLimit = bookLimit;
    }
}
