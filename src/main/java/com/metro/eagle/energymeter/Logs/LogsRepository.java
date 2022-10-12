package com.metro.eagle.energymeter.Logs;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Long> {
    //@Query("SELECT m FROM Metrics m")
    List<Logs> findFirst12ByOrderByIndexNumDesc();
    //findFirst5ByOrderByPublicationDateDesc()
}
