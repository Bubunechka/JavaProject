package com.example.service;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.internal.DnsNameResolver;

import java.io.IOException;

public class ServiceApplication {

	public static void main(String[] args) throws IOException, InterruptedException {
	Server server = ServerBuilder.forPort(8080) // "привет" микросервисам
			.addService(new GreetingServiceImpl())
			// добавляем сюда .addService() , в него прописываем все сервисы,
			// которые нам нужны (на тот случай, если у нас много сервисов) и после этого вызываем метод build()
			.build();

	server.start();

		System.out.println("Server started");

		server.awaitTermination();


	}

}
