package com.vasudha.springcassandra.entity;

import lombok.*;
import org.springframework.data.cassandra.core.mapping.*;

@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserData {

    @PrimaryKey
    private  int id;
    private String firstName;
    private String lastName;
    private String email;
}
