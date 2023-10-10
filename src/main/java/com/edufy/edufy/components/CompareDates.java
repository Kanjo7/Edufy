package com.edufy.edufy.components;

import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;

@Component
public class CompareDates {


    public CompareDates() {
    }

    public <T> void sortByDate(List<T> objects, String releaseDate) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        Collections.sort(objects, (obj1, obj2) -> {
            try {
                String dateStr1 = (String) obj1.getClass().getMethod(releaseDate).invoke(obj1);
                String dateStr2 = (String) obj2.getClass().getMethod(releaseDate).invoke(obj2);

                LocalDate date1 = LocalDate.parse(dateStr1, formatter);
                LocalDate date2 = LocalDate.parse(dateStr2, formatter);

                return date2.compareTo(date1);
            } catch (Exception e) {
                e.printStackTrace();
                return 0;
            }
        });
    }
}
