package com.example.restful.api;

import com.example.restful.dto.NewDTO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class NewAPI {
    @RequestMapping(value = "new" , method = RequestMethod.POST)
    public @ResponseBody NewDTO createNew(@RequestBody NewDTO model){
        return model;
    }

}
