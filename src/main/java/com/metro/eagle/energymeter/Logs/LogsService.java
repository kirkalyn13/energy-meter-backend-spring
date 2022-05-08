package com.metro.eagle.energymeter.Logs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogsService {
    private final LogsRepository logsRepository;

    @Autowired
    public LogsService(LogsRepository logsRepository) {
        this.logsRepository = logsRepository;
    }

    public List<Logs> getMetrics(){
        return logsRepository.findFirst12ByOrderByIndexNumDesc();
    }
}
