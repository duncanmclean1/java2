public class Person extends Animal{
    private String first;
    private String last;
    private int id;

    public Person() {
        this.first = "I do not have a name";
    }

    public Person(String f, String l) {
        this.first = f;
        this.last = l;
    }

    public Person(String f, String l, byte a, int newID) {
        this.first = f;
        this.last = l;
        this.id = newID;
    }

    public void speak() {

    }

    public int getPersonCount() {
        return getId();
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
