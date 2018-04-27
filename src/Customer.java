public class Customer {
    private int id;
    private String name;
    private String date;
    private String address;
    private String image;

    public Customer() {
    }

    public Customer(int id, String name, String date, String address, String image) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.address = address;
        this.image = image;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDate() {
        return date;
    }

    public String getAddress() {
        return address;
    }

    public String getImage() {
        return image;
    }
}
