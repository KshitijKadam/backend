//package com.nexahomes.loginproject.controller;
//
//import com.nexahomes.loginproject.model.JWTRequest;
//import com.nexahomes.loginproject.model.JWTResponse;
//import com.nexahomes.loginproject.services.CustomUserDetailsService;
//import com.nexahomes.loginproject.util.JWTUtil;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UsernameNotFoundException;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class JWTController {
//
//    @Autowired
//    private AuthenticationManager authenticationManager;
//
//    @Autowired
//    private CustomUserDetailsService customUserDetailsService;
//
//    @Autowired
//    private JWTUtil jwtUtil;
//
//    @RequestMapping(value = "/token", method = RequestMethod.POST)
//    public ResponseEntity<?> generateToken(@RequestBody JWTRequest jwtRequest) throws Exception {
//        System.out.println(jwtRequest.getUsername());
////        try{
////            this.authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(jwtRequest.getUsername(),jwtRequest.getPassword()));
////        }catch (UsernameNotFoundException e){
////            e.printStackTrace();
////            throw new Exception("Bad Credentials");
////        }
//        UserDetails userDetails = this.customUserDetailsService.loadUserByUsername(jwtRequest.getUsername());
//        String token =  this.jwtUtil.generateToken(userDetails);
//        System.out.println("JWT" + token);
//        return  ResponseEntity.ok(new JWTResponse(token));
//    }
//
//}
