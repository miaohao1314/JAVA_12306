package com.next.common.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Slf4j
public class TrainUserTraveller {
    private Long id;

    private Long userId;

    private Long travellerId;


}