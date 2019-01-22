package com.example.matijatrans.repositories;

import com.example.matijatrans.model.Line;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface LineRepository extends CrudRepository<Line, Long> {

    List<Line> findAllByFirstStationIdAndLastStationId(Long firstStationId, Long lastStationId);
    List<Line> findAllByFirstStationNameAndLastStationName(String firstStation, String lastStation);

    Line findByFirstStationNameAndLastStationName(String firstStation, String lastStation);


}
