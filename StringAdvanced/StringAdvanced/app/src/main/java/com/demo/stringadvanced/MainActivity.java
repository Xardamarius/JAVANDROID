package com.demo.stringadvanced;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        String nameString = "Андрей, Алексей, Роман, Павел, Михаил";
//        String[] names = nameString.split(", ");
//        for (String name : names) {
//            Log.i("MyName", name);
//        }
//        String geometry = "Геометрия";
//        String meter = geometry.substring(3, 7);
//        Log.i("MyName", meter);

        String url = "<div class=\"image\">\n" +
                "\t\t\t\t\t\t<img src=\"http://cdn.posh24.se/images/:profile/c/50038\" alt=\"Justin Timberlake\"/>\n" +
                "\t\t\t\t\t</div>";
        Pattern patternImg = Pattern.compile("<img src=\"(.*?)\"");
        Pattern patternName = Pattern.compile("alt=\"(.*?)\"");
        Matcher matcherImg = patternImg.matcher(url);
        Matcher matcherName = patternName.matcher(url);
        while (matcherImg.find()) {
            Log.i("MyName", matcherImg.group(1));
        }
        while (matcherName.find()) {
            Log.i("MyName", matcherName.group(1));
        }
    }
}
