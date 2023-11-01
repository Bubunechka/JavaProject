package com.example.service;

import com.example.grpc.GreetingServiceGrpc;
import com.example.grpc.GreetingServiceOuterClass;
import io.grpc.stub.StreamObserver;

public class GreetingServiceImpl extends GreetingServiceGrpc.GreetingServiceImplBase {

    @Override // это метод, который мы будем реализовывать (те самые методы с питона в логике проекта(??)...)
    public void greeting(GreetingServiceOuterClass.HelloRequest request,
                         StreamObserver<GreetingServiceOuterClass.HelloResponse> responseObserver){ // на респонсе мы вызываем методы и каждый вызов он передает на клиента

        System.out.println(request); // то, что придёт от клиента

        GreetingServiceOuterClass.HelloResponse response = GreetingServiceOuterClass.
                HelloResponse.newBuilder().setGreeting("Hello from server. It works, " + request.getName())
                .build();
        //когда мы получаем этот builder, мы можем начать конструировать наш response.
        // если бы было множество полей, мы бы нова сделали set используя еще одно поле
        // и тд пока не закончим полностью конструировать наш response

        responseObserver.onNext(response);

        responseObserver.onCompleted();

    }
}
