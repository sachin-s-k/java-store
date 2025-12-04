package org.example.springstore;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {


   @RequestMapping("/")
    public String index(){
       String viewName = getViewName();
        System.out.println(viewName);

       return "index.html";

    }
    private String getViewName(){
       return "index";

    }

}
