package com.pv.jwtHW.requests;

import com.pv.jwtHW.entities.UserRole;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class RegisterRequest {

    String username;

    String password;

    UserRole role;
}
