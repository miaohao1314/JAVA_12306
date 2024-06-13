package com.next.common.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Slf4j
public class TrainNumber {
    private Integer id;

    private String name;

    private Integer fromStationId;

    private Integer fromCityId;

    private Integer toStationId;

    private Integer toCityId;

    private String trainType;

    private Short type;

    private Integer seatNum;


}