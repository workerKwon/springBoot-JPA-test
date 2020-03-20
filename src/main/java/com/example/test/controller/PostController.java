package com.example.test.controller;

import com.example.test.model.InfoVO;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class PostController {

    @RequestMapping(method = RequestMethod.POST, path = "/postRequestApi")
    public InfoVO postRequestApi(@RequestBody InfoVO infoVO){ // post 방식은 data를 body에 받아오기 때문에 RequestBody 어노테이션을 사용한다.
        return infoVO;
    }

    @RequestMapping(method = RequestMethod.POST, path = "/postRequestAnotherApi")
    public InfoVO postRequestAnotherApi(InfoVO infoVO){ // ReqyestBody 어노테이션을 붙여주지 않으니까 body에 넣어준 데이터가 null로 온다.
        return infoVO;
    }
}
