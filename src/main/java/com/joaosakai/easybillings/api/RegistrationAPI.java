package com.joaosakai.easybillings.api;

import com.joaosakai.easybillings.service.RegistrationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author joao.sakai
 *
 */
@RestController
@RequestMapping("/api")
public class RegistrationAPI {

    @Autowired
    private RegistrationService registrationService;

}
