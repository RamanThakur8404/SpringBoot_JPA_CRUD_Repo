package com.project.service;

import com.project.entity.Artist;
import com.project.repository.IartistRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class artistManagementServiceImplementation implements IartistManagementService{
   @Autowired
    private IartistRepository artistRepo;

    @Override
    public String registerArtist(Artist artist)
    {
     System.out.println("InMemory Proxy obj class name::"+artistRepo.getClass());
    Artist artist1 = artistRepo.save(artist);
    return artist1.getArtistId()==null?"artist is not saved(record not inserted)":"artist is saved(record inserted)";
    }
}
