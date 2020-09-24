package com.example.demo.presentation.ctl;

import java.util.List;

import com.example.demo.domain.users.User;
import com.example.demo.usecase.service.AccountService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import lombok.extern.slf4j.Slf4j;

@Controller
@Slf4j
public class IndexController {
    private final AccountService accountService;

    public IndexController(AccountService accountService) {
        this.accountService = accountService;
    }

    /**
     * トップページ
     *
     * @param signupForm サインアップフォームデータ
     * @param model      モデル（ユーザーリスト）
     * @return index
     */
    @GetMapping(value = "/top")
    public String index(@ModelAttribute("signup") SignupForm signupForm, Model model) {
        List<User> userList = accountService.findAll();
        model.addAttribute("users", userList);
        return "top";
    }

    /**
     * アカウント登録処理
     *
     * @param signupForm         サインアップフォームデータ
     * @param redirectAttributes リダイレクト先へメッセージを送るため
     * @return index (redirect)
     */
    @PostMapping(value = "signup")
    public String signup(@ModelAttribute("signup") SignupForm signupForm, RedirectAttributes redirectAttributes) {
        // TODO 暫定的に2つのロールを付与する
        String[] roles = { "ROLE_USER", "ROLE_ADMIN" };
        accountService.register(signupForm.getName(), signupForm.getEmail(), signupForm.getPassword(), roles);
        redirectAttributes.addFlashAttribute("successMessage", "アカウントの登録が完了しました");
        return "redirect:/top";
    }
}
