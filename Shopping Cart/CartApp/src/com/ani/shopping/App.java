package com.ani.shopping;

import com.ani.shopping.user.UserMenu;

public class App {
    public static void main(String[] args) throws Exception {

        UserMenu menu = new UserMenu();
        menu.performAction();
    }
}