package com.vasudha.springcassandra.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDataRequest {
    private  int id;
    private String firstName;
    private String lastName;
    private String email;
}
