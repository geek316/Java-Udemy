package learningoops;

public class StudentChallengePropertiesAndConstructor {
    public static void main(String[] args) {

    }
}

class Product {

    private final String itemNumber;
    private final String name;
    private float price;
    private int quantity;

    public Product(String ItemNumber, String name) {
        this.itemNumber = ItemNumber;
        this.name = name;
        this.price = 0;
        this.quantity = 0;
    }

    public Product(String itemNumber, String name, float price, int quantity) {
        this.itemNumber = itemNumber;
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public String getName() {
        return name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        if (price < 0) {
            this.price = 0;
        } else {
            this.price = price;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }
}

class Customer {

    private final String custId;
    private final String name;
    private String address;
    private String phone;

    public Customer(String custId, String name) {
        this.custId = custId;
        this.name = name;
        setAddress(null);
        setPhone(null);
    }

    public Customer(String custId, String name, String address, String phone) {
        this.custId = custId;
        this.name = name;
        setAddress(address);
        setPhone(phone);
    }

    public String getCustId() {
        return custId;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        if (address == null) {
            this.address = "Milky Way, Earth, Solar System";
        } else {
            this.address = address;
        }
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        if (phone == null) {
            this.phone = "9999999999";
        } else {
            this.phone = phone;
        }
    }

}
