package org.cs.qa.core;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.time.chrono.IsoEra;

@PropertySource("classpath:${spring.profiles.active}/cherry.core.properties")
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@Component
public class FTPClient {
    boolean connected;

    @Value("${ftpclient.server}")
    String server;

    public FTPClient() {
        System.out.println("FTP client initialize ");
    }

    public void SetServer(String newserver) { server = newserver;}

    public void connect()
    {
        System.out.println("Connecting to FTP Server -" + server);
        connected = true;
    }

    public void disconnect()
    {
        System.out.println("Disconnecting from FTP");
        connected = false;
    }

    public boolean getStatus()
    {
        System.out.println("FTP connection status is connected");
        return connected;
    }
}
