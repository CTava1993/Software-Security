package com.snhu.sslserver;

import java.security.MessageDigest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;

//Christian Tavares || CS305 Software Security 23EW2 || 12/6/2023
//
//This code is supposed to create an encrypted hash key with SHA-256 encryption, then
//print a string with this hash value to the web browser at the domain: https://localhost:8443/hash
//using a created certificate (check src/main/resources).

@SpringBootApplication
public class SslServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SslServerApplication.class, args);
	}

}

@RestController
class ServerController{
	
	@RequestMapping(method = RequestMethod.GET, path = "hash")
	public String myHash(String name) throws NoSuchAlgorithmException {
    	String data = "Christian Tavares";
        String hash = getHash(data);  //Create hash from getHash() function
    	
        return "<p>Data: " + data + "<p>Encryption Type: SHA-256 " + "<p>Hash: " + hash;  //string printed to browser
    }
	
	public String getHash(String name) throws NoSuchAlgorithmException {
		MessageDigest msg1 = MessageDigest.getInstance("SHA-256");
    	byte[] hash =  msg1.digest(name.getBytes(StandardCharsets.UTF_8)); //creates a hash using AES encryption
    	BigInteger number = new BigInteger(1, hash);  
        StringBuilder hexString = new StringBuilder(number.toString(16));  
        while (hexString.length() < 32){  
            hexString.insert(0, '0');  
        }
        
        return hexString.toString();
	}
}