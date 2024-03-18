package com.evan.example.provider;

import com.evan.evanrpc.registry.LocalRegistry;
import com.evan.evanrpc.server.HttpServer;
import com.evan.evanrpc.server.VertxHttpServer;
import com.evan.example.commom.service.UserService;

public class EasyProviderExample {
    public static void main(String[] args) {
        // 先将服务注册到本地
        LocalRegistry.register(UserService.class.getName(), UserServiceImpl.class);
        // 提供服务
        HttpServer httpServer = new VertxHttpServer();
        httpServer.doStart(8080);
    }
}
