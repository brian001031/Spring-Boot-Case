package com.suntask.demo.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/collection")
public class DynamicCollectionController
{
    // 注入 MongoTemplate！
    @Autowired
    private MongoTemplate mongoTemplate;

    @GetMapping("/test")
    public String test() {
        System.out.println("Test endpoint hit!");
        return "Test collection success!";
    }

    @GetMapping("/{name}/all")
    public List<?> getCollection(@PathVariable String name) {
        return mongoTemplate.findAll(Object.class, name);
    }

    @GetMapping("/{name}/search")
    public List<?> searchInCollection(@PathVariable String name, @RequestParam String field, @RequestParam String value) {
        System.out.println("查詢 collection：" + name + "，欄位：" + field + "，值：" + value); // debug 用
        Query query = new Query();
        query.addCriteria(Criteria.where(field).is(value));
        return mongoTemplate.find(query, Object.class, name);
    }
}
