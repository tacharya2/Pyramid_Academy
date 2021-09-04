package com.BiCycleParts.bicycle.Service;
import com.BiCycleParts.bicycle.entity.BikeParts;
import java.util.List;

public interface BikePartsService {
    List<BikeParts> findAllParts();
    Object findById(int thisId);
    void saveOrUpdate(BikeParts newParts);
    void deleteById(int thisId);
}
