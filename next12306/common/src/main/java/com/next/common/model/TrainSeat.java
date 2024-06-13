package com.next.common.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Slf4j
public class TrainSeat {
    private Long id;

    private String ticket;

    private Long userId;

    private Long travellerId;

    private Integer trainNumberId;

    private Integer carriageNumber;

    private Integer rowNumber;

    private Integer seatNumber;

    private Integer seatLevel;

    private Date trainStart;

    private Date trainEnd;

    private Integer money;

    private String showNumber;

    private Integer status;

    private Integer fromStationId;

    private Integer toStationId;


}