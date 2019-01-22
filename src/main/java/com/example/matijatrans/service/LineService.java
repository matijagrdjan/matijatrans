package com.example.matijatrans.service;

import com.example.matijatrans.model.Trip;
import com.example.matijatrans.repositories.LineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LineService {

    @Autowired
    public LineRepository lineRepository;

    public List<Trip> getlinebyfirstStationAndLastStation(String firstStation, String lastStation){
//        return lineRepository.findAllByFirstStationNameAndLastStationName(firstStation, lastStation).get(0).getTrips();

        return lineRepository.findByFirstStationNameAndLastStationName(firstStation, lastStation).getTrips();

    }
}
