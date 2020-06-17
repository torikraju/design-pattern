package com.learnDesignPattern.proxy.challenge;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public interface Internet {
    void connectTo(String serverHost) throws Exception;
}

class RealInternet implements Internet {

    private static final Logger logger = LoggerFactory.getLogger(RealInternet.class);

    @Override
    public void connectTo(String serverHost) throws Exception {
        logger.info("connect to {}", serverHost);
    }
}

class ProxyInternet implements Internet {

    private static final Logger logger = LoggerFactory.getLogger(RealInternet.class);

    private Internet realInternet = new RealInternet();
    private static List<String> bannedSites;

    static {
        bannedSites = new ArrayList<>();
        bannedSites.add("facebook.com");
        bannedSites.add("twitter.com");
    }


    @Override
    public void connectTo(String serverHost) throws Exception {
        if (bannedSites.contains(serverHost)) {
            throw new Exception("access denied");
        }
        realInternet.connectTo(serverHost);
    }
}




