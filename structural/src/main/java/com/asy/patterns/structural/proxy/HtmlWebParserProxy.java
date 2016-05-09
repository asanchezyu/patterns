package com.asy.patterns.structural.proxy;

/**
 * Proxy class for html web parser.
 *
 * @author asanchezyu@gmail.com.
 * @version 1.0.
 * @since 9/5/16.
 */
public class HtmlWebParserProxy implements WebParser {

    private HtmlWebParser connection;

    private String websiteUrl;

    public HtmlWebParserProxy(String url) {

        this.websiteUrl = url;

    }

    @Override
    public String getHtmlContent() {

        if (connection == null) {

            System.out.println("New instance of HtmlWebParser");

            connection = new HtmlWebParser(websiteUrl);

        }

        return connection.getHtmlContent();

    }
}