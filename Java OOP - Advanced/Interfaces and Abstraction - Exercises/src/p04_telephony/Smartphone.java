package p04_telephony;

public class Smartphone implements Call, Browse{
    @Override
    public String callPhone(String phoneNumber) {
        return String.format("Calling... %s", phoneNumber);
    }

    @Override
    public String browseSite(String website) {
        return String.format("Browsing: %s!", website);
    }
}
