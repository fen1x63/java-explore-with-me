package ru.practicum.ewm.events.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.format.annotation.DateTimeFormat;

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

    private String text = "";
    private List<Long> categories;
    private Boolean paid = false;
    @DateTimeFormat(pattern = DATE_TIME_PATTERN)
    private LocalDateTime rangeStart;
    @DateTimeFormat(pattern = DATE_TIME_PATTERN)
    private LocalDateTime rangeEnd;
    private Boolean onlyAvailable = false;
    private String sort = "EVENT_DATE";
    @PositiveOrZero
    private Integer from = 0;
    @Positive
    private Integer size = 10;

}