package cn.programerzhang.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2 // 开启Swagger2
public class SwaggerConfig {

    @Bean //配置Swagger的Docket的Bean实例
    public Docket docket() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                // 是否启动,默认true,false则不能在浏览器中访问,可以根据环境注入
                // .enable(false)
                .select()
                // RequestHandlerSelectors,配置扫描接口的方式
                // basePackage:指定扫描的包
                // any() 扫描全部
                // none() 不扫描
                // withClassAnnotation 扫描类上的注解,参数是一个注解的反射对象
                // withMethodAnnotation 扫描方法上的注解,参数是一个注解的反射对象
                //.apis(RequestHandlerSelectors.withMethodAnnotation(GetMapping.class))
                //.apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
                .apis(RequestHandlerSelectors.basePackage("cn.programerzhang.controller"))
                // 过滤路径
                //.paths(PathSelectors.ant("/pathname/**"))
                .build();
    }

    private ApiInfo apiInfo() {
        Contact contact = new Contact("张太难", "#", "2998637256@qq.com");
        return new ApiInfo(
                "西林吧API文档",
                "西林吧接口文档",
                "1.0",
                "https://xilinba.yuque.com/dashboard",
                contact,
                "Apache 2.0",
                "http://www.apache.org/licenses/LICENSE-2.0",
                new ArrayList());
    }
}
