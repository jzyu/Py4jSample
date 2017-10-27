package hello;

import py4j.GatewayServer;

/**
 * Author: jzyu
 * Date  : 2017/10/13
 */
public class Py4jServer {
    public int addition(int first, int second) {
        return first + second;
    }

    public static void main(String[] args) {
        Py4jServer app = new Py4jServer();
        // app is now the gateway.entry_point
        GatewayServer server = new GatewayServer(app);
        server.start();
    }
}
