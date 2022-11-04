import java.util.Scanner;

public class Student {
    private String fullName;
    private int phoneNumber;
    private String address;
    private int bankAccount;

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public String getFullName() {
        return fullName;
    }

    public int getPhoneNumber() {

        return phoneNumber;

    }

    public String getAddress() {
        return address;

    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void getInfo() {
        System.out.println("fullName = " + fullName);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("address = " + address);
        System.out.println("bankAccount = " + bankAccount);
    }

    public void livein(Apartment[] arrayApartment,Student[] arrayStudent){
        int result=0;
        for (Apartment apartment:arrayApartment) {
            if (apartment.getAddress().equals(address)) result=bankAccount/apartment.payPerMonth(arrayStudent);
        }
        System.out.println("live in "+result+" month");




    }
    public void changeInfo(){
        System.out.println(" Input fullname");
        fullName=new Scanner(System.in).nextLine();
        System.out.println("Input phoneNumber");
        phoneNumber=new Scanner(System.in).nextInt();
        System.out.println(" Input address");
        address=new Scanner(System.in).nextLine();
        System.out.println(" input bankAccount");
        bankAccount=new Scanner(System.in).nextInt();
        System.out.println("Student changed successfully!");
        }
    }
