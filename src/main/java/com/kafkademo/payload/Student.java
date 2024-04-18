package com.kafkademo.payload;

import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private String id;
    private String firstname;
    private String lastname;
}
