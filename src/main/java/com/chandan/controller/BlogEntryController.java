package com.chandan.controller;

import com.chandan.entities.BlogEntry;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by chand on 8/13/2016.
 */
@Controller
public class BlogEntryController {

    @RequestMapping(value = "/test", method = RequestMethod.POST)
    public
    @ResponseBody
    BlogEntry test(@RequestBody BlogEntry blogEntry) {
       /* BlogEntry be = new BlogEntry();
        be.setTitle("Test Blog Entry");*/
        return blogEntry;
    }
}
