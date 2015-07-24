/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unused;

import java.util.List;
import javax.annotation.Resource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.test.Point3D;

/**
 *
 * @author JustInG
 */
@Controller
@RequestMapping(value = "/point3d")
public class Point3DController {

    @Resource
    private Point3DService point3DService;

    @RequestMapping(method = RequestMethod.GET)
    public String getConfigView() {
        return "point3D";
    }

    @RequestMapping(value = "data", produces = {"application/json"}, method = RequestMethod.GET)
    @ResponseBody
    public List<Point3D> getPointData(Model model) {
        return point3DService.getListData();
    }

    @RequestMapping("helloWorld")
    public String helloWorld(Model model) {
        model.addAttribute("message", "Hello World!");
        return "helloWorld mother fucker";
    }

    @RequestMapping(value = "test", produces = {"application/json"}, method = RequestMethod.GET)
    @ResponseBody
    public String getString() {
        return "this is my motherfucking string";
    }

    @RequestMapping(value = "save", method = RequestMethod.POST)
    public void saveEmployee(@RequestBody final Point3D p) {
        point3DService.save(p);
    }

    @RequestMapping(value = "delete", method = RequestMethod.POST)
    public void deleteEmployee(@RequestBody final Point3D p) {
        point3DService.delete(p.getId());
    }
}
