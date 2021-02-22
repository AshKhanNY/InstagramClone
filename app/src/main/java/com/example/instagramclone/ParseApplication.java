package com.example.instagramclone;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as app is created
    @Override
    public void onCreate() {
        super.onCreate();

        //Register your parse models
        ParseObject.registerSubclass(Post.class);

        // Register your parse models
        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("n6c7oLemtEcNtb4Jo6zEh50PWOMf6iY9i7uTZRBq")
                .clientKey("BBNZ7wcB9TvukcfOvAVMivKDdkhkLaQNzRozsSfb")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
