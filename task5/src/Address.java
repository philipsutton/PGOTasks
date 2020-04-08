public class Address {
    private String country, city, streetName;
    private int postalCode, apartmentNumber;

    public String createAddress(String country)
    {
        return String.format("Country: %s", country);
    }

    public String createAddress(String country, String city)
    {
        return String.format("Country: %s, City: %s", country, city);
    }

    public String createAddress(String country, String city, int postalCode)
    {
        return String.format("Country: %s, City: %s, Postal Code: %d", country, city, postalCode);
    }

    public String createAddress(String country, String city, int postalCode, String streetName)
    {
        return String.format("Country: %s, City: %s, Postal Code: %d, streetName: %s", country, city, postalCode, streetName);
    }

    public String createAddress (String country, String city, int postalCode, String streetName, int apartmentNumber)
    {
        return String.format("Country: %s, City: %s, Postal Code: %d, Street Name: %s, Apartment Number: %d", country, city, postalCode, streetName, apartmentNumber);
    }


}
