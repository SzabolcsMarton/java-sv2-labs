package nestedclasses.dns;

import java.util.ArrayList;
import java.util.List;

public class NameServer {

    private List<DnsEntry> dnsEntries;

    public NameServer(){
        this.dnsEntries = new ArrayList<>();
    }
    public  void addEntry(String hostName, String hostIp){
        validateString(hostName);
        validateString(hostIp);
        if (dnsEntryExistsByIp(hostIp) || dnsEntryExistsByName(hostName)){
            throw new IllegalArgumentException("Already exists");
        }
        dnsEntries.add(new DnsEntry(hostName,hostIp));
    }

    public void deleteEntryByName(String name){
        validateString(name);
        if(dnsEntryExistsByName(name)){
            dnsEntries.remove(getEntryByName(name));
        }
    }

    public void deleteEntryByIp(String ipNumber){
        validateString(ipNumber);
        if(dnsEntryExistsByIp(ipNumber)){
            dnsEntries.remove(getEntryByIp(ipNumber));
        }
    }

    public String getIpByName(String hostName){
        validateString(hostName);
        NameServer.DnsEntry entry = getEntryByName(hostName);
        return entry.getHostIp();
    }

    public String getNameByIp(String ipNumber){
        validateString(ipNumber);
        NameServer.DnsEntry entry = getEntryByIp(ipNumber);
        return entry.getHostName();
    }

    private DnsEntry getEntryByName(String name){
        validateString(name);
        for(DnsEntry actual : dnsEntries){
            if(actual.getHostName().equals(name)){
                return actual;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private DnsEntry getEntryByIp(String ipNumber){
        validateString(ipNumber);
        for (DnsEntry actual : dnsEntries) {
            if(actual.getHostIp().equals(ipNumber)){
                return actual;
            }
        }
        throw new IllegalArgumentException("Element not found");
    }

    private boolean dnsEntryExistsByName(String name){
        validateString(name);
        for(DnsEntry actual : dnsEntries){
            if(actual.getHostName().equals(name)){
                return true;
            }
        }
        return false;
    }

    private boolean dnsEntryExistsByIp(String ipNumber){
        validateString(ipNumber);
        for(DnsEntry actual : dnsEntries){
            if(actual.getHostIp().equals(ipNumber)){
                return true;
            }
        }
        return false;
    }

    private void validateString(String stringToCheck){
        if(stringToCheck == null || stringToCheck.isBlank()){
            throw new IllegalArgumentException("Parameter is invalid");
        }
    }
//    Lehessen hozz??adni ??j n??v, IP-c??m p??rost az  met??dussal,
//    ami dobjon IllegalArgumentException kiv??telt Already exists sz??veggel, ha m??r van ilyen IP-c??m, vagy n??v!
//    Lehessen t??r??lni egy bejegyz??st a nevet megadva a removeEntryByName met??dussal, ha nincs ilyen nev??,
//    akkor ne t??rt??njen semmi!
//    Lehessen t??r??lni IP-c??m alapj??n, a removeEntryByIp met??dussal! Ha nincs ilyen IP-c??mmel rendelkez??,
//    akkor ne t??rt??njen semmi!

    private static class DnsEntry {
        private String hostName;
        private String hostIp;

        public DnsEntry(String hostName, String hostIp) {
            this.hostName = hostName;
            this.hostIp = hostIp;
        }

        public String getHostName() {
            return hostName;
        }

        public String getHostIp() {
            return hostIp;
        }
    }
}