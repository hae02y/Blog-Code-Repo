package org.example;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class JsoupTest {
    static void main() throws IOException {
        String url = "https://blog.hae02y.me";
        Connection connect = Jsoup.connect(url);

        Document elements = connect.get();

        Element body = elements.body();
        Elements p = body.select("div");

        System.out.println(p);
    }
}
