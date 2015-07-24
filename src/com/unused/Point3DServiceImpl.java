/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unused;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Resource;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.test.Point3D;

/**
 *
 * @author JustInG
 */
@Service
public class Point3DServiceImpl implements Point3DService {

    @Resource
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Point3D> getListData() {
        List<Point3D> list = new ArrayList<Point3D>();
        
        //list.add(new Point3D(1, 2, 3));
        
        return list;
    }

    @Override
    public void save(Point3D p) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void delete(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
