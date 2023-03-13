package day3a.Bai1;

public class PhoneNumber {
    private String phoneNum;


    public PhoneNumber() {
    }

    public PhoneNumber(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    @Override
    public String toString() {
        return "PhoneNumber{" +
                "phoneNum='" + phoneNum + '\'' +
                '}';
    }
}
