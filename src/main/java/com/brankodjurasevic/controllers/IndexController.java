package com.brankodjurasevic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by branko.djurasevic on 3/20/2017.
 */
@Controller
public class IndexController {
    @RequestMapping("/")
    String index() {
        return "index";
    }
}
