package cn.programerzhang.controller;

import cn.programerzhang.mapper.ValidationMessageMapper;
import cn.programerzhang.pojo.ValidationMessage;
import com.google.gson.Gson;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api(tags="验证消息接口")
@RestController
public class ValidationMessageController {
    @Autowired
    ValidationMessageMapper validationMessageMapper;
    private final Gson gson = new Gson();

    @GetMapping("/getValidationMessages")
    public String getValidationMessages() {
        List<ValidationMessage> validationMessages = validationMessageMapper.selectList(null);
        return gson.toJson(validationMessages);
    }

}
