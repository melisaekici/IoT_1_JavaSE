package oop;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
/*
Inner Class: class içinde class demektir
javada 1 tane public vardır (inner class hariç)
javada static class yazamazsınız (inner class hariç)
 */

@Data
@Setter @Getter
public class Country {
    private String countryName;

    // İç Class
    @Setter @Getter
    public static class City{
        private String cityName;
    }
}

// Main
class MainInnerClass{
    public static void main(String[] args) {
        Country country = new Country();
        country.setCountryName("Türkiye");

        Country.City city = new Country.City();
        city.setCityName("İzmir");

        System.out.println("Ülke: "+country.getCountryName()+" Şehir: "+city.getCityName());
    }
}