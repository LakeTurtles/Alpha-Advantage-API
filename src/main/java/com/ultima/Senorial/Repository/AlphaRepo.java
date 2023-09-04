package com.ultima.Senorial.Repository;
import com.ultima.Senorial.DataTransfer.AlphaMainObjectResponse;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class AlphaRepo {

    /////////////////////////////////////////////////////////////////////////////////////////////

    private List<AlphaMainObjectResponse> mainResponseList = new ArrayList<>();

    public List<AlphaMainObjectResponse> getMainResponseList() {
        return mainResponseList;
    }


    /////////////////////////////////////////////////////////////////////////////////////////////






}
