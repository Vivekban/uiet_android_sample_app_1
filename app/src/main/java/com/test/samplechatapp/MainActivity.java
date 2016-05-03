package com.test.samplechatapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.digits.sdk.android.Digits;
import com.twitter.sdk.android.core.TwitterAuthConfig;
import com.twitter.sdk.android.core.TwitterCore;

import io.fabric.sdk.android.Fabric;

public class MainActivity extends AppCompatActivity {

    // Note: Your consumer key and secret should be obfuscated in your source code before shipping.
    private static final String TWITTER_KEY = "j3XZdSKxeXGMGewnW0vFoZ93b";
    private static final String TWITTER_SECRET = "sJ2HkKbyoEs3QJ8fcT0NLu7oOHlimH7GoxeEg3wug7gndWy8mk";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        TwitterAuthConfig authConfig = new TwitterAuthConfig(TWITTER_KEY, TWITTER_SECRET);
        Fabric.with(this, new TwitterCore(authConfig), new Digits());
        setContentView(R.layout.activity_main);
        //hello kain
        //hello saif
    }
}
