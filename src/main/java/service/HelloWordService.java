package service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface HelloWordService {

    @WebMethod
    String sayHello(String name);

    @WebMethod
    String save(String name,String pwd);

}



