package com.edufy.edufy.services;

import com.edufy.edufy.components.CompareDates;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompareDatesService {

    @Autowired
    private CompareDates compareDates;

    public CompareDatesService(){}

    public List<Object> sortReleaseDates(List<Object> obj, String releaseDate){

        compareDates.sortByDate(obj, releaseDate);

        return obj;
    }
}
