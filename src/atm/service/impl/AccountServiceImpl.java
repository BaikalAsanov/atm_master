package atm.service.impl;

import atm.dao.AccountDao;

import java.util.Random;
import java.util.Scanner;

public class AccountServiceImpl {
    private final AccountDao accountDao = new AccountDao();
    private final Random random = new Random();
    private final Scanner scanner = new Scanner(System.in);
}
