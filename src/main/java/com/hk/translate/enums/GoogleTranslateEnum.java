package com.hk.translate.enums;

public enum GoogleTranslateEnum {
    Automatic("auto", "Automatic"),
    Afrikaans("af", "Afrikaans"),
    Albanian("sq", "Albanian"),
    Amharic("am", "Amharic"),
    Arabic("ar", "Arabic"),
    Armenian("hy", "Armenian"),
    Azerbaijani("az", "Azerbaijani"),
    Basque("eu", "Basque"),
    Belarusian("be", "Belarusian"),
    Bengali("bn", "Bengali"),
    Bosnian("bs", "Bosnian"),
    Bulgarian("bg", "Bulgarian"),
    Catalan("ca", "Catalan"),
    Cebuano("ceb", "Cebuano"),
    Chichewa("ny", "Chichewa"),
    Simplified("zh_cn", "Chinese Simplified"),
    Traditional("zh_tw", "Chinese Traditional"),
    Corsican("co", "Corsican"),
    Croatian("hr", "Croatian"),
    Czech("cs", "Czech"),
    Danish("da", "Danish"),
    Dutch("nl", "Dutch"),
    English("en", "English"),
    Esperanto("eo", "Esperanto"),
    Estonian("et", "Estonian"),
    Filipino("tl", "Filipino"),
    Finnish("fi", "Finnish"),
    French("fr", "French"),
    Frisian("fy", "Frisian"),
    Galician("gl", "Galician"),
    Georgian("ka", "Georgian"),
    German("de", "German"),
    Greek("el", "Greek"),
    Gujarati("gu", "Gujarati"),
    Creole("ht", "Haitian Creole"),
    Hausa("ha", "Hausa"),
    Hawaiian("haw", "Hawaiian"),
    Hebrew("iw", "Hebrew"),
    Hindi("hi", "Hindi"),
    Hmong("hmn", "Hmong"),
    Hungarian("hu", "Hungarian"),
    Icelandic("is", "Icelandic"),
    Igbo("ig", "Igbo"),
    Indonesian("id", "Indonesian"),
    Irish("ga", "Irish"),
    Italian("it", "Italian"),
    Japanese("ja", "Japanese"),
    Javanese("jw", "Javanese"),
    Kannada("kn", "Kannada"),
    Kazakh("kk", "Kazakh"),
    Khmer("km", "Khmer"),
    Korean("ko", "Korean"),
    Kurmanji("ku", "Kurdish (Kurmanji)"),
    Kyrgyz("ky", "Kyrgyz"),
    Lao("lo", "Lao"),
    Latin("la", "Latin"),
    Latvian("lv", "Latvian"),
    Lithuanian("lt", "Lithuanian"),
    Luxembourgish("lb", "Luxembourgish"),
    Macedonian("mk", "Macedonian"),
    Malagasy("mg", "Malagasy"),
    Malay("ms", "Malay"),
    Malayalam("ml", "Malayalam"),
    Maltese("mt", "Maltese"),
    Maori("mi", "Maori"),
    Marathi("mr", "Marathi"),
    Mongolian("mn", "Mongolian"),
    Burmese("my", "Myanmar (Burmese)"),
    Nepali("ne", "Nepali"),
    Norwegian("no", "Norwegian"),
    Pashto("ps", "Pashto"),
    Persian("fa", "Persian"),
    Polish("pl", "Polish"),
    Portuguese("pt", "Portuguese"),
    Punjabi("ma", "Punjabi"),
    Romanian("ro", "Romanian"),
    Russian("ru", "Russian"),
    Samoan("sm", "Samoan"),
    Gaelic("gd", "Scots Gaelic"),
    Serbian("sr", "Serbian"),
    Sesotho("st", "Sesotho"),
    Shona("sn", "Shona"),
    Sindhi("sd", "Sindhi"),
    Sinhala("si", "Sinhala"),
    Slovak("sk", "Slovak"),
    Slovenian("sl", "Slovenian"),
    Somali("so", "Somali"),
    Spanish("es", "Spanish"),
    Sundanese("su", "Sundanese"),
    Swahili("sw", "Swahili"),
    Swedish("sv", "Swedish"),
    Tajik("tg", "Tajik"),
    Tamil("ta", "Tamil"),
    Telugu("te", "Telugu"),
    Thai("th", "Thai"),
    Turkish("tr", "Turkish"),
    Ukrainian("uk", "Ukrainian"),
    Urdu("ur", "Urdu"),
    Uzbek("uz", "Uzbek"),
    Vietnamese("vi", "Vietnamese"),
    Welsh("cy", "Welsh"),
    Xhosa("xh", "Xhosa"),
    Yiddish("yi", "Yiddish"),
    Yoruba("yo", "Yoruba"),
    Zulu("zu", "Zulu");

    private String value;
    private String description;

    GoogleTranslateEnum(String value, String description) {
        this.value = value;
        this.description = description;
    }

    public String getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static GoogleTranslateEnum get(String language){
        for (GoogleTranslateEnum googleTranslateEnum : GoogleTranslateEnum.values()) {
            if (language.equals(googleTranslateEnum.getValue()) || language.equals(googleTranslateEnum.getDescription())){
                return googleTranslateEnum;
            }
        }
        return null;
    }
}
