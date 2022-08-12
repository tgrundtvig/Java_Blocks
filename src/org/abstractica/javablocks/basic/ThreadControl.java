package org.abstractica.javablocks.basic;

public interface ThreadControl
{
    public void start();
    public void stopGracefully() throws InterruptedException;
    public void stopNow() throws InterruptedException;
    public boolean isRunning();
}
