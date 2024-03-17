package com.evan.evanrpc.server;

import io.vertx.core.Vertx;

public class VertxHttpServer implements HttpServer {
    @Override
    public void doStart(int port) {
        // 创建 Vert.x 实例
        Vertx vertx = Vertx.vertx();
        // 创建 http 服务器
        io.vertx.core.http.HttpServer server = vertx.createHttpServer();

        // 以下两个是并行执行的
        // 监听端口并处理请求
        server.requestHandler(new HttpServerHandler());
        // 启动 http 服务器并监听指定端口
        server.listen(port, result -> {
            if (result.succeeded()) {
                System.out.println("Server is now listening on port:" + port);
            } else {
                System.out.println("Failed to start server:" + result.cause());
            }
        });
    }
}
