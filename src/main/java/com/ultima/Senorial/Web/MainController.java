package com.ultima.Senorial.Web;

import com.ultima.Senorial.DataTransfer.AlphaMainObjectResponse;
import com.ultima.Senorial.Repository.AlphaRepo;
import com.ultima.Senorial.Service.AlphaAdvantageIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MainController {

    @Autowired
    private AlphaRepo alphaRepo;

    @Autowired
    private AlphaAdvantageIntegration mainApiCall;


    /////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("")
    public List<AlphaMainObjectResponse> getMainList(){
        mainApiCall.callApi2();

        return alphaRepo.getMainResponseList();
    }// If You Refresh the page the Same Object will be added to the List because the Repository is Not A Set Repo



    ///////////////////////////////////////////////////////////////////////////////////////////


    @GetMapping("raw")
    public ResponseEntity<AlphaMainObjectResponse> getRawResponse(){

        return mainApiCall.callApi2();

    }







}
