package com.metro.eagle.energymeter.Logs;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LogsRepository extends JpaRepository<Logs, Long> {
    //@Query("SELECT m FROM Metrics m")
    //Optional<Metrics> getLatest(List<Metrics> metrics);
}
