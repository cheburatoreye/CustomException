package com.company;

import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.UUID;

public class WrongUserData extends RuntimeException{
    private  String text;
    private  UUID uuid;

    public WrongUserData(String userdata) {
        this.text = userdata;
       uuid=UUID.randomUUID();
    }

    @Override
    public String getMessage() {
        return text+"not correct-try again" +
                ",unique uuid code = "+uuid.toString()+" time: "+ LocalTime.now().truncatedTo(ChronoUnit.MILLIS).toString();
    }

    @Override
    public String toString() {
        return super.toString();
    }


}
