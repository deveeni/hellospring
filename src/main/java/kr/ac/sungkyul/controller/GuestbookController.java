package kr.ac.sungkyul.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//메서드 단독 매핑

@Controller
public class GuestbookController {
	
	@RequestMapping( "/guestbook/list" )
	@ResponseBody
	public String list( @RequestParam int page ){
		System.out.println( "page : " + page );
		return "Guestbookcontroller:list()";
	}
	
	@RequestMapping( "/guestbook/deleteform" )
	@ResponseBody
	public String deleteform( 
		@RequestParam( value="no", required=false, defaultValue="-1") Long no ){
		//사용자가 값을 안넣어도됨 defalt지정 
		System.out.println( no );
		return "Guestbookcontroller:deleteForm()";
	}

}
