package com.logs.jon.logs.service.impl;

import com.logs.jon.logs.service.Logger;

public class ConsolaLogs implements Logger {
    private final String name;

    public ConsolaLogs(String name) {
        this.name = name;
    }

    private void log(String level, String message) {
        System.out.printf("[%s] %s - %s%n", level, name, message);
    }

    @Override
    public void debug(String message) {
        log("DEBUG", message);
    }

    @Override
    public void info(String message) {
        log("INFO", message);
    }

    @Override
    public void warn(String message) {
        log("WARNING", message);
    }

    @Override
    public void error(String message, Throwable throwable) {
        log("ERROR", message);
    }
}
