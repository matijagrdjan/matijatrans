package com.example.matijatrans;

import com.example.matijatrans.model.Line;
import com.example.matijatrans.model.Trip;
import com.example.matijatrans.repositories.LineRepository;
import com.example.matijatrans.repositories.TripRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MatijatransApplicationTests {

    @Autowired
    private TripRepository repositories;

    @Autowired
    private LineRepository lineRepository;

    @Test
    public void contextLoads() {
    }

    @Test
    public void test(){
//        Iterable<Line> all = lineRepository.findAllByFirstStationIdAndLastStationId(1L, 3L);
//        System.out.println();

        List<Trip> all = lineRepository.findAllByFirstStationNameAndLastStationName("zagreb", "karlovac").get(0).getTrips();
        System.out.println();



    }

}

