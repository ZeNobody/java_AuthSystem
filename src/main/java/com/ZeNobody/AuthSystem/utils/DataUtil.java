package com.ZeNobody.AuthSystem.utils;

import lombok.experimental.UtilityClass;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@UtilityClass
public class DataUtil {

    private final String PATTERN = "yyyy-MM-dd HH:mm:ss";

    public String formatLocalDateTime(LocalDateTime data) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(PATTERN);
        return data.format(formatter);
    }
}
