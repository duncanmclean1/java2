public class Invoice {
    private String name;
    private String address;
    private String city;
    private String state;
    private int zipcode;

    public Invoice() {
    }

    public Invoice(String n, String a, String c, String s, int z) {
        this.name = n;
        this.address = a;
        this.city = c;
        this.state = s;
        this.zipcode = z;
    }

    public String toString() {
        String ans = "Ship to:\n" + this.name + "\n" + this.address + "\n" + city + ", " + state + " " + zipcode;

        return ans;
    }

    /**
     * @return String return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return String return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return String return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return String return the state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(String state) {
        this.state = state;
    }

    /**
     * @return int return the zipcode
     */
    public int getZipcode() {
        return zipcode;
    }

    /**
     * @param zipcode the zipcode to set
     */
    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }

}
