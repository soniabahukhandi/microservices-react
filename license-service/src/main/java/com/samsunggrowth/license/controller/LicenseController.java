package com.samsunggrowth.license.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import com.samsunggrowth.license.model.License;

@RestController
//@RequestMapping("v1/organization/{organizationId}/license")
//@RequestMapping("/person")
public class LicenseController {
    @Autowired
    private MessageSource messages;
    @RequestMapping(value="v1/organization/{organizationId}/license/{licenseId}",method = RequestMethod.GET)
    public ResponseEntity<License> getLicense(@PathVariable("organizationId") String organizationId,@PathVariable("licenseId") String licenseId)
    {
        License license=new License();
        license.add(linkTo(methodOn(LicenseController.class)
                .getLicense(organizationId, license.getLicenseId()))
                .withSelfRel());        
         return ResponseEntity.ok(license);    }
}
