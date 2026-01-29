package org.example.controller;

import org.example.service.JwtService;
import org.example.service.RefershTokenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;

public class TokenController {
    @Autowired
    private AuthenticationManager authenticationManager;

    @Autowired
    private RefershTokenService refershTokenService;

    @Autowired
    private JwtService jwtService;


}
