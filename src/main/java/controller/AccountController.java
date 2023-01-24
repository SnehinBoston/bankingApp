package controller;
import model.Accounts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import service.AccountService;
@RestController
@RequestMapping("/accounts")
public class AccountController {
    @Autowired
    private AccountService accountService;
    private final AccountController accountInfo;

    @Autowired
    public AccountController(final AccountController accountInfo){
        this.accountInfo = accountInfo;
    }
    @GetMapping("/showNewAccountForm")
    public String showNewAccountForm(Model model) {
        Accounts newAccount = new Accounts();
        model.addAttribute("account", newAccount);
        return "new_account";
    }
    @GetMapping("/{id}")
    public String getAccountsById(@PathVariable Long id, Model model){
        if (id != null){
            Accounts accountInfo = accountService.getAccountsById(id);
            model.addAttribute("account", accountInfo);
            return "account_details";
        }
        else{
            return "Account missing";
        }
    }
    @PostMapping("/saveAccount")
    public String saveAccount(@ModelAttribute("account") Accounts account) {
        accountService.saveAccount(account);
        return "redirect:/";
    }

}
