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
 * �����Կ�����
 */
@Controller

@RequestMapping("controller")
public class IndexController {

    @Resource
    private IndexService indexService;

    /**
     * @return ����һ����ͨString�ַ���
     */
    @ResponseBody
    @RequestMapping("index")
    public String index() {
        if (indexService.index()) {
            return "Controller���Գɹ���";
        } else {
            return "Controller����ʧ�ܡ�";
        }


    }

    /**
     * @param info ǰ̨����info��Ϣ
     * @return ����ҳ��
     */
    @RequestMapping("index2")
    public String index2(
            Model model
            , String info
    ) {
        if (indexService.index()) {
            model.addAttribute("state", "Controller���Գɹ���");
            model.addAttribute("info", info);
        } else {
            model.addAttribute("state", "Controller����ʧ�ܡ�");
            model.addAttribute("info", info);
        }
        return "index2";

    }

    /**
     * @return ����ҳ��
     */
    @ResponseBody
    @RequestMapping("dbTest")
    public String dbTest(
    ) {
        TheTest t = indexService.dbTest();
        return "The Value for db is" + t + "��The db test is success;";
    }

}
