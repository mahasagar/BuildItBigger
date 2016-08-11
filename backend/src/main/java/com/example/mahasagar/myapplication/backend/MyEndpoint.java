/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.mahasagar.myapplication.backend;

import com.example.JokeLib;
import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/** An endpoint class we are exposing */
@Api(
  name = "myApi",
  version = "v1",
  namespace = @ApiNamespace(
    ownerDomain = "backend.myapplication.mahasagar.example.com",
    ownerName = "backend.myapplication.mahasagar.example.com",
    packagePath=""
  )
)
public class MyEndpoint {

    /** A simple endpoint method that takes a name and says Hi back */
    @ApiMethod(name = "freeJokes")
    public MyBean freeJokes() {
        MyBean response = new MyBean();
        JokeLib javaJoke = new JokeLib();
        String joke = javaJoke.getPJJoke();
        response.setData(joke);
        return response;
    }

    @ApiMethod(name = "paidJokes")
    public MyBean paidJoke() {
        MyBean response = new MyBean();
        JokeLib javaJoke = new JokeLib();
        String joke = javaJoke.getJoke();
        response.setData(joke);
        return response;
    }
}
