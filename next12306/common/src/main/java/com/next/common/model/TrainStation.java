package com.next.common.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Slf4j
public class TrainStation {
    private Integer id;

    private String name;

    private Integer cityId;


}