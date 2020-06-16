package com.learnDesignPattern.singleton.challenge;

import com.learnDesignPattern.singleton.lazyInitialization.TestSingleton;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MakeOneCaptain {

    private MakeOneCaptain() {
    }

    private static class SingletonHelper {
        private static final MakeOneCaptain _captain = new MakeOneCaptain();

    }
    public static MakeOneCaptain getCaptain() {
        return SingletonHelper._captain;
    }
    
}
