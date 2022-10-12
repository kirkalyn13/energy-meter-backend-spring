package com.metro.eagle.energymeter.service;

import java.util.List;

import com.metro.eagle.energymeter.entity.ELogs;

public interface ILogsService {
    List<ELogs> getMetrics();
}
