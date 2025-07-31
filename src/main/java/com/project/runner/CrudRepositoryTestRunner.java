package com.project.runner;

import com.project.entity.Artist;
import com.project.service.IartistManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.lang.Exception;
@Component
public class CrudRepositoryTestRunner implements CommandLineRunner {

    @Autowired
    private IartistManagementService artistService;

    @Override
    public void run(String... args) throws Exception{
        try{
        Artist artist = new Artist("deepak","Hero",50000.0);
            String msg = artistService.registerArtist(artist);
            System.out.println(msg);
        }//try
        catch(Exception exception){
            exception.printStackTrace();
        }//catch
    }
}
