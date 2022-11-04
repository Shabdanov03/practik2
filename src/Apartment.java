import java.util.Objects;

public class Apartment {
    private String title;
    private int price;
    private String address;

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getAddress() {
        return address;
    }

    public void getInfo() {
        System.out.println("getTitle() = " + getTitle());
        System.out.println("getPrice() = " + getPrice());
        System.out.println("getAddress() = " + getAddress());
    }

    public int payPerMonth(Student[] arrayStudent) {
        int studcounter = 0;
        for (Student student : arrayStudent) {
            if(student.getAddress().equals(address)) studcounter++;
        }
        return price / studcounter;

    }

}
