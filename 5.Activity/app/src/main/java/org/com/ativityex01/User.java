package org.com.ativityex01;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor

public class User implements Serializable {
    private  int id;
    private  String username;
    private  String password;
}
