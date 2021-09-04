package com.BiCycleParts.bicycle.Controller;

import com.BiCycleParts.bicycle.Service.BikePartsService;
import com.BiCycleParts.bicycle.entity.BikeParts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = { "http://localhost:3000"})
@RestController
public class BikePartsController {
    private final BikePartsService bikePartsService;

    @Autowired
    public BikePartsController(@Qualifier("bikePartsServiceIMPL") BikePartsService bikePartsService) {
        // @Qualifier is to grant preference while ambiguity.
        this.bikePartsService = bikePartsService;
    }
    //http://localhost:8081/addParts
    @PostMapping("/addParts")
    public BikeParts addBikeParts(@RequestBody BikeParts bikeParts){
       bikeParts.setId(0);
        bikePartsService.saveOrUpdate(bikeParts);
        return bikeParts;
    }

    //http://localhost:8081/getAllParts
    @GetMapping("/getAllParts")
    public List<BikeParts> findAll(){
        return bikePartsService.findAllParts();
    }
    // http://localhost:8081/updateParts
    @PutMapping("/updateParts")
    public BikeParts updateBikeParts(@RequestBody BikeParts updateBikeParts){
         bikePartsService.saveOrUpdate(updateBikeParts);
         return updateBikeParts;
    }
    // http://localhost:8081/deleteParts
    @DeleteMapping("/deleteParts/{partsId}")
    public String deleteBikeParts(@PathVariable int partsId){
        bikePartsService.deleteById(partsId);
        return "Removed info of id: " + partsId;
    }
}