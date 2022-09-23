package nl.helloWorld.helloworld.domain;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/counter")
public class CounterController {
    Counter counter;

    CounterController(){
        counter = new Counter();
    }

    @GetMapping
    public int getCount(){
        return counter.getCounter();
    }

    @PatchMapping()
    public int addNumber(){
        return counter.addNumber();
    }
}
