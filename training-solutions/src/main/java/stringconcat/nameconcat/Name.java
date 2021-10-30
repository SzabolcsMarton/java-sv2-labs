package stringconcat.nameconcat;

import java.util.Locale;

public class Name {

    private String familyName;
    private String middleName;
    private String givenName;
    private Title title;

    public Name(String familyName, String middleName, String givenName, Title title) {
        this.familyName = familyName;
        this.middleName = middleName;
        this.givenName = givenName;
        this.title = title;
    }

    public String concatNameWesternStyle(){

        String nameWesternStyle;

        if(title != null){
          nameWesternStyle = title.getStringOfTitle();
          nameWesternStyle = nameWesternStyle.concat(" ");
          nameWesternStyle = nameWesternStyle.concat(givenName);
        }else{
            nameWesternStyle = givenName;
        }
        nameWesternStyle = nameWesternStyle.concat(" ");
        if(middleName != null && !"".equals(middleName)){
            nameWesternStyle = nameWesternStyle.concat(middleName);
            nameWesternStyle = nameWesternStyle.concat(" ");
        }
        nameWesternStyle = nameWesternStyle.concat(familyName);
        return nameWesternStyle;

    }

    public String concatNameHungarianStyle(){

        String nameHun;

        if (title != null) {
            nameHun = title.getStringOfTitle();
            nameHun += " " + familyName;
        } else {
            nameHun = familyName;
        }
        if (middleName != null && !"".equals(middleName)){
            nameHun += " " + middleName ;
        }
        nameHun +=" " +  givenName;
        return nameHun;

    }
}
