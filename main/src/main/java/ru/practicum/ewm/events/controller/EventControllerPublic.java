package ru.practicum.ewm.events.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.practicum.ewm.events.EventService;
import ru.practicum.ewm.events.dto.EventFullDtoWithViews;
import ru.practicum.ewm.events.dto.EventSearchDto;
import ru.practicum.ewm.events.dto.EventShortDtoWithViews;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Validated
@RestController
@RequiredArgsConstructor
@RequestMapping("/events")
public class EventControllerPublic {
    private final EventService eventService;

    @GetMapping
    public List<EventShortDtoWithViews> getEvents(EventSearchDto eventSearchDto,
                                                  HttpServletRequest request) {
        return eventService.getEvents(eventSearchDto, request);
    }

    @GetMapping("/{eventId}")
    public EventFullDtoWithViews getEventById(@PathVariable Long eventId, HttpServletRequest request) {
        return eventService.getEventById(eventId, request);
    }
}
