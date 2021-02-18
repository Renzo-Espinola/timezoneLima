package com.exa.timezone.service;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;


@Service
public class DateService {

    private DateService(){}

    public static String obtenerFechaHora() {
        ZoneId zoneId = ZoneId.of("America/Lima");
        ZonedDateTime zonedDateTime = ZonedDateTime.now(zoneId);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("yyyyMMddHHmmssSS"));
        String formattedString = zonedDateTime.format(formatter);
        return (formattedString);
    }
}

