package com.joaosakai.easybillings.service;

import com.joaosakai.easybillings.enumerations.Appearance;
import com.joaosakai.easybillings.model.Marking;
import com.joaosakai.easybillings.repository.MarkingRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MarkingRepositoryTest {

    @Autowired
    private MarkingRepository markingRepository;

    @Test
    public void findAllMarkings() {
        Page<Marking> markingList = markingRepository.findAll(new PageRequest(0, 10));
        assertThat(markingList.getTotalElements()).isGreaterThan(1L);
    }

    @Test
    public void findFirstMarking() {
        Marking marking = markingRepository.findOne(1);
        assertTrue(marking.getAppearance().equals(Appearance.WHITE));
    }
}
