package com.clh.controller;

import com.clh.service.Blog_listService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class Blog_listController {
    @Resource
    private Blog_listService blog_listService;

    @RequestMapping("listC")
    public String list(Model model){
       List list =  blog_listService.listC();
       model.addAttribute("list",list);
       return "listc";
    }

   

    @RequestMapping("list")
    public String list(Model model,Integer cid, String mohu1, @RequestParam(defaultValue = "1")Integer cpage){
        Map map = new HashMap();
        map.put("mohu1",mohu1);
        map.put("cid",cid);
        PageHelper.startPage(cpage,3);
        List list =  blog_listService.list(map);
        PageInfo pageInfo = new PageInfo(list);

        model.addAttribute("list",list);
        model.addAttribute("map",map);
        model.addAttribute("p",pageInfo);
        return "list";
    }


}
