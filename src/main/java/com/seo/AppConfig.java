package com.seo;

import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {

	 

    public AppConfig() {

           super(MyJacksonFeature.class);

//         register(LoggingFilter.class);

    }

}
