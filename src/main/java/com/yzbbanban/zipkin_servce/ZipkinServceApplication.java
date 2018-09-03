package com.yzbbanban.zipkin_servce;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import zipkin.server.EnableZipkinServer;

@SpringBootApplication
@EnableZipkinServer
@EnableAutoConfiguration
public class ZipkinServceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZipkinServceApplication.class, args);
	}
}
