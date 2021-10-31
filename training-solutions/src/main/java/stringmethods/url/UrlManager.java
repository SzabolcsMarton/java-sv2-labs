package stringmethods.url;

public class UrlManager {
    private  String protocol;
    private Integer port;
    private String host;
    private String path;
    private String query;

    public UrlManager(String url){
        this.protocol = getProtocolOfUrl(url);
        this.port = getPortOfUrl(url);
        this.host = getHostOfUrl(url);
        this.path = getPathOfUrl(url);
        this.query = getQueryOfUrl(url);

    }

    public boolean hasProperty(String key) {
        return query.contains(key );
    }

    public  String getProperty(String key){
        String[] properties = query.split("&");
        for (String splitedProperties: properties){
            String[]splitedProp = splitedProperties.split("=");
            if (key.equals(splitedProp[0])){
                return splitedProp[1];
            }
        }
        return null;
    }

    public String getProtocol() {
        return protocol;
    }


    public Integer getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }

    public String getPath() {
        return path;
    }

    private String getProtocolOfUrl(String url){
        int index = url.indexOf("://");
        return url.substring(0,index).toLowerCase();
    }

    private String getHostOfUrl(String url){
        int index = url.indexOf("://") + 3 ;
        int otherIndex = url.indexOf(":", index);
        if (otherIndex == -1){
            otherIndex = url.indexOf("/",index) ;
        }
        if (otherIndex == -1){
            return url.substring(index).toLowerCase();
        }else{
            return url.substring(index,otherIndex).toLowerCase();
        }
    }

    private Integer getPortOfUrl(String url){
        int index = url.indexOf("://") + 3;
        int otherIndex = url.indexOf(":", index + 1);
        if(otherIndex == -1){
            return null;
        }
        int indexEndOfPort = url.indexOf("/",index + 1);
        if (indexEndOfPort == -1){
            return Integer.valueOf(url.substring(otherIndex + 1));
        }else{
            String result = url.substring(otherIndex + 1 ,indexEndOfPort);
            return Integer.valueOf(result);
        }
    }

    private String getPathOfUrl(String url){
        int index = url.indexOf("://");
        int otherIndex = url.indexOf("/", index + 3);
        if(otherIndex == -1){
            return "";
        }
        int indexOfPathend = url.indexOf("?",otherIndex );
        if (indexOfPathend == -1){
            return url.substring(otherIndex);
        }else {
            return url.substring(otherIndex,indexOfPathend);
        }
    }

    private String getQueryOfUrl(String url){
        int index = url.indexOf("?");
        if(index == -1){
            return "";
        }else{
            return url.substring(index + 1);
        }
    }

    public static void main(String[] args) {
        String url = "https://earthquake.usgs.gov/fdsnws/event/1/query?format=geojson&starttime=2014-01-01&endtime=2014-01-02";
        UrlManager urlManager = new UrlManager(url);

        System.out.println(urlManager.getProtocol());
        System.out.println(urlManager.getHost());
        System.out.println(urlManager.getPort());
        System.out.println(urlManager.getPath());
        System.out.println(urlManager.hasProperty("origin"));
        System.out.println(urlManager.hasProperty("format"));
        System.out.println(urlManager.getProperty("format"));

    }
}
