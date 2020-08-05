package com.example.simpleservice;

import com.example.simpleservice.dao.ImageDao;
import com.example.simpleservice.model.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SimpleServiceApplication implements CommandLineRunner {

    private ImageDao imageDao;

    @Autowired
    public SimpleServiceApplication(ImageDao imageDao) {
        this.imageDao = imageDao;
    }

    public static void main(String[] args) {
        SpringApplication.run(SimpleServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    	Image image=Image.builder().build();
    	image.setId(1);
    	image.setUrl("demo-url-1");
    	imageDao.save(image);
    	image.setId(2);
    	image.setUrl("demo-url-2");
    	imageDao.save(image);
    	
    }
}