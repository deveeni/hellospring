package kr.ac.sungkyul.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping( "/blog/*" ) //보통메서드 이름이랑 매핑이랑 같은 메서드이름 쓰기 때문에  이렇게하면 메서드가 들어감
public class BlogController {

	@ResponseBody
	@RequestMapping //생략( "/list" )
	public String list( 
			//HttpServletRequest request, //이렇게 쓸 수가 있어요 원래 그러나 POJO 에는 기술적인기술은 들어가면 안됩니다.
			//밖으로 빼야한다. 그걸 dispatchservlet이 해주는거
			@RequestParam( "p" ) int page,
			@RequestParam( "n" ) String name ){
		
		//String p = request.getParameter( "p" ); 
		
		System.out.println( "page : " + page );
		System.out.println( "name : " + name );
		common();
		return "BlogController:list()";
	}
	
	@ResponseBody
	@RequestMapping  //생략( "/add" )
	public String add(){
		return "BlogController:add()";
	}
	
	
	private void common(){
		System.out.println( "common() called" );
	}
}
