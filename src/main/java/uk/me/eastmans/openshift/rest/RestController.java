package uk.me.eastmans.openshift.rest;

import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by markeastman on 06/03/2017.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {

    @RequestMapping("/dummy")
    public String updateFile()
    {
        return "dummy return string from remote service";
    }
}
