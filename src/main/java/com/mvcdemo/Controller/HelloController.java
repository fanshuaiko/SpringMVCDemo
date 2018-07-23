package com.mvcdemo.Controller;


import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.mvcdemo.Entity.Employee;
import com.mvcdemo.Services.EmployeeServices;

@Controller
@RequestMapping("/Employee")
public class HelloController {

	@Autowired
	private EmployeeServices employeeServices;
	
	public void setEmployeeServices(EmployeeServices employeeServices) {
		this.employeeServices = employeeServices;
	}

	@RequestMapping("/helloSpringMVC")
	public String helloSpringMVC() {
		return "home";
	}
	
	//本方法将处理 /SpringMVCDemo/Employee/findEmployeeById?id=123 形式的URL
	@RequestMapping(value="/findEmployeeById",method=RequestMethod.GET)
	public String findEmployeeById(@RequestParam("id")Integer id,Model model) {
		Employee employee = employeeServices.getEmployeeById(id);
		model.addAttribute(employee);
		return "showEmployee";
	}
	
	//本方法处理 /SpringMVCDemo/Employee/findEmployeeById2/{id}/{idd}形式的URL
	@GetMapping("/findEmployeeById2/{id}/{idd}")
	public String findEmployeeById2(@PathVariable("id") Integer id,@PathVariable("idd") String idd,Model model) {
		System.out.println("id : " + id);
		System.out.println("idd : " + idd);
		Employee employee = employeeServices.getEmployeeById(id);
		model.addAttribute(employee);
		return "showEmployee";
	}
	
	//使用传统的HttpServletRequest，(session)等其他的也一样
	// 处理/SpringMVCDemo/Employee/findEmployeeById3?id=123 形式的URL
	@GetMapping("/findEmployeeById3")
	public String findEmployeeById3(HttpServletRequest request) {
		Integer id = Integer.parseInt(request.getParameter("id"));
		Employee employee = employeeServices.getEmployeeById(id);
		request.setAttribute("employee",employee);
		return "showEmployee";
	}
	
	//将转到editEmployee.jsp
	@GetMapping(value="/editEmployee",params="edit")
	public String editEmployee() {
		return "editEmployee";
	}
	//数据绑定，将编辑编辑页面传入的表单数据绑定到employee中
	@PostMapping("/saveEmployee")
	public String saveEmployee(Employee employee) {
		
		//再次进行数据操作，比如数据的持久化
		System.out.println(employee);
		
		return "redirect:findEmployeeById?id=" + employee.getId();
	}
	
	//跳转到file.jsp文件上传下载页面
	@RequestMapping("/file")
	public String file() {
		return "file";
	}
	
	//文件上传
	@PostMapping("/fileUpload")
	public String fileUpload(@RequestParam("file") MultipartFile file) throws IllegalStateException, IOException {
		if(!file.isEmpty()) {
			String path  = "E:\\临时文件";
			File desFile = new File(path);
			if(!desFile.exists()) {
				desFile.mkdirs();
			}
			file.transferTo(new File(path+System.currentTimeMillis()+file.getOriginalFilename()));
		}
		return "success";
	}
}








