package com.ems.ems_backend.entity0016;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.security.PrivateKey;
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Events0016")

public class Events0016 {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private int Booking_ID;
    @Column(name = "Event_ID")
    private Long  EventID;
    @Column(name = "Event_Owner_ID_No", nullable = false)
    private Long  EventOwnerIDNo;
    @Column(name = "Event_Type")
    private String EventType;
    @Column(name = "Event_Head_Count", nullable = false)
    private int EventHeadCount;
    @Column(name = "Event_Duration", nullable = false)
    private int Duration;
}