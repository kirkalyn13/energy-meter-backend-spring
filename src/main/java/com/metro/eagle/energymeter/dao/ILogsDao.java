package com.metro.eagle.energymeter.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.metro.eagle.energymeter.entity.ELogs;

@Repository
public interface ILogsDao extends JpaRepository<ELogs, Long> {
    //@Query("SELECT m FROM Metrics m")
    List<ELogs> findFirst12ByOrderByIndexNumDesc();
    //findFirst5ByOrderByPublicationDateDesc()
}
