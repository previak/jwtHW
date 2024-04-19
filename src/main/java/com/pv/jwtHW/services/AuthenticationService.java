package com.pv.jwtHW.services;


import com.pv.jwtHW.requests.LoginRequest;
import com.pv.jwtHW.requests.RegisterRequest;
import com.pv.jwtHW.responses.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse login(LoginRequest request);
}