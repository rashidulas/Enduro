package com.rashidulas.enduro.run;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Repository
public class RunRepository {

    private List<Run> runs = new ArrayList<>();

    List<Run> findAll() {
        return runs;
    };

    Optional<Run> findById(Integer id) {
        return runs.stream()
                .filter(run -> rin.id() == id )
                .findFirst()
    }

    void create(Run run) {
        runs.add(run);
    }

    void update(Run run) {

    }
}
