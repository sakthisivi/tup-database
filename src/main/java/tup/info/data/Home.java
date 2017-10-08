package tup.info.data;


import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class Home {
	
@RequestMapping(value={"/","/home"})

public String home()
{
	return "welcome";
}
}
