/*package com.ems.ems_backend.service0016.impl;
import com.ems.ems_backend.dto0016.EventsDto0016;
import com.ems.ems_backend.entity0016.Events0016;
import com.ems.ems_backend.mapper0016.Events0016Mapper;
import com.ems.ems_backend.repository0016.Events0016repository0016;
import com.ems.ems_backend.service0016.Events0016Service;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class Events0016ServiceImpl implements Events0016Service {
    private Events0016repository0016 events0016repository0016;
    @Override
    public EventsDto0016 createEvents0016(EventsDto0016 eventsDto0016) {
        Events0016 events0016 = Events0016Mapper.mapToEvents0016(eventsDto0016);
        Events0016 savedEvents0016 = events0016repository0016.save(events0016);
        return Events0016Mapper.mapToEventsDto0016(savedEvents0016);
    }
}*/
