/*
 * Price Alerting API For Digital Portals
 * The Price Alerting API is designed to inform the users of an application directly about important changes in the data on the platform. The endpoint group *basic price alerting* deals with generation of alerts based on current price data. For notations, users can define an upper or lower limit and choose on which price type those limit conditions apply.  Alerting uses the concepts of triggers and alerts.  A trigger is an entity that is set up by an application to watch a certain condition in the market data around a financial instrument. The standard conditions that can be applied are lower limit and upper limit for the value of the price for a given financial instrument.  When the condition of a trigger is met, an alert is created. Each alert thus represents one event where a trigger condition was met.  An application can learn about the creation of alerts in two ways: The application can actively request the list of alerts (pull approach) or it can subscribe to the list of existing alerts. If a new alert is created, that list changes and the application is notified about the new alert with an update that contains the details on the new alert (push approach).  The API supports both approaches. The push approach is realized most easily by using the subscription support that the client libraries provide.  See the [Quotes API for Digital Portals](https://developer.factset.com/api-catalog/quotes-api-digital-portals) for access to detailed price information.  Note: As part of the general trial access, endpoints to write data are excluded. For a description of the full alerting API, please work with a FactSet consultant and see https://endpointreference.factset.com. 
 *
 * The version of the OpenAPI document: 3.0.0
 * Contact: api@factset.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.factset.sdk.RealTimePriceAlerting.auth;

import com.factset.sdk.RealTimePriceAlerting.Pair;
import com.factset.sdk.RealTimePriceAlerting.ApiException;
import com.github.scribejava.core.builder.ServiceBuilder;
import com.github.scribejava.core.builder.api.DefaultApi20;
import com.github.scribejava.core.exceptions.OAuthException;
import com.github.scribejava.core.model.OAuth2AccessToken;
import com.github.scribejava.core.oauth.OAuth20Service;

import javax.ws.rs.core.UriBuilder;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URI;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.logging.Level;
import java.util.logging.Logger;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class OAuth implements Authentication {
    private static final Logger log = Logger.getLogger(OAuth.class.getName());

    private String tokenUrl;
    private String absoluteTokenUrl;
    private OAuthFlow flow = OAuthFlow.application;
    private OAuth20Service service;
    private DefaultApi20 authApi;
    private String scope;
    private String username;
    private String password;
    private String code;
    private volatile OAuth2AccessToken accessToken;

    public OAuth(String basePath, String tokenUrl) {
        this.tokenUrl = tokenUrl;
        this.absoluteTokenUrl = createAbsoluteTokenUrl(basePath, tokenUrl);
        authApi = new DefaultApi20() {
            @Override
            public String getAccessTokenEndpoint() {
              return absoluteTokenUrl;
            }

            @Override
            protected String getAuthorizationBaseUrl() {
              throw new UnsupportedOperationException("Shouldn't get there !");
            }
        };
    }

    private static String createAbsoluteTokenUrl(String basePath, String tokenUrl) {
        if (!URI.create(tokenUrl).isAbsolute()) {
            try {
                return UriBuilder.fromPath(basePath).path(tokenUrl).build().toURL().toString();
            } catch (MalformedURLException e) {
                log.log(Level.SEVERE, "Couldn't create absolute token URL", e);
            }
        }
        return tokenUrl;
    }

    @Override
    public void applyToParams(
        List<Pair> queryParams,
        Map<String, String> headerParams,
        Map<String, String> cookieParams,
        String payload,
        String method,
        URI uri)
        throws ApiException {

        if (accessToken == null) {
            obtainAccessToken(null);
        }
        if (accessToken != null) {
            headerParams.put("Authorization", "Bearer " + accessToken.getAccessToken());
        }
    }

    public OAuth2AccessToken renewAccessToken() throws ApiException {
        String refreshToken = null;
        if (accessToken != null) {
            refreshToken = accessToken.getRefreshToken();
            accessToken = null;
        }
        return obtainAccessToken(refreshToken);
    }

    public synchronized OAuth2AccessToken obtainAccessToken(String refreshToken) throws ApiException {
        if (service == null) {
            log.log(Level.FINE, "service is null in obtainAccessToken.");
            return null;
        }
        try {
            if (refreshToken != null) {
                return service.refreshAccessToken(refreshToken);
            }
        } catch (OAuthException | InterruptedException | ExecutionException | IOException e) {
            log.log(Level.FINE, "Refreshing the access token using the refresh token failed", e);
        }
        try {
            switch (flow) {
                case password:
                    if (username != null && password != null) {
                        accessToken = service.getAccessTokenPasswordGrant(username, password, scope);
                    }
                    break;
                case accessCode:
                    if (code != null) {
                        accessToken = service.getAccessToken(code);
                        code = null;
                    }
                    break;
                case application:
                    accessToken = service.getAccessTokenClientCredentialsGrant(scope);
                    break;
                default:
                    log.log(Level.SEVERE, "Invalid flow in obtainAccessToken: " + flow);
            }
        } catch (OAuthException | InterruptedException | ExecutionException | IOException e) {
            throw new ApiException(e);
        }
        return accessToken;
    }

    public OAuth2AccessToken getAccessToken() {
        return accessToken;
    }

    public OAuth setAccessToken(OAuth2AccessToken accessToken) {
        this.accessToken = accessToken;
        return this;
    }

    public OAuth setAccessToken(String accessToken) {
        this.accessToken = new OAuth2AccessToken(accessToken);
        return this;
    }

    public OAuth setScope(String scope) {
       this.scope = scope;
       return this;
    }

    public OAuth setCredentials(String clientId, String clientSecret, Boolean debug) {
        if (Boolean.TRUE.equals(debug)) {
            service = new ServiceBuilder(clientId)
                .apiSecret(clientSecret).debug()
                .build(authApi);
        } else {
            service = new ServiceBuilder(clientId)
                .apiSecret(clientSecret)
                .build(authApi);
        }
        return this;
    }

    public OAuth usePasswordFlow(String username, String password) {
        this.flow = OAuthFlow.password;
        this.username = username;
        this.password = password;
        return this;
    }

    public OAuth useAuthorizationCodeFlow(String code) {
        this.flow = OAuthFlow.accessCode;
        this.code = code;
        return this;
    }

    public OAuth setFlow(OAuthFlow flow) {
        this.flow = flow;
        return this;
    }

    public void setBasePath(String basePath) {
        this.absoluteTokenUrl = createAbsoluteTokenUrl(basePath, tokenUrl);
    }
}