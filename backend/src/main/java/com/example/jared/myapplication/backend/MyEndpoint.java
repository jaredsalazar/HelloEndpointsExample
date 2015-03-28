/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.example.jared.myapplication.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;

import javax.inject.Named;

/**
 * An endpoint class we are exposing
 */
@Api(name = "myApi", version = "v1", namespace = @ApiNamespace(ownerDomain = "backend.myapplication.jared.example.com", ownerName = "backend.myapplication.jared.example.com", packagePath = ""))
public class MyEndpoint {


    /**
     * A simple endpoint method that takes a name and says Hi back
     */

    @ApiMethod(name = "sayHi")
    public MyBean sayHi(@Named("name") String name) {

        MyBean response = new MyBean();
        if(name.equals("buda")){

            response.setData("Ang pogi ni " + name + "....Joke :)" );
        }
        else if(name.equals("jared")){
            response.setData("Ang pogi ni " + name + "....seriously... no bias :D :)" );
        }
        else if(name.equals("kj")){
            response.setData("Hi " + name + "...type pa more :D hahaha" );
        }
        else if(name.equals("rick")){
            response.setData("Hi " + name + "..the MAN.. :D" );
        }
        else if(name.equals("john")){
            response.setData("Hi Mr.Overwhelmingly Cute :D" );
        }
        else
        response.setData("Hello, " + name);

        return response;
    }


}
