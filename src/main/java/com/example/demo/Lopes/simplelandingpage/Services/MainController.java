package com.example.demo.Lopes.simplelandingpage.Services;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.Lopes.simplelandingpage.Models.User;
import com.example.demo.Lopes.simplelandingpage.Repositories.UserRepository;

@Controller
@RequestMapping(path="/demo")
public class MainController {
  @Autowired 
  private UserRepository userRepository;

  @RequestMapping(value = "/add", method = RequestMethod.POST)
  public @ResponseBody String addNewUser (@RequestParam String name
      , @RequestParam String email, @RequestParam String mensagem, @RequestParam String situacao){
    
    User n = new User();
    n.setNome(name);
    n.setEmail(email);
    n.setMensagem(mensagem);
    n.setSituacao(situacao);
    userRepository.save(n);
    return "Saved";
  }

  @GetMapping(path="/all")
  public @ResponseBody Iterable<User> getAllUsers() {
    return userRepository.findAll();
  }
}
