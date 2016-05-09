package com.asy.patterns.structural.proxy;

/**
 * HtmlWebParser class.
 *
 * @author asanchezy.
 * @version 1.0.
 * @since 9/5/16.
 */
public class HtmlWebParser implements WebParser {

    private String content;

    private String websiteUrl;

    public HtmlWebParser(String url) {

        websiteUrl = url;

        //Here, we would make the connection to the website, making all the heavy transactions here.

        content = "<p>Website html content</p>";

    }

    @Override
    public String getHtmlContent() {

        return content;

    }
}
