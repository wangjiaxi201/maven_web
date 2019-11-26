package example.controller;

import entity.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.portlet.ModelAndView;

import java.util.Map;

@Controller
@RequestMapping("/home")
public class DemoController {

    @RequestMapping("/index")
    public String index(Map<String, Employee> map){
        Employee employee= new Employee(1,"sd");
        map.put("e",employee);
        return "index";
    }
}