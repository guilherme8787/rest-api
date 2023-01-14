package com.gwop.restapi.controller;

import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.JSONException;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class GenericControllerTest {

    @Test
    void checkIfHaveHttpOkStatus() throws IOException {
        // arrange
        HttpUriRequest request = new HttpGet("http://127.0.0.1:8080/api/sum/1/2");

        // act
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        // assert
        assertEquals(HttpStatus.SC_OK, httpResponse.getStatusLine().getStatusCode());
    }

    @Test
    void checkIfWrongParameterResultInBadRequest() throws IOException, JSONException {
        // arrange
        HttpUriRequest request = new HttpGet("http://127.0.0.1:8080/api/sum/1/2.5");

        // act
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        // assert
        assertEquals(HttpStatus.SC_BAD_REQUEST, httpResponse.getStatusLine().getStatusCode());
    }

    @Test
    void checkIfSumReturnAValidSum() throws IOException, JSONException {
        // arrange
        HttpUriRequest request = new HttpGet("http://127.0.0.1:8080/api/sum/1/2");

        // act
        HttpResponse httpResponse = HttpClientBuilder.create().build().execute(request);

        String json = EntityUtils.toString(httpResponse.getEntity());
        JSONObject jsonObj = new JSONObject(json);

        // assert
        assertSame(3, jsonObj.get("result"));
    }
}