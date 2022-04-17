package com.sh.casestudy;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PackageController {
    private final PackageRepository repository;
    private final Producer producer;
    
    PackageController(PackageRepository repository, Producer producer){
        this.repository = repository;
        this.producer = producer;
    }
    
    @PostMapping("/kafka/bootstrap")
    List<MappedPackage> sendAll(){
        List<Package> packageList = repository.findAllThoseNotCancelled();
        List<MappedPackage> mpList = new ArrayList<MappedPackage>();
        for(Package p : packageList){
            mpList.add(new MappedPackage(p));
        }
        this.producer.sendMessage(mpList);
        return mpList;
    }

    @PostMapping("/kafka/send/{packageId}")
    List<MappedPackage> sendById(Long id){
        List<Package> packageList = repository.findPackageById(id);
        if(!packageList.isEmpty()){
            List<MappedPackage> mpList = new ArrayList<MappedPackage>();
            mpList.add(new MappedPackage(packageList.get(0)));
            this.producer.sendMessage(mpList);
            return mpList;
        }
        else{
            this.producer.sendMessage(new ArrayList<MappedPackage>());
            return new ArrayList<MappedPackage>();
        }
    }
}
