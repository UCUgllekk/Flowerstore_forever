package ucu.edu.apps.flowerstoreforever.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import ucu.edu.apps.flowerstoreforever.Flower.Flower;
import ucu.edu.apps.flowerstoreforever.Flower.FlowerService;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/api/flowers")
public class FlowerController {
    private FlowerService flowerService;

    @Autowired
    public FlowerController(FlowerService currentFlowerService) {
        this.flowerService = currentFlowerService;
    }

    @GetMapping("/list")
    public List<Flower> getFlower() {
        return flowerService.getFlower();
    }

    @PostMapping("/add")
    public void add(@RequestBody Flower flower) {
        flowerService.add(flower);
    }
}
