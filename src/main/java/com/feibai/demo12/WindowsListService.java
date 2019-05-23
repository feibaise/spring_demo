package com.feibai.demo12;

/**
 * @Author: ${user}
 * @description:
 * @Date: Created in 16:02 2019/5/23
 * @Modfied by: ${user}
 * @Modfied Date by: 16:02 2019/5/23
 */
public class WindowsListService implements ListService {
    @Override
    public String showListCmd() {
        return "dir";
    }
}
