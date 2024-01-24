package ru.practicum.ewm.events.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;
import ru.practicum.ewm.categories.dto.CategoryDto;
import ru.practicum.ewm.events.model.State;
import ru.practicum.ewm.locations.LocationDto;
import ru.practicum.ewm.users.dto.UserShortDto;

import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import java.time.LocalDateTime;
import java.util.List;

import static ru.practicum.ewm.util.DateConstant.DATE_TIME_PATTERN;

@Builder
@Getter
@Setter
@EqualsAndHashCode
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PUBLIC)
public class EventSearchDto {

    Long id;
    String annotation;
    CategoryDto category;
    Long confirmedRequests;
    @JsonFormat(pattern = DATE_TIME_PATTERN)
    LocalDateTime createdOn;
    String description;
    @JsonFormat(pattern = DATE_TIME_PATTERN)
    LocalDateTime eventDate;
    UserShortDto initiator;
    LocationDto location;
    Integer participantLimit;
    @JsonFormat(pattern = DATE_TIME_PATTERN)
    LocalDateTime publishedOn;
    Boolean requestModeration;
    State state;
    String title;
    String text = "";
    List<Long> categories;
    Boolean paid = false;
    @DateTimeFormat(pattern = DATE_TIME_PATTERN)
    LocalDateTime rangeStart;
    @DateTimeFormat(pattern = DATE_TIME_PATTERN)
    LocalDateTime rangeEnd;
    Boolean onlyAvailable = false;
    String sort = "EVENT_DATE";
    @PositiveOrZero
    Integer from = 0;
    @Positive
    Integer size = 10;

}