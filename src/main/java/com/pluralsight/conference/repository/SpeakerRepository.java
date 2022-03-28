package com.pluralsight.conference.repository;

import com.pluralsight.conference.model.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {

}
