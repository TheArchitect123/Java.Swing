package com.dg.server.dto;

//The access token cached into the database engine (This will be used to allow the app to access the backend). 
//If the user fails to authenticate, they will default to the login screen
public class TokenDto {
	//Access Token Information
    public String accessToken;
    public String refreshToken;
    public String authorizationHeader;

    //Expiration -- If Expired make sure to regenerate this object through the app, to avoid login redirects
    public String expiresOnUtc;

    public String userId;
    public String firstName;
    public String lastName;      
	
}
