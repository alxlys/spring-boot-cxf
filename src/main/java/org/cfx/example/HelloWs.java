package org.cfx.example;

import org.apache.cxf.feature.Features;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author olysenko
 */
@WebService
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class HelloWs {

   @WebMethod
   public String hello() {
      return "Hello!";
   }

}
