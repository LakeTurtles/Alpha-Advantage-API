package com.ultima.Senorial.Service;
import com.ultima.Senorial.DataTransfer.AlphaMainObjectResponse;
import com.ultima.Senorial.Repository.AlphaRepo;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;

@Service
public class AlphaAdvantageIntegration {
    @Autowired
    private AlphaRepo alphaRepo;


    /////////////////////////////////////////////////////////////////////////////////////////////////

    @Test
    public void callApi() {
        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
                .queryParam("function", "TIME_SERIES_INTRADAY")
                .queryParam("symbol", "TSLA")
                .queryParam("interval", "5min")
                .queryParam("apikey", "")     // Don't Forget to Insert Your API Key
                .build()
                .toUri();

        String response = rt.getForObject(uri, String.class);

        System.out.println(response);

    }


    /////////////////////////////////////////////////////////////////////////////////////////////



    @Test
    public ResponseEntity<AlphaMainObjectResponse> callApi2() {
        RestTemplate rt = new RestTemplate();

        URI uri = UriComponentsBuilder.fromHttpUrl("https://www.alphavantage.co/query")
                .queryParam("function", "TIME_SERIES_INTRADAY")
                .queryParam("symbol", "TSLA")
                .queryParam("interval", "5min")
                .queryParam("apikey", "")  // Don't Forget to Insert Your API Key
                .build()
                .toUri();




        AlphaMainObjectResponse mainResponse = rt.getForObject(uri, AlphaMainObjectResponse.class);
        alphaRepo.getMainResponseList().add(mainResponse);



//          System.out.println(mainResponse);
//          System.out.println(response);


    ResponseEntity<AlphaMainObjectResponse> response = rt.getForEntity(uri, AlphaMainObjectResponse.class);

    return response;

    }


}
