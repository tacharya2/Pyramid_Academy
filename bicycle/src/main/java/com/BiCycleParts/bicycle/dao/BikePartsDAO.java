package com.BiCycleParts.bicycle.dao;

import com.BiCycleParts.bicycle.entity.BikeParts;

import java.util.List;

// 3. DAO
//       - Interface dao (defines all functions with their data type
public interface BikePartsDAO {
    List<BikeParts> findAllParts();
    Object findById(int thisId);
    void saveOrUpdate(BikeParts newParts);
    void deleteById(int thisId);
}
