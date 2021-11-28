package defaultconstructor.date;

public class SimpleDateFormatter {

    private CountryCode defaultCountryCode;

    public SimpleDateFormatter(){
        this.defaultCountryCode = CountryCode.HU;
    }

    public CountryCode getDefaultCountryCode() {
        return defaultCountryCode;
    }

    public String formatDateString(SimpleDate simpleDate){
        return formatDateStringByCountryCode(defaultCountryCode, simpleDate);

    }

    public String formatDateStringByCountryCode(CountryCode countryCode, SimpleDate simpleDate) {
        if(countryCode == CountryCode.HU){
            return simpleDate.getYear() + "-" + simpleDate.getMonth() + "-" + simpleDate.getDay();
        }
        if(countryCode == CountryCode.EN){
            return simpleDate.getMonth() + "-" + simpleDate.getDay() + "-" + simpleDate.getYear();
        }
        return simpleDate.getDay() + "-" + simpleDate.getMonth() + "-" + simpleDate.getYear();
    }

}
