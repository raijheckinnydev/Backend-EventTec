package com.raijheckinny.api.repositories;

import com.raijheckinny.api.domin.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface IEventRepository extends JpaRepository<Event, UUID> {
}
