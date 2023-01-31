package buoi8_baitap;


import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class GetDataAPI {
    public static void main(String[] args) {
//        //get data from this API https://api.exchangerate.host/latest
//        RestTemplate restTemplate = new RestTemplate();
//        String rateExchangeUrl = "https://api.exchangerate.host/latest";
//        ResponseEntity<String> response = restTemplate.getForEntity(rateExchangeUrl, String.class);
//
//        try {
//            ObjectMapper mapper = new ObjectMapper();
//            Map<String,Object> map = mapper.readValue(response.getBody(), Map.class);
//            LinkedHashMap<String, Double> myRates = (LinkedHashMap<String, Double>) map.get("rates");
//
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Muốn đổi bao nhiêu tiền? ");
//            String soTien = sc.nextLine();
//
//            System.out.println("Nhập đơn vị chuyển đổi từ: ");
//            String fromUnit = sc.nextLine();
//
//            System.out.println("Nhập đơn vị chuyển đổi đến: ");
//            String toUnit = sc.nextLine();
//
//            double result =Double.parseDouble(soTien) *( (myRates.get(toUnit))/(myRates.get(fromUnit)) );
//            System.out.println(result);
//            System.out.println(map.get("date"));
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
    }
}
