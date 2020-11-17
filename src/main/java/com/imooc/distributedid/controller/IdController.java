package com.imooc.distributedid.controller;

import com.sankuai.inf.leaf.common.Result;
import com.sankuai.inf.leaf.service.SegmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: bizy
 * @date: 2020/11/17 20:46
 */
@RestController
public class IdController {

    @Autowired
    private SegmentService segmentService;

    @GetMapping("segment")
    public Long segment() {
        Long result = segmentService.getId("leaf-segment-test").getId();
        return result;
    }
}
