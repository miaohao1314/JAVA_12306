package com.next.common.model;

import lombok.*;
import lombok.extern.slf4j.Slf4j;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
@Slf4j
public class TrainTraveller {
    private Long id;

    private String name;

    private Byte adultFlag;

    private Byte sex;

    private Short idType;

    private String idNumber;

    private String contact;

    private String address;

    private String email;


}