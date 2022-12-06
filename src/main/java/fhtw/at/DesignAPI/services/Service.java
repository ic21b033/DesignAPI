package fhtw.at.DesignAPI.services;

import lombok.Data;

import java.util.HashMap;
import java.util.Map;

import lombok.Data;

        import java.util.HashMap;
        import java.util.Map;
@Data

public class Service {

    public static Map<String, String> colors = new HashMap<String, String>() {{
       //AC 1
        put("red", "green");
        put("green", "red");
    }};

}