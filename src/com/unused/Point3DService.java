/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unused;

import java.util.List;

import com.test.Point3D;

/**
 *
 * @author JustInG
 */

public interface Point3DService {
    
  List<Point3D> getListData();

  void save(Point3D p);

  void delete(int id);
}
