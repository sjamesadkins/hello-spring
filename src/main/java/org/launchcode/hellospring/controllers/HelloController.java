package org.launchcode.hellospring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping
@ResponseBody
public class HelloController {
//    @GetMapping("hello")
//    @ResponseBody
//    public String hello() {
//        return "Hello, Spring!";
//    }

//    responds to requests /hello?coder=LaunchCoder
    @RequestMapping(value = "hello", method = {RequestMethod.GET, RequestMethod.POST})
//    @ResponseBody
    public String hello(@RequestParam String coder) {
        return "Hello " + coder + "!";
    }

    //responds to requests /hello/name
    @GetMapping("hello/{name}")
//    @ResponseBody
    public String helloAgain(@PathVariable String name) {
        return "Hello " + name + "!";
    }

    @GetMapping
//    @ResponseBody
    public String helloForm() {
        String html =
            "<html>" +
                "<body>" +
                    "<form method = 'post' action = '/hello'>" +
                       "<input type = 'text' name = 'coder' />" +
                        "<input type = 'submit' value = 'Greet Me!' />" +
                    "</form>" +
                "</body" +
            "</html>";
        return html;
    }
}
