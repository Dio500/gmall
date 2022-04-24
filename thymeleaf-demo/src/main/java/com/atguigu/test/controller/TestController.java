package com.atguigu.test.controller;

import com.atguigu.test.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class TestController {

    /**
     * 测试
     * @return
     */
    @GetMapping(value = "/test")
    public String test(Model model){
        //普通文本的输出
        model.addAttribute("abc", "hello world!");
        //文本输出带html标签
        model.addAttribute("aaa", "hello <font style='color:red'>world!</font>");

        //构建list
        List<User> userList = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            User user = new User();
            user.setId(i);
            user.setName("尚硅谷" + i);
            user.setAddress("深圳" + i);
            userList.add(user);
        }
        model.addAttribute("userList", userList);
        //日期
        model.addAttribute("testDate", new Date());
        //条件判断
        model.addAttribute("age", 18);
        //map输出
        Map<String,String> map = new HashMap<>();
        map.put("id","123");
        map.put("name","测试");
        map.put("phone","11111111111111111111");
        model.addAttribute("map", map);
        //跳转连接
        model.addAttribute("url", "/jump");
        //图片显示
        model.addAttribute("image", "https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fpic21.nipic.com%2F20120606%2F5137861_093119370162_2.jpg&refer=http%3A%2F%2Fpic21.nipic.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1636869271&t=7ce2fb93954336f9fed7c4039384ef3f");
        return "test";
    }

    /**
     * 跳转到百度去
     * @param username
     * @param password
     * @return
     */
    @GetMapping(value = "/jump")
    public String jump(String username, String password){
        System.out.println(username);
        System.out.println(password);
        return "redirect:http://www.baidu.com";
    }
}
