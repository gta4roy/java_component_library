package com.gta4roy.readconfig;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("This is basic library to read configurations from a file ");

        ReadConfiguration configHandler = new ReadConfiguration("application.properties");
        String rootDir = configHandler.getValue(ReadConfiguration.ROOT_DIR,"defaultRoot");
        String serverPort = configHandler.getValue(ReadConfiguration.SERVER_PORT,"defaultRoot");
        String threadPoolCount = configHandler.getValue(ReadConfiguration.THREAD_POOL_COUNT,"defaultRoot");

        System.out.println("Root DIR "+rootDir);
        System.out.println("ServerPort "+serverPort);
        System.out.println("ThreadPoolCount "+threadPoolCount);

    }
}
