package com.dev.dear_dungee.dao;

import com.dev.dear_dungee.dto.ShelterDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ShelterDAO {

    @Autowired
    private SqlSession db;

    //검색어로 select
    public List<ShelterDTO> selectShelterListBySw(String search_word){
        return db.selectList("shelter.selectShelterListBySw",search_word);
    }

    //지역별 select
    public List<ShelterDTO> selectAllByAddress(String shelter_address){
        return db.selectList("shelter.selectAllbyAddress",shelter_address);
    }

    //필요물품별 select
    public List<ShelterDTO> selectAllByItem(String item_name){
        return db.selectList("shelter.selectAllbyItem",item_name);
    }

}
