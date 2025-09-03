package com.suntask.demo.controller;
import java.util.List;
import com.suntask.demo.model.Mixinanode;
import com.suntask.demo.repository.MixinanodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "*") // 前端可連，防止 CORS 問題
@RestController
@RequestMapping("/api/mixinanode")
public class MixinanodeController
{
    @Autowired
    private MixinanodeRepository repository;

    // 取得所有資料
    @GetMapping
    public List<Mixinanode> getAllData() {
        return repository.findAll();  // 查詢整個 collection
    }

    // 新增資料
    @PostMapping
    public Mixinanode addData(@RequestBody Mixinanode data) {
        return repository.save(data);
    }

    //刪除資料(指向id)
    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id) {
        repository.deleteById(id);
    }

    @PutMapping("/{id}")
    public Mixinanode update(@PathVariable String id, @RequestBody Mixinanode data) {
        return repository.findById(id).map(existing -> {
            existing.setParam(data.getParam());
            existing.setValue(data.getValue());
            return repository.save(existing);
        }).orElseThrow(() -> new RuntimeException("ID not found: " + id));
    }

}
