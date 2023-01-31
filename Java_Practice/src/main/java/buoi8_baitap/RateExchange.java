package buoi8_baitap;

import java.util.HashMap;

public class RateExchange {
    public static void main(String[] args) {
        HashMap<String,Object> myMap = new HashMap<String, Object>();
        myMap.put("motd","{\n" +
                "        \"msg\": \"If you or your company use this project or like what we doing, please consider backing us so we can continue maintaining and evolving this project.\",\n" +
                "        \"url\": \"https://exchangerate.host/#/donate\"\n" +
                "    }");
        myMap.put("success",true);
        //....
        System.out.println(myMap.get("HV001"));
    }
}
