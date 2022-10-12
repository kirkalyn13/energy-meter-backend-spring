package com.metro.eagle.energymeter.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.metro.eagle.energymeter.entity.ELogs;
import com.metro.eagle.energymeter.service.ILogsService;
import com.metro.eagle.energymeter.service.LogsService;

@RestController
@RequestMapping(path = "api/v1/")
public class LogsController {
    private final ILogsService logsService;

    @Autowired
    public LogsController(LogsService logsService) {
        this.logsService = logsService;
    }

    @GetMapping("/metrics")
    public List<ELogs> getMetrics(){
        return logsService.getMetrics();
    }
}
