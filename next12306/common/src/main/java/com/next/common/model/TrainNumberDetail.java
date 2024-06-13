package com.next.common.model;


import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Slf4j
public class TrainNumberDetail {
    private Integer id;

    private Integer trainNumberId;

    private Integer fromStationId;

    private Integer fromCityId;

    private Integer toStationId;

    private Integer toCityId;

    private Integer stationIndex;

    private Integer relativeMinute;

    private Integer waitMinute;

    private String money;


}