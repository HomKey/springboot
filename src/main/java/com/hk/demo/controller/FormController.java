package com.hk.demo.controller;

import com.hk.base.web.BaseController;
import com.hk.demo.dto.LombokUserDTO;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

/**
 * Created by LuHj on 2018/7/25.
 */
@Controller
@RequestMapping("/form")
public class FormController extends BaseController{

    @GetMapping
    public String showForm(LombokUserDTO lombokUserDTO) {
        return "form";
    }

    @PostMapping
    public String checkPersonInfo(@Valid LombokUserDTO lombokUserDTO, BindingResult bindingResult) {
        return "redirect:/index";
    }

    public static void main(String[] args) {
        System.out.println(5%2);
    }
}
