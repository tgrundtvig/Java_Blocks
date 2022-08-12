package org.abstractica.javablocks.network.impl;


import org.abstractica.javablocks.network.ErrorLog;

import java.io.IOException;

public class ErrorLogImpl implements ErrorLog
{
    private static ErrorLogImpl instance;
    private ErrorLog log;

    public static ErrorLogImpl getInstance()
    {
        if(instance == null)
        {
            instance = new ErrorLogImpl();
        }
        return instance;
    }

    private ErrorLogImpl()
    {
        this.log = new StdError();
    }

    public void setErrorLog(ErrorLog log)
    {
        this.log = log;
    }

    @Override
    public void reportIOException(IOException e)
    {
        log.reportIOException(e);
    }
}
