package com.metro.eagle.energymeter.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.metro.eagle.energymeter.dao.ILogsDao;
import com.metro.eagle.energymeter.entity.ELogs;

@Service
public class LogsService implements ILogsService{
    private final ILogsDao logsDao;

    @Autowired
    public LogsService(ILogsDao logsDao) {
        this.logsDao = logsDao;
    }

    public List<ELogs> getMetrics(){
        return logsDao.findFirst12ByOrderByIndexNumDesc();
    }
}
