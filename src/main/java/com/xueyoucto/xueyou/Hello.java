package com.xueyoucto.xueyou;

import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.ws.Endpoint;

/**
 * Created by Administrator on 2017/1/14.
 */
@WebService
@SOAPBinding(style = SOAPBinding.Style.RPC)
public class Hello {

    public String testService(String params){
        return "hello " + params;
    }

    public String testStudent(Student student){
        return student.getName() + " : " + student.getAge();
    }

}
