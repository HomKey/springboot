package com.hk.translate;

public interface ITranslate {
    boolean isSupport(String language);
    String translateText(String text,String sourceLang, String targetLang);
}
