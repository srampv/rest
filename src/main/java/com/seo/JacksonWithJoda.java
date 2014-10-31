package com.seo;

import javax.ws.rs.ext.Provider;

import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

@Provider

public class JacksonWithJoda extends com.fasterxml.jackson.jaxrs.json.JacksonJsonProvider {

 

       public JacksonWithJoda() {
    	   
    	   SimpleModule sim=new SimpleModule();

              ObjectMapper mapper = new ObjectMapper().registerModule(sim);

              //mapper.getSerializationConfig().withSerializationInclusion(Include.NON_EMPTY);

              mapper = mapper.setSerializationInclusion(Include.NON_NULL);

              setMapper(mapper);

       }

}
