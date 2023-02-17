import java.util.ArrayList;
import java.util.Arrays;

public class Address {
    private String streetNum;
    private String streetName;
    private String apartmentNum;
    private String city;
    private String state;
    private int zipCode;
    public Address(String streetNum, String streetName, String apartmentNum, String city, String state, int zipCode) {
        this.streetNum = streetNum;
        this.streetName = streetName;
        this.apartmentNum = apartmentNum;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
    }
    public Address(Address address) {
        streetNum = address.getStreetNum();
        streetName = address.getStreetName();
        apartmentNum = address.getApartmentNum();
        city = address.getCity();
        state = address.getState();
        zipCode = address.getZipCode();
    }
    public Address(String address) {
        String[] addressComponents = address.split(", ");
        String streetComponent = addressComponents[0];
        streetNum = streetComponent.substring(0, streetComponent.indexOf(" "));
        streetComponent = streetComponent.substring(streetComponent.indexOf(" "));
        // apartmentNum = streetComponent.substring()
        System.out.println(Arrays.toString(addressComponents));
    }
    public String getStreetNum() {
        return streetNum;
    }

    public void setStreetNum(String streetNum) {
        this.streetNum = streetNum;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getApartmentNum() {
        return apartmentNum;
    }

    public void setApartmentNum(String apartmentNum) {
        this.apartmentNum = apartmentNum;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public int getZipCode() {
        return zipCode;
    }

    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public boolean apartmentIncluded() {
        return !(apartmentNum.equals("") || apartmentNum == null);
    }
    public String toString() {
        if(apartmentIncluded()) {
            return(streetNum + " " + streetName + " " + apartmentNum + ", " + city + ", " + state + ", " + zipCode);
        } else {
            return(streetNum + " " + streetName + ", " + city + ", " + state + ", " + zipCode);
        }
    }
}
