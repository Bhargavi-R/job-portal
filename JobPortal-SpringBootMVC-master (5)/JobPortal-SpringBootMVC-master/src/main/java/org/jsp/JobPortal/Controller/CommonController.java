package org.jsp.JobPortal.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.http.HttpSession;

@Controller
public class CommonController 
{
    @GetMapping("/")
    public String loadHome()
    {
    	return "Home";
    }
    
    @GetMapping("/logout")
    public String logout(HttpSession session, ModelMap map)
    {
    	session.invalidate();
    	map.put("pass", "Logout Success");
    	return "Home";
    }
}
