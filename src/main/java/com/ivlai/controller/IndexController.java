package com.ivlai.controller;

import com.ivlai.entity.TheTest;
import com.ivlai.service.IndexService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * 主测试控制器
 */
@Controller

@RequestMapping("controller")
public class IndexController {

    @Resource
    private IndexService indexService;

    /**
     * @return 返回一段普通String字符串
     */
    @ResponseBody
    @RequestMapping("index")
    public String index() {
        if (indexService.index()) {
            return "Controller测试成功。";
        } else {
            return "Controller测试失败。";
        }


    }

    /**
     * @param info 前台传入info信息
     * @return 测试页面
     */
    @RequestMapping("index2")
    public String index2(
            Model model
            , String info
    ) {
        if (indexService.index()) {
            model.addAttribute("state", "Controller测试成功。");
            model.addAttribute("info", info);
        } else {
            model.addAttribute("state", "Controller测试失败。");
            model.addAttribute("info", info);
        }
        return "index2";

    }

    /**
     * @return 测试页面
     */
    @ResponseBody
    @RequestMapping("dbTest")
    public String dbTest(
    ) {
        TheTest t = indexService.dbTest();
        return "The Value for db is" + t + "。The db test is success;";
    }

}
