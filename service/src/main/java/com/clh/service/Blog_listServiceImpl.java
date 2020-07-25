package com.clh.service;

import com.clh.mapper.Blog_listMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class Blog_listServiceImpl implements Blog_listService {
    @Resource
    private Blog_listMapper blog_listMapper;

    @Override
    public List listC() {
        return blog_listMapper.listC();
    }

    @Override
    public List list(Map map) {
        return blog_listMapper.list(map);
    }
}
