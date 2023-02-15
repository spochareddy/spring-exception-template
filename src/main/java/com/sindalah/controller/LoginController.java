package com.sindalah.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.sindalah.entity.UserInfo;
import com.sindalah.exception.BusinessException;

@RestController
@RequestMapping({ "/api/v1/login" })
public class LoginController {

	private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

	@PostMapping
	@ResponseBody
	String login(@RequestBody UserInfo user) throws BusinessException {

		if (user.getUserName() == null || user.getPassword() == null) {
			logger.info("Exception is thrown");
			throw new BusinessException("UserName or Password is Empty");
		}

		return "success";
	}

}
