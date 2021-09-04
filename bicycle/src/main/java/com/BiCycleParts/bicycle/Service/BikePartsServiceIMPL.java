package com.BiCycleParts.bicycle.Service;

import com.BiCycleParts.bicycle.dao.BikePartsDAO;
import com.BiCycleParts.bicycle.entity.BikeParts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BikePartsServiceIMPL implements BikePartsService{

    private final BikePartsDAO bikePartsDAO;

    @Autowired
    public BikePartsServiceIMPL(BikePartsDAO bikePartsDAO) {
        this.bikePartsDAO = bikePartsDAO;
    }

    @Override
    public List<BikeParts> findAllParts() {
        return bikePartsDAO.findAllParts();
    }

    @Override
    public Object findById(int thisId) {
        return bikePartsDAO.findById(thisId);
    }

    @Override
    public void saveOrUpdate(BikeParts newParts) {
    bikePartsDAO.saveOrUpdate(newParts);
    }

    @Override
    public void deleteById(int thisId) {
    bikePartsDAO.deleteById(thisId);
    }
}