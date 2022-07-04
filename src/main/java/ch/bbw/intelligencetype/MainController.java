package ch.bbw.intelligencetype;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;

@Controller
public class MainController {

    @GetMapping("")
    public String home(){
        return "intelligence-template";
    }

    @GetMapping("/test")
    public String test(Model model){
        ArrayList<Questions> questions = new ArrayList<>();
        for (Questions question : Questions.values()){
            questions.add(question);
        }
        model.addAttribute("questions", questions);
        return "test";
    }

    @GetMapping("/result")
    public String result(){
        return "result";
    }

}
