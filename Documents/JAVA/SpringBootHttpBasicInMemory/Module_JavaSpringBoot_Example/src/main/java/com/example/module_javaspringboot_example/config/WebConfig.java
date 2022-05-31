package com.example.module_javaspringboot_example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.nio.file.Path;
import java.nio.file.Paths;

@Configuration
public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        Path pathStatic = Paths.get("./src/main/resources/static");
        String filePathStatic = pathStatic.toFile().getAbsolutePath();
        Path pathTemplates = Paths.get("./src/main/resources/templates");
        String filePathTemplates = pathTemplates.toFile().getAbsolutePath();

        registry.addResourceHandler("/css/**").addResourceLocations("file://" +filePathStatic+"/css/");
        registry.addResourceHandler("/js/**").addResourceLocations("file://" +filePathStatic+"/js/");
        registry.addResourceHandler("/images/**").addResourceLocations("file://" +filePathStatic+"/images/");

//        registry.addResourceHandler("/fragment/**").addResourceLocations("file://" +filePathTemplates+"/fragment/");
    }
}
