package com.example.twitterfun;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseACL;


public class StarterApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        //Parse.initialize(this);
        Parse.enableLocalDatastore(this);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId(getString(R.string.back4app_app_id))
                // if defined
                .clientKey(getString(R.string.back4app_client_key))
                .server(getString(R.string.back4app_server_url))
                .build()
        );

        //ParseUser.logOut();
/*
        ParseObject parseObject = new ParseObject("exampleObject");
        parseObject.put("myNumber","123");
        parseObject.put("myString","ovi");

        parseObject.saveInBackground(new SaveCallback() {
            @Override
            public void done(ParseException e) {
                if (e == null){
                    Log.i("Parse Result","Successful");
                }else {
                    Log.i("Parse Result","failed" + e.toString());
                }
            }
        });*/

        ParseACL defaultACL = new ParseACL();
        defaultACL.setPublicReadAccess(true);
        defaultACL.setPublicWriteAccess(true);
        ParseACL.setDefaultACL(defaultACL, true);
    }
}
