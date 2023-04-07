package com.marcop0lo.base.dto;

import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Getter
@Setter
public class UserBaseDto {
    private String firstName;
    private String lastName;
    private Integer age;
    private String email;
}
