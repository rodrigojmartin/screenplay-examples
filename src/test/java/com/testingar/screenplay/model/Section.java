package com.testingar.screenplay.model;

/**
 * Created by Rodrigo on 7/24/17.
 */

public enum Section {
    Amazon("https://www.amazon.com");

    private final String url;

    Section(String url) {
        this.url = url;
    }

    public String url() {
        return url;
    }
}