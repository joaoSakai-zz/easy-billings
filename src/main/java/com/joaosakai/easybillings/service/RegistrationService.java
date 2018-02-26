package com.joaosakai.easybillings.service;

import com.joaosakai.easybillings.model.Marking;
import com.joaosakai.easybillings.repository.MarkingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistrationService {

    @Autowired
    private MarkingRepository markingRepository;

    public boolean addMarking(final Marking marking) {
        if(marking != null) {
            markingRepository.save(marking);
            return true;
        }
        return false;
    }
}
