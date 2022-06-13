package com.example.instagram_app;

import android.app.Application;

import com.parse.Parse;

public class ParseApplication extends Application {

    // Initializes Parse SDK as soon as the application is created
    @Override
    public void onCreate() {
        super.onCreate();

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("GG3U4R9ps8GpJ7YvmnM9V4VXpdZVu5gJ0lCR2xh9")
                .clientKey("vHMLw8OZfNmDO4oaYCms07m4fY2RQW77K85UuTE6")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
