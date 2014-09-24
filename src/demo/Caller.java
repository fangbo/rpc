package demo;

import ipc.RPC;

import java.net.InetSocketAddress;

import conf.Configuration;


public class Caller {

    public static void main(String[] args) throws Exception {
        ServiceProtocol service = (ServiceProtocol)RPC.getProxy(ServiceProtocol.class, 1, new InetSocketAddress("127.0.0.1", 3380), new Configuration());
        System.out.println(service.helloWorld());
    }
}