package com.chandan;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by chand on 8/13/2016.
 */
@Controller
public class BlogEntryController {

    @RequestMapping("/test")
    public String test(){
        return "view";
    }
}
