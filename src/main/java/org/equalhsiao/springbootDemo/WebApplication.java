package org.equalhsiao.springbootDemo;

import java.net.MalformedURLException;
import java.net.URL;
import java.nio.file.Paths;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import io.github.swagger2markup.Swagger2MarkupConfig;
import io.github.swagger2markup.Swagger2MarkupConverter;
import io.github.swagger2markup.builder.Swagger2MarkupConfigBuilder;
import io.github.swagger2markup.markup.builder.MarkupLanguage;

//這邊使用 Java Class 作為設定，而非XML
@Configuration
//啟用 Spring Boot 自動配置，將自動判斷專案使用到的套件，建立相關的設定。
@EnableAutoConfiguration
//自動掃描 Spring Bean 元件
@ComponentScan( basePackages = {"org.equalhsiao.springbootDemo"} )
public class WebApplication extends SpringBootServletInitializer {
	@Override
  protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	  return application.sources(WebApplication.class);
  }

  public static void main(String args[]){
      //執行SpringApplication
      SpringApplication.run(WebApplication.class, args);
  }
}