package com.ems.ems_backend.dto0016;

import jakarta.persistence.Column;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Events0016Dto {
    private Long Booking_ID;
    private Long  EventID;
    private Long  EventOwnerIDNo;
    private String EventType;
    private int EventHeadCount;
    private int Duration;
}
