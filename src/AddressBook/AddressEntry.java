package AddressBook;

public class AddressEntry {

    private String fisrtName;
    private String lastName;
    private String street;
    private String city;
    private String state;
    private int zipCode;
    private String phone;
    private String email;

    /* Constructor sin parametros */
    public AddressEntry() {

    }

    /**
     * Constructor con todos los parametros */
    public AddressEntry(String fisrtName, String lastName, String street, String city, String state, int zipCode,
            String phone, String email) {
        this.fisrtName = fisrtName;
        this.lastName = lastName;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phone = phone;
        this.email = email;
    }

    /* Metodo toString sobreescrito que devuelve una cadena con todas las entradas */
    @Override
    public String toString() {
        return "\nFisrt Name: " + fisrtName + "\nLast Name: " + lastName + "\nStreet: " + street + "\nCity: " + city
                + "\nState: " + state + "\nZip Code: " + zipCode + "\nPhone: " + phone + "\nEmail: " + email + "\n";
    }

    /* Getters */
    public String getFisrtName() {
        return fisrtName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getStreet() {
        return street;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    /* Setters */
    public void setFisrtName(String fisrtName) {
        this.fisrtName = fisrtName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setStreet(String street) {
        this.street = street;
    }
    
    public void setCity(String city) {
        this.city = city;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}