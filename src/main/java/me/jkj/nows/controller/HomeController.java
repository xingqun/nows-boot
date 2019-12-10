package me.jkj.nows.controller;

import me.jkj.nows.entity.SoulEntity;
import me.jkj.nows.dao.SoulMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @Autowired
    private SoulMapper soulMapper;

    @RequestMapping("/")
    public ModelAndView index() {

        SoulEntity soul = soulMapper.getOne();
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("soul", soul);
        return modelAndView;
    }

    @RequestMapping("/api")
    @ResponseBody
    public Object api() {
        SoulEntity soul = soulMapper.getOne();
        return soul;
    }
}
