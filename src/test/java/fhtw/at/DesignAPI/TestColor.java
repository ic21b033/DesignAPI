package fhtw.at.DesignAPI;

import fhtw.at.DesignAPI.services.Service;
import org.junit.jupiter.api.Test;

import java.awt.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class TestColor {
    @Test
    void findColorTrue(){
        assertEquals("red", DesignApiApplication.findColor("green"));
    }

    @Test
    void findColorFalse(){
        assertNotEquals("red",DesignApiApplication.findColor("purpel"));
    }
}
