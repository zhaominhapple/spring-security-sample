package cn.com.taiji.controller;

import java.util.ArrayList;
import java.util.List;

import cn.com.taiji.domain.User;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


/**
 * 用户控制器.
 *
 */
@RestController
@RequestMapping("/users")
public class UserController {

	/**
	 * 查询所用用户
	 * @return
	 */
	@GetMapping
	public ModelAndView list(Model model) {

		List<User> list = new ArrayList<>();	// 当前所在页面数据列表
		list.add(new User(1L, "zhaozhao", 30));
		list.add(new User(2L,"andy", 29));
		model.addAttribute("title", "用户管理");
		model.addAttribute("userList", list);
		return new ModelAndView("users/list", "userModel", model);
	}
 

}
